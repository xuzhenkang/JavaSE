package javase.jdk7_new;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * ����1+2+3+4�Ľ��
 * @author lenovo
 *
 */
public class Demo01_ForkJoin extends RecursiveTask<Integer> {
	private static final long serialVersionUID = 1L;
	private static final int THRESHOLD = 2; // ��ֵ
	private int start;
	private int end;
	
	public Demo01_ForkJoin(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		int sum = 0;
		
		// ��������㹻С�ͼ�������
		boolean canCompute = (end - start) <= THRESHOLD;
		
		if (canCompute) {
			for (int i = start; i <= end; i++) {
				sum += i;
			}
		} else {
			// ������������ֵ���ͷ��ѳ��������������
			int middle = (start + end) / 2;
			Demo01_ForkJoin leftTask = new Demo01_ForkJoin(start, middle);
			Demo01_ForkJoin rightTask = new Demo01_ForkJoin(middle + 1, end);
			// ִ��������
			leftTask.fork();
			rightTask.fork();
			
			// �ȴ�������ִ���꣬���õ�����
			int leftResult = leftTask.join();
			int rightResult = rightTask.join();
			
			// �ϲ�������
			sum = leftResult + rightResult;
		}
		return sum;
	}
	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		// ����һ���������񣬸������1+2+3+4+...+100
		Demo01_ForkJoin task = new Demo01_ForkJoin(1, 100);
		// ִ��һ������
		Future<Integer> result = forkJoinPool.submit(task);
		try {
			System.out.println(result.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
/*
ͨ���������������������һ���˽�ForkJoinTask��ForkJoinTask��һ����������Ҫ������������Ҫʵ��compute����������������������Ҫ�ж������Ƿ��㹻С������㹻С��ֱ��ִ������������㹻С���ͱ���ָ������������ÿ���������ڵ���fork����ʱ���ֻ����compute������������ǰ�������Ƿ���Ҫ�����ָ���������������Ҫ�����ָ��ִ�е�ǰ�����񲢷��ؽ����ʹ��join������ȴ�������ִ���겢�õ�������
 */

package javase.jdk7_new;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * 计算1+2+3+4的结果
 * @author lenovo
 *
 */
public class Demo01_ForkJoin extends RecursiveTask<Integer> {
	private static final long serialVersionUID = 1L;
	private static final int THRESHOLD = 2; // 阈值
	private int start;
	private int end;
	
	public Demo01_ForkJoin(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		int sum = 0;
		
		// 如果任务足够小就计算任务
		boolean canCompute = (end - start) <= THRESHOLD;
		
		if (canCompute) {
			for (int i = start; i <= end; i++) {
				sum += i;
			}
		} else {
			// 如果任务大于阈值，就分裂成两个子任务计算
			int middle = (start + end) / 2;
			Demo01_ForkJoin leftTask = new Demo01_ForkJoin(start, middle);
			Demo01_ForkJoin rightTask = new Demo01_ForkJoin(middle + 1, end);
			// 执行子任务
			leftTask.fork();
			rightTask.fork();
			
			// 等待子任务执行完，并得到其结果
			int leftResult = leftTask.join();
			int rightResult = rightTask.join();
			
			// 合并子任务
			sum = leftResult + rightResult;
		}
		return sum;
	}
	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		// 生成一个计算任务，负责计算1+2+3+4+...+100
		Demo01_ForkJoin task = new Demo01_ForkJoin(1, 100);
		// 执行一个任务
		Future<Integer> result = forkJoinPool.submit(task);
		try {
			System.out.println(result.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
/*
通过这个例子让我们再来进一步了解ForkJoinTask，ForkJoinTask与一般的任务的主要区别在于它需要实现compute方法，在这个方法里，首先需要判断任务是否足够小，如果足够小就直接执行任务。如果不足够小，就必须分割成两个子任务，每个子任务在调用fork方法时，又会进入compute方法，看看当前子任务是否需要继续分割成孙任务，如果不需要继续分割，则执行当前子任务并返回结果。使用join方法会等待子任务执行完并得到其结果。
 */

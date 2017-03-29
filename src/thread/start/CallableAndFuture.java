package thread.start;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Callable��Future������������˼�ģ�һ�����������һ���õ������
 * Callable�ӿ�������Runnable�������־Ϳ��Կ������ˣ�����Runnable���᷵�ؽ����
 * �����޷��׳����ؽ�����쳣����Callable���ܸ�ǿ��һЩ�����߳�ִ�к󣬿��Է���ֵ��
 * �������ֵ���Ա�Future�õ���Ҳ����˵��Future�����õ��첽ִ������ķ���ֵ�� ��������һ���򵥵����ӣ�
 * 
 * @author kang
 *
 */
public class CallableAndFuture {
	public static void main(String[] args) {
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return new Random().nextInt(100);
			}
		};
		FutureTask<Integer> future = new FutureTask<Integer>(callable);
		new Thread(future).start();
		try {
			Thread.sleep(5000);// ������һЩ����
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
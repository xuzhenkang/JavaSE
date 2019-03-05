package javase.thread.other;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2_Executors {

	/**
	 * public static ExecutorService newFixedThreadPool(int nThreads)
	 * public static ExecutorService newSingleThreadExecutor()
	 */
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);//�����̳߳�
		pool.submit(new MyRunnable());				//���̷߳Ž������ﲢִ��
		pool.submit(new MyRunnable());
		
		pool.shutdown();							//�ر��̳߳�
	}

}

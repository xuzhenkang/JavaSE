package javase.thread.volatile_keyword;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h4>����synchronized�ķ�ʽ</h4>
 * @author Kang
 *
 */
public class Demo2_VolatileSolution1 {
	private volatile int inc = 0;

	/**
	 * volatile�ؼ����ܱ�֤�ɼ���û�д���������ĳ������û�ܱ�֤ԭ���ԡ��ɼ���ֻ�ܱ�֤ÿ�ζ�ȡ�������µ�ֵ������volatileû�취��֤�Ա����Ĳ�����ԭ���ԡ�
	 */
	public synchronized void increase() {
		this.inc++; // ������������ԭ���Բ�������˵��½������ȷ
	}

	AtomicInteger a;

	public static void main(String[] args) {

		final Demo2_VolatileSolution1 t = new Demo2_VolatileSolution1();

		for (int i = 0; i < 100; i++) {
			new Thread() {

				@Override
				public void run() {
					for (int j = 0; j < 1000; j++) {
						t.increase();
					}
				}

			}.start();
		}

		while (Thread.activeCount() > 1) { // ��֤ǰ����̶߳�ִ����
			Thread.yield();
		}
		System.out.println(t.getInc());
	}

	public int getInc() {
		return inc;
	}
}

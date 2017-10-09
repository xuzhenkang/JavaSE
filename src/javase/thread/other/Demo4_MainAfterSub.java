package javase.thread.other;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * ����java���̵߳ȴ��������߳�ִ�������ִ�С�
 * ���������ʵ�����ڹ����о������õ��������û��µ�һ����Ʒ����̨����һϵ�еĴ���Ϊ�����Ч�ʣ�ÿ������������һ���߳���ִ�У����д��������֮��Ż᷵�ظ��û��µ��ɹ�
 * 
 * @author Dan
 *
 */
public class Demo4_MainAfterSub {
	// ��sleep�����������߳�˯��һ��ʱ�䣬��Ȼ���˯��ʱ�������۵�ʱ�䣬�������Լ����ģ�����������Ƽ������������ﻹ��дһ�£��Ͼ��ǽ������
	public static void method1() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("���߳�ִ��!");
				}
			}).start();
		}
		Thread.sleep(5000);
		System.out.println("���߳�ִ��!");
	}
	// ʹ��Thread��join()�ȴ����е����߳�ִ����ϣ����߳���ִ�С�
	// thread.join()��ָ�����̼߳��뵽��ǰ�̣߳����Խ���������ִ�е��̺߳ϲ�Ϊ˳��ִ�е��̡߳�
	// �������߳�B�е������߳�A��join()������ֱ���߳�Aִ����Ϻ󣬲Ż����ִ���߳�B��
	public static void method2() throws InterruptedException {
		Thread[] threads = new Thread[5];
		for (int i = 0; i < 5; i++) {
			threads[i] = new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("���߳�ִ��!");
				}
			});
			threads[i].start();
		}
		for (int i = 0; i < 5; i++)
			threads[i].join();
		System.out.println("���߳�ִ��!");
	}
	// �ȴ����߳���ɵ�CountDownLatch
	// ������˵��һ�㣬countDownLatch���������³�ʼ�������޸�CountDownLatch�����ڲ���������ֵ��һ���̵߳���countdown����happen-before����һ���̵߳���await����
	public static void method3() throws InterruptedException {
		final CountDownLatch latch = new CountDownLatch(5);
		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("���߳�ִ��!");
					latch.countDown(); // ��latch�е���ֵ��1
				}
			}).start();
		}
		latch.await(); // ������ǰ�߳�ֱ��latch�е�ֵΪ0
		System.out.println("���߳�ִ��!");
	}
	// ͬ������CyclicBarrier
	public static void method4() throws InterruptedException, BrokenBarrierException {
		final CyclicBarrier barrier = new CyclicBarrier(5);
		for (int i = 0; i < 4; i++) {
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("���߳�ִ��!");
					try {
						barrier.await(); // ��������
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (BrokenBarrierException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
		}
		barrier.await();
		System.out.println("���߳�ִ��!");
	}
	
	
	/*
	 * countDownLatch��cyclicBarrier��ʲô�����أ�
	 * ���ǵ�����countDownLatchֻ��ʹ��һ�Σ���CyclicBarrier��������ʹ��reset()�������ã�����CyclicBarrier���������ܴ����Ϊ���ӵ�ҵ�񳡾���
	 * �����������Ͽ���һ������countDownLatch��cyclicBarrier�����������
	 * �����ڰ������ܵı�������ʹ�� countDownLatch�Ļ�����յ���һ���˾͸���ί����һ���˵ĳɼ���
	 * 10���˱�������10�Σ������CyclicBarrier����ֻ�����һ���˳���յ��ߵ�ʱ���������˵����ݣ���������һ�Σ����������
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("����1");
		method1();
		System.out.println("����2");
		method2();
		System.out.println("����3");
		method3();
		System.out.println("����4");
		method4();
	}
}

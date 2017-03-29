package thread.start;

import java.util.concurrent.FutureTask;

public class MethodTest {
	public static void main(String[] args) {
		// ����1���̳�Thread����дrun������ʹ��start()��������
		new MethodOne("��������1").start();
		
		
		// ����2��ʵ��Runnable�ӿڣ���дrun���������������Thread������ȥ������Thread�����start���������߳�
		new Thread(new MethodTwo(), "��������2").start();
		
		
		// ����3��ʵ��Callable�ӿڣ����巵��ֵ���ͣ���дcall������
		// ��������Ϊ����ʵ������FutureTaskʵ����ȥ���ٽ�FutureTaskʵ������һ��Thread������ȥ��ʹ��Thread��start����������
		// �ô������з���ֵ
		new Thread(new FutureTask<Integer>(new MethodThree()), "��������3 ").start();
	}
}

package thread.test;

public class MyThread extends Thread {
	Sync s = null;
	String threadname;
	@Override
	public void run() {
		System.out.println(threadname+"���п�ʼ");
		s.setXY(5);
		System.out.println(threadname + "���н����" + s.check());
		System.out.println(threadname+"���н���");
	}
	public MyThread(Sync s, String threadname) {
		this.s = s;
		this.threadname = threadname;
	}
}

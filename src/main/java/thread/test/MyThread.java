package thread.test;

public class MyThread extends Thread {
	Sync s = null;
	String threadname;
	@Override
	public void run() {
		System.out.println(threadname+"运行开始");
		s.setXY(5);
		System.out.println(threadname + "运行结果：" + s.check());
		System.out.println(threadname+"运行结束");
	}
	public MyThread(Sync s, String threadname) {
		this.s = s;
		this.threadname = threadname;
	}
}

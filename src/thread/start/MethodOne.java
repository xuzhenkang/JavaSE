package thread.start;

/**
 * �����̵߳����ַ�ʽ����һ
 * @author kang
 *
 */
public class MethodOne extends Thread {
	@Override
	public void run() {
		System.out.println("MethodOne");
	}
	public MethodOne(String s) {
		super(s);
	}
}

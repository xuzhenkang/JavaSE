package thread.start;

/**
 * 启动线程的三种方式，其一
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

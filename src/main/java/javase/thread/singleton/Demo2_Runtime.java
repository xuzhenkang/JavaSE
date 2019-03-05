package javase.thread.singleton;

import java.io.IOException;

public class Demo2_Runtime {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();			//获取运行时对象
		//r.exec("shutdown -s -t 300");
		r.exec("shutdown -a");
	}
	// Runtime就是饿汉式单例模式
}

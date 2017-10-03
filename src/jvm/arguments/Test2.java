package jvm.arguments;

public class Test2 {
	public static void main(String[] args) {
		
		// 第一次配置:
		// -Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		// 第二次配置:
		// -Xms20m -Xmx20m -Xmn7m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		// 第三次配置:
		// -Xms20m -Xmx20m -XX:NewRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		
		byte[] b = null;
		for (int i = 0; i < 10; i++)
			b = new byte[1 * 1024 * 1024];
		
		
	}
}

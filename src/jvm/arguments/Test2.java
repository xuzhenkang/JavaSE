package jvm.arguments;

public class Test2 {
	public static void main(String[] args) {
		
		// ��һ������:
		// -Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		// �ڶ�������:
		// -Xms20m -Xmx20m -Xmn7m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		// ����������:
		// -Xms20m -Xmx20m -XX:NewRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		
		byte[] b = null;
		for (int i = 0; i < 10; i++)
			b = new byte[1 * 1024 * 1024];
		
		
	}
}

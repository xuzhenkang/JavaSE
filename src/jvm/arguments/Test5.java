package jvm.arguments;

public class Test5 {
	public static void main(String[] args) {
		// ��ʼ���Ķ�����eden��
		// ������-Xmx64M -Xms64M -XX:+PrintGCDetails
//		for (int i = 0; i < 5; i++) {
//			byte[] b = new byte[1024 * 1024];
//		}
		
		
		// ���Խ���������Ķ���
		// ������ -Xmx1024M -Xms1024M -XX:+UseSerialGC -XX:MaxTenuringThreshold=15 -XX:+PrintGCDetails 
		// -XX:+PrintHeapAtGC
		
		for (int k = 0; k < 20; k++) {
			for (int j = 0; j < 300; j++) {
				byte[] b = new byte[1024 * 1024]; // 1M
			}
		}
	}
}

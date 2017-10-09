package jvm.arguments;

import java.util.HashMap;
import java.util.Map;

public class Test6 {
	public static void main(String[] args) {
		// ������ -Xmx30M -Xms30M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1024000
//		Map<Integer, byte[]> m = new HashMap<>();
//		for (int i = 0; i < 5; i++) {
//			byte[] b = new byte[1024 * 1024]; // 1M
//			m.put(i, b);
//		}
		
		
		// ������������ԭ��Ϊ������������������Ķ�������Ȱ����ݷ��䵽TLAB�����У���˾�ʧȥ�������������Ļ���,�ڲ��������-XX:-UseTLAB����ȡ��TLAB����
		// ������-Xmx30M -Xms30M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000 
		// -XX:-UseTLAB
		Map<Integer, byte[]> m = new HashMap<>();
		for (int i = 0; i < 5 * 1024; i++) {
			byte[] b = new byte[1024]; // 1K
			m.put(i, b);
		}
		
	}
}

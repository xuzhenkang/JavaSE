package jvm.arguments;

import java.util.HashMap;
import java.util.Map;

public class Test6 {
	public static void main(String[] args) {
		// 参数： -Xmx30M -Xms30M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1024000
//		Map<Integer, byte[]> m = new HashMap<>();
//		for (int i = 0; i < 5; i++) {
//			byte[] b = new byte[1024 * 1024]; // 1M
//			m.put(i, b);
//		}
		
		
		// 造成这种现象的原因为：虚拟机对于体积不大的对象会优先把数据分配到TLAB区域中，因此就失去了在老年代分配的机会,在参数中添加-XX:-UseTLAB即可取消TLAB区域
		// 参数：-Xmx30M -Xms30M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000 
		// -XX:-UseTLAB
		Map<Integer, byte[]> m = new HashMap<>();
		for (int i = 0; i < 5 * 1024; i++) {
			byte[] b = new byte[1024]; // 1K
			m.put(i, b);
		}
		
	}
}

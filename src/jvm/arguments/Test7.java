package jvm.arguments;

public class Test7 {
	public static void alloc() {
		byte[] b = new byte[2];
	}
	public static void main(String[] args) {
		
		// TLAB分配
		// 参数： -XX:+UseTLAB -XX:+PrintTLAB -XX:+PrintGC -XX:TLABSize=102400 -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis
		// 对比参数：-XX:-UseTLAB -XX:+PrintTLAB -XX:+PrintGC -XX:TLABSize=102400 -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			alloc();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		// 当禁用了TLAB的时候， 性能下降
	}
}

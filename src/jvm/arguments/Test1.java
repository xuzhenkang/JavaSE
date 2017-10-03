package jvm.arguments;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("--------------------");
		System.out.println("freeMemory:" + Runtime.getRuntime().freeMemory());
		System.out.println("totalMemory:" + Runtime.getRuntime().totalMemory());
		System.out.println("maxMemory:" + Runtime.getRuntime().maxMemory());
		byte[] a = new byte[1*1024*1024];
		System.out.println("----创建了1M的对象------");
		System.out.println("freeMemory:" + Runtime.getRuntime().freeMemory());
		System.out.println("totalMemory:" + Runtime.getRuntime().totalMemory());
		System.out.println("maxMemory:" + Runtime.getRuntime().maxMemory());
		byte[] b = new byte[4*1024*1024];
		System.out.println("----创建了4M的对象------");
		System.out.println("freeMemory:" + Runtime.getRuntime().freeMemory());
		System.out.println("totalMemory:" + Runtime.getRuntime().totalMemory());
		System.out.println("maxMemory:" + Runtime.getRuntime().maxMemory());
		System.out.println("--------------------");
		
	}
}

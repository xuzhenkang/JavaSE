package jvm.arguments;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("--------------------");
		System.out.println("freeMemory:" + Runtime.getRuntime().freeMemory());
		System.out.println("totalMemory:" + Runtime.getRuntime().totalMemory());
		System.out.println("maxMemory:" + Runtime.getRuntime().maxMemory());
		byte[] a = new byte[1*1024*1024];
		System.out.println("----������1M�Ķ���------");
		System.out.println("freeMemory:" + Runtime.getRuntime().freeMemory());
		System.out.println("totalMemory:" + Runtime.getRuntime().totalMemory());
		System.out.println("maxMemory:" + Runtime.getRuntime().maxMemory());
		byte[] b = new byte[4*1024*1024];
		System.out.println("----������4M�Ķ���------");
		System.out.println("freeMemory:" + Runtime.getRuntime().freeMemory());
		System.out.println("totalMemory:" + Runtime.getRuntime().totalMemory());
		System.out.println("maxMemory:" + Runtime.getRuntime().maxMemory());
		System.out.println("--------------------");
		
	}
}

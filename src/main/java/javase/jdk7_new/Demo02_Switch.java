package javase.jdk7_new;

public class Demo02_Switch {
	public static void main(String[] args) {
		String s = "1234";
		switch (s) {
		case "1234":
			System.out.println("好使1");
		default:
			System.out.println("好使2");
		}
	}
}

package designpattern.factory.simplefactory;

public class Test {
	public static void main(String[] args) {
		Car c1 = CarFactory.createAudi();
		Car c2 = CarFactory.createByd();
		c1.run();
		c2.run();
	}
}

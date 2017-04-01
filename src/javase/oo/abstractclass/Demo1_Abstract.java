package javase.oo.abstractclass;

public class Demo1_Abstract {
	public static void main(String[] args) {
		//Animal a = new Animal(); // 错误：Animal是抽象的，无法实例化
		Animal a = new Cat();
		a.eat();
	}
}

abstract class Animal {						// 抽象类
	public abstract void eat();				// 抽象方法
}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
}
/**
- A:抽象类概述

- 抽象就是看不懂的
- B:抽象类特点
- a:抽象类和抽象方法必须用abstract关键字修饰
    - abstract class 类名 {}
    - public abstract void eat();
- b:抽象类不一定有抽象方法，有抽象方法的类一定是抽象类或者接口
- c:抽象类不能实例化，那么，抽象类如何实例化呢？

    - 按照多态的方式，由具体的子类实例化。其实这也是多态的一种，抽象类多态。
- d:抽象类的子类

    - 要么是抽象类

    - 要么重写抽象类中的所有抽象方法
- C:案例演示

- 抽象类特点
*/
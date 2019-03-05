package javase.oo.polymorphic;
/*
 * - A:多态的好处
    - a:提高了代码的维护性(继承保证)
    - b:提高了代码的扩展性(有多态保证)
- B:案例演示

    - 多态的好处

    - 可以当作形式参数，可以接收任意子类对象
- C:多态的弊端

    - 不能使用子类的特有属性和行为。
- D:案例演示 method(Animal a) method(Cat c)
 */
public class Demo4_Animal {
	public static void main(String[] args) {
/*		Cat1 c1 = new Cat1();
		c1.eat();*/
		method(new Cat1());
		// Cat1 c = new Dog();//错误
		method(new Dog());
	}
	// 开发的是很少在创建对象的时候用父类引用指向子类对象，直接创建子类对象更方便，可以使用子类中的特有属性和行为
/*	public static void method(Cat1 c) {
		c.eat();
	}
	public static void method(Dog d) {
		d.eat();
	}*/
	// 当作参数的时候用多态最好，因为扩展性强
	public static void method(Animal1 a) {
		
		// 如果把狗强转成猫就会出现类型转换异常，ClassCastException
		// 关键字instanceof 判断前边的引用是否是后边的数据类型
		if (a instanceof Cat1) {
			Cat1 c = (Cat1) a;
			c.eat();
			c.catchMouse();
		} else if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.eat();
			d.lookHome();
		} else {
			a.eat();
		}
	}
}

class Animal1 {
	public void eat() {
		System.out.println("动物吃饭");
	}
}
class Cat1 extends Animal1 {
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal1 {
	public void eat() {
		System.out.println("狗吃肉");
	}
	public void lookHome() {
		System.out.println("看家");
	}
}
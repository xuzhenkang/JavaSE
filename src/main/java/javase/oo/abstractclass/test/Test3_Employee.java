package javase.oo.abstractclass.test;

/*
 * - A:案例演示

    - 假如我们在开发一个系统时需要对程序员类进行设计，程序员包含3个属性：姓名、工号以及工资。

    - 经理，除了含有程序员的属性外，另外还有一个奖金属性。

    - 请使用继承的思想设计出程序员类和经理类。要求类中提供必要的方法进行属性访问。
 */
public class Test3_Employee {
	public static void main(String[] args) {
		Coder c = new Coder("德玛西亚", "007", 8000);
		c.work();
		Manager m = new Manager("苍老师", "9527", 3000, 20000);
		m.work();
	}
}

abstract class Employee {
	private String name;
	private String id;
	private double salary;
	
	public Employee() {
	}

	public Employee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public abstract void work();
}

class Coder extends Employee {
	public Coder(){}
	public Coder(String name, String id, double salary){
		super(name, id, salary);
	}
	@Override
	public void work() {
		System.out.println("我的名字是：" + this.getName() + "我的工号: " + this.getId() + "我的工资：" + this.getSalary());
	}
}
class Manager extends Employee {
	private int bonus;

	public Manager(String name, String id, double salary, int bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("我的姓名是：" + this.getName() + "我的工号是：" + this.getId() + "我的工资是：" + this.getSalary() + "我的奖金是：" + this.bonus);
	}
}


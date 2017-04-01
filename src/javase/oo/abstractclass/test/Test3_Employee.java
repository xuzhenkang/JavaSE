package javase.oo.abstractclass.test;

/*
 * - A:������ʾ

    - ���������ڿ���һ��ϵͳʱ��Ҫ�Գ���Ա�������ƣ�����Ա����3�����ԣ������������Լ����ʡ�

    - �������˺��г���Ա�������⣬���⻹��һ���������ԡ�

    - ��ʹ�ü̳е�˼����Ƴ�����Ա��;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�
 */
public class Test3_Employee {
	public static void main(String[] args) {
		Coder c = new Coder("��������", "007", 8000);
		c.work();
		Manager m = new Manager("����ʦ", "9527", 3000, 20000);
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
		System.out.println("�ҵ������ǣ�" + this.getName() + "�ҵĹ���: " + this.getId() + "�ҵĹ��ʣ�" + this.getSalary());
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
		System.out.println("�ҵ������ǣ�" + this.getName() + "�ҵĹ����ǣ�" + this.getId() + "�ҵĹ����ǣ�" + this.getSalary() + "�ҵĽ����ǣ�" + this.bonus);
	}
}


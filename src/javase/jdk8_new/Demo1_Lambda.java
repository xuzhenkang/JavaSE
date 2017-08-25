package javase.jdk8_new;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo1_Lambda {

	public static void main(String[] args) {
		/*
		 * 例1 用lambda表达式实现Runnable
		 */
		System.out.println("例1 用lambda表达式实现Runnable");
		// Java8 之前
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do!");
			}
		}).start();
		// Java8方式
		new Thread(() -> System.out.println("In Java8, Lambda expression rocks!")).start();
		/*
		 * 例2 使用Java8 lambda表达式进行事件处理
		 */
		System.out.println("例2 使用Java8 lambda表达式进行事件处理");
		JFrame jf = new JFrame("Test");
		JButton show1 = new JButton("Show1");
		JButton show2 = new JButton("Show2");
		jf.setLayout(new FlowLayout());
		jf.add(show1);
		jf.add(show2);
		jf.setSize(200, 100);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Java8之前
		show1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Event handing lambda expression is boring.");
			}
		});
		// Java8方式
		show2.addActionListener((e) -> {
			System.out.println("Light, Camera, Action!! Lambda expression Rocks.");
		});

		/**
		 * 例3 使用Java8 lambda表达式处理Comparator匿名类
		 */
		List<A> list = new ArrayList<>();
		list.add(new A("xuzhenkang"));
		list.add(new A("lixiaodan"));
		list.add(new A("xuxiaokang"));
		list.add(new A("xuxiaodan"));
		/*
		 * Java8之前
		 */
		Collections.sort(list, new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		/* Java8的方式 */
		Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));

		list.forEach(a -> System.out.println(a.name));

		/**
		 * 例4、使用lambda表达式对列表进行迭代
		 */
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		// Java8之前
		for (String feature : features) {
			System.out.println(feature);
		}
		// Java8的方式
		features.forEach(n -> System.out.println(n));
		// 更爽的方法：方法引用
		features.forEach(System.out::println);

		/**
		 * 例5 使用lambda表达式和函数式接口Predicate 
		 * 除了在语言层面支持函数式编程风格，Java 8也添加了一个包，叫做java.util.function。
		 * 它包含了很多类，用来支持Java的函数式编程。其中一个便是Predicate，使用java.util.function.Predicate
		 * 函数式接口以及lambda表达式，可以向API方法添加逻辑，用更少的代码支持更多的动态行为。
		 * 下面是Java 8 Predicate的例子，展示了过滤集合数据的多种常用方法。Predicate接口非常适用于做过滤。
		 */
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		System.out.println("Languages which starts with J :");
	    filter(languages, (str)->str.startsWith("J"));
	 
	    System.out.println("Languages which ends with a ");
	    filter(languages, (str)->str.endsWith("a"));
	 
	    System.out.println("Print all languages :");
	    filter(languages, (str)->true);
	 
	    System.out.println("Print no language : ");
	    filter(languages, (str)->false);
	 
	    System.out.println("Print language whose length greater than 4:");
	    filter(languages, (str)->str.length() > 4);
	}
	public static void filter(List<String> names, Predicate<String> condition) {
	    for(String name : names)  {
	        if(condition.test(name)) {
	            System.out.println(name + " ");
	        }
	    }
	}

}

class A {
	String name;

	public A(String name) {
		this.name = name;
	}
}

package javase.jdk8_new;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		//Java8方式
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
		/*Java8的方式*/
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
		
		
		
	}
	
	
	
}
class A {
	String name;
	public A(String name) {
		this.name = name;
	}
}



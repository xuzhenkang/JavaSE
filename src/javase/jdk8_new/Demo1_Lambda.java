package javase.jdk8_new;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo1_Lambda {

	public static void main(String[] args) {
		/*
		 * ��1 ��lambda���ʽʵ��Runnable
		 */
		System.out.println("��1 ��lambda���ʽʵ��Runnable");
		// Java8 ֮ǰ
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do!");
			}
		}).start();
		// Java8��ʽ
		new Thread(() -> System.out.println("In Java8, Lambda expression rocks!")).start();
		/*
		 * ��2 ʹ��Java8 lambda���ʽ�����¼�����
		 */
		System.out.println("��2 ʹ��Java8 lambda���ʽ�����¼�����");
		JFrame jf = new JFrame("��2");
		JButton show1 = new JButton("Show1");
		JButton show2 = new JButton("Show2");
		jf.setLayout(new FlowLayout());
		jf.add(show1);
		jf.add(show2);
		jf.setSize(200, 100);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Java8֮ǰ
		show1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Event handing lambda expression is boring.");
			}
		});
		// Java8��ʽ
		show2.addActionListener((e) -> {
			System.out.println("Light, Camera, Action!! Lambda expression Rocks.");
		});

		/**
		 * ��3 ʹ��Java8 lambda���ʽ����Comparator������
		 */
		System.out.println("��3 ʹ��Java8 lambda���ʽ����Comparator������");
		List<A> list = new ArrayList<>();
		list.add(new A("xuzhenkang"));
		list.add(new A("lixiaodan"));
		list.add(new A("xuxiaokang"));
		list.add(new A("xuxiaodan"));
		/*
		 * Java8֮ǰ
		 */
		Collections.sort(list, new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		/* Java8�ķ�ʽ */
		Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));

		list.forEach(a -> System.out.println(a.name));

		/**
		 * ��4��ʹ��lambda���ʽ���б���е���
		 */
		System.out.println("��4 ʹ��lambda���ʽ���б���е���");
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		// Java8֮ǰ
		for (String feature : features) {
			System.out.println(feature);
		}
		// Java8�ķ�ʽ
		features.forEach(n -> System.out.println(n));
		// ��ˬ�ķ�������������
		features.forEach(System.out::println);

		/**
		 * ��5 ʹ��lambda���ʽ�ͺ���ʽ�ӿ�Predicate 
		 * ���������Բ���֧�ֺ���ʽ��̷��Java 8Ҳ�����һ����������java.util.function��
		 * �������˺ܶ��࣬����֧��Java�ĺ���ʽ��̡�����һ������Predicate��ʹ��java.util.function.Predicate
		 * ����ʽ�ӿ��Լ�lambda���ʽ��������API��������߼����ø��ٵĴ���֧�ָ���Ķ�̬��Ϊ��
		 * ������Java 8 Predicate�����ӣ�չʾ�˹��˼������ݵĶ��ֳ��÷�����Predicate�ӿڷǳ������������ˡ�
		 */
		System.out.println("��5 ʹ��lambda���ʽ�ͺ���ʽ�ӿ�Predicate");
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
	    /*
	     * ���Կ�����Stream API�Ĺ��˷���Ҳ����һ��Predicate������ζ�ſ��Խ����Ƕ��Ƶ� filter() �����滻��д��������������룬�����lambda���ʽ��ħ����
	     * ���⣬Predicate�ӿ�Ҳ������ж��������Ĳ��ԣ��¸����ӽ�Ҫ������
	     */
	    /**
	     * ��6�������lambda���ʽ�м���Predicate
	     * �ϸ�����˵����java.util.function.Predicate �������������� Predicate �ϳ�һ����
	     * ���ṩ�������߼�������AND��OR�ķ��������ֽ���and()��or()��xor()�����ڽ����� filter() �����������ϲ�������
	     * ���磬Ҫ�õ�������J��ʼ������Ϊ�ĸ���ĸ�����ԣ����Զ������������� Predicate ʾ���ֱ��ʾÿһ��������
	     * Ȼ���� Predicate.and() ���������Ǻϲ�������������ʾ
	     */
	    System.out.println("��6 �����lambda���ʽ�м���Predicate");
	    // ����������and()��or()��xor()�߼��������ϲ�Predicate��
	    // ����Ҫ�ҵ�������J��ʼ������Ϊ�ĸ���ĸ�����֣�����Ժϲ�����Predicate������
	    Predicate<String> startsWithJ = (n) -> n.startsWith("J");
	    Predicate<String> fourLetterLong = (n) -> n.length() == 4;
	    languages.stream()
	    	.filter(startsWithJ.and(fourLetterLong))
	    	.forEach((n) -> System.out.print("nName, which starts with 'J' and four letter long is : " + n));
	    /*
	     * ���Ƶأ�Ҳ����ʹ�� or() �� xor() �������������ؽ���������Ҫ�㣺�ɰ���Ҫ�� Predicate ��Ϊ��������Ȼ����ϲ�����ʹ�á�
	     * �����֮��������Դ�ͳJava���ʽʹ�� Predicate �ӿڣ�Ҳ���Գ������lambda���ʽ�ﵽ�°빦����Ч����
	     */
	    /**
	     * ��7.1��Java 8��ʹ��lambda���ʽ��Map��Reduceʾ��
	     * �����������Ϊ��֪�ĺ���ʽ��̸���map���������㽫�������ת����
	     * �����ڱ����У����ǽ� costBeforeTax �б��ÿ��Ԫ��ת����Ϊ˰���ֵ��
	     * ���ǽ� x -> x*x lambda���ʽ���� map() ���������߽���Ӧ�õ����е�ÿһ��Ԫ�ء�
	     * Ȼ���� forEach() ���б�Ԫ�ش�ӡ������ʹ����API���ռ����࣬���Եõ����к�˰�Ŀ�����
	     * �� toList() �����ķ����� map ���κ����������Ľ���ϲ�������
	     * �����ռ������������ն˲��������֮��㲻���������ˡ���������������API�� reduce() �������������ֺϳ�һ������һ�����ӽ��ὲ����
	     */
	    System.out.println("��7.1 Java 8��ʹ��lambda���ʽ��Map��Reduceʾ��");
	    // ��ʹ��lambda���ʽΪÿ����������12%��˰
	    List<Integer> costBeforeTax1 = Arrays.asList(100, 200, 300, 400, 500);
	    for (Integer cost : costBeforeTax1) {
	        double price = cost + .12*cost;
	        System.out.println(price);
	    }
	    // ʹ��lambda���ʽΪÿ����������12%��˰
	    List<Integer> costBeforeTax2 = Arrays.asList(100, 200, 300, 400, 500);
	    costBeforeTax2.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
	    
	    /**
	     * ��7.2��Java 8��ʹ��lambda���ʽ��Map��Reduceʾ��
	     * ���ϸ������У����Կ���map�������ࣨ�����б�Ԫ�ؽ���ת���ġ�
	     * ����һ�� reduce() �������Խ�����ֵ�ϲ���һ����
	     * Map��Reduce�����Ǻ���ʽ��̵ĺ��Ĳ�������Ϊ�书�ܣ�reduce �ֱ���Ϊ�۵�������
	     * ���⣬reduce ������һ���µĲ��������п����Ѿ���ʹ������
	     * SQL������ sum()��avg() ���� count() �ľۼ�������ʵ���Ͼ��� reduce ��������Ϊ���ǽ��ն��ֵ������һ��ֵ��
	     * ��API����� reduce() �������Խ���lambda���ʽ����������ֵ���кϲ���
	     * IntStream�������������� average()��count()��sum() ���ڽ��������� reduce ������Ҳ��mapToLong()��mapToDouble() ��������ת����
	     * �Ⲣ���������㣬��������ڽ�������Ҳ�����Լ����塣
	     * �����Java 8��Map Reduceʾ����������ȶ����м۸�Ӧ�� 12% ��VAT��Ȼ���� reduce() ���������ܺ͡�
	     */
	    System.out.println("��7.2 Java 8��ʹ��lambda���ʽ��Map��Reduceʾ��");
		 // Ϊÿ����������12%��˰
		 // �Ϸ�����
		 List<Integer> costBeforeTax3 = Arrays.asList(100, 200, 300, 400, 500);
		 double total = 0;
		 for (Integer cost : costBeforeTax3) {
		     double price = cost + .12*cost;
		     total = total + price;
		 }
		 System.out.println("Total : " + total);
	    
		 // �·�����
		 List<Integer> costBeforeTax4 = Arrays.asList(100, 200, 300, 400, 500);
		 double bill = costBeforeTax4.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
		 System.out.println("Total : " + bill);
	    /**
	     * ��8 ͨ�����˴���һ��String�б�
	     * ������Java�������ڴ��ģ�����ϵ�һ�����ò�����������ʹ��lambda���ʽ����API���˴��ģ���ݼ����Ǿ��˵ļ򵥡�
	     * ���ṩ��һ�� filter() ����������һ�� Predicate ���󣬼����Դ���һ��lambda���ʽ��Ϊ�����߼���
	     * �������������lambda���ʽ����Java���ϣ���������⡣
	     * ���⣬���� filter() �����и�������⡣����ʵ�����У������˵�ʱ��ͨ���ᶪ�����֣���ʹ��filter()�������ǻ��һ���µ��б�����ÿ��Ԫ�ط��Ϲ���ԭ��
	     */
		// ����һ���ַ����б�ÿ���ַ������ȴ���2
		 System.out.println("��8 ͨ�����˴���һ��String�б�");
		 List<String> strList = new ArrayList<String>();
		 strList.add("asdadfs");
		 strList.add("das");
		 strList.add("594a");
		 strList.add("dd");
		 List<String> filtered = strList.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
		 System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
		 
		 /**
		  * ��9 ���б��ÿ��Ԫ��Ӧ�ú���
		  * ����ͨ����Ҫ���б��ÿ��Ԫ��ʹ��ĳ��������������һ����ĳ����������ĳ��������������������
		  * ��Щ���������ʺ��� map() ���������Խ�ת���߼���lambda���ʽ����ʽ���� map() ������Ϳ��ԶԼ��ϵĸ���Ԫ�ؽ���ת���ˣ�������ʾ��
		  */
		 System.out.println("��9 ���б��ÿ��Ԫ��Ӧ�ú���");
		// ���ַ������ɴ�д���ö�����������
		 List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		 String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		 System.out.println(G7Countries);
		 
		 /**
		  * ��10 ���Ʋ�ͬ��ֵ������һ�����б�
		  * ����չʾ������������� distinct() �������Լ��Ͻ���ȥ�ء�
		  */
		 System.out.println("��10 ���Ʋ�ͬ��ֵ������һ�����б�");
		// �����в�ͬ�����ִ���һ���������б�
		 List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		 List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		 System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);
		 /**
		  * ��11 ���㼯��Ԫ�ص����ֵ����Сֵ���ܺ��Լ�ƽ��ֵ
		  * IntStream��LongStream �� DoubleStream ���������У��и��ǳ����õķ������� summaryStatistics() ��
		  * ���Է��� IntSummaryStatistics��LongSummaryStatistics ���� DoubleSummaryStatistic s����������Ԫ�صĸ���ժҪ���ݡ�
		  * �ڱ����У���������������������б�����ֵ����Сֵ����Ҳ�� getSum() �� getAverage() ����������б������Ԫ�ص��ܺͼ�ƽ��ֵ��
		  */
		 System.out.println("��11 ���㼯��Ԫ�ص����ֵ����Сֵ���ܺ��Լ�ƽ��ֵ");
		//��ȡ���ֵĸ�������Сֵ�����ֵ���ܺ��Լ�ƽ��ֵ
		 List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		 IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		 System.out.println("Highest prime number in List : " + stats.getMax());
		 System.out.println("Lowest prime number in List : " + stats.getMin());
		 System.out.println("Sum of all prime numbers : " + stats.getSum());
		 System.out.println("Average of all prime numbers : " + stats.getAverage());
		 
	    
	}
	public static void filter(List<String> names, Predicate<String> condition) {
	    for(String name : names)  {
	        if(condition.test(name)) {
	            System.out.println(name + " ");
	        }
	    }
	}
	// ���õİ취
	public static void filter1(List<String> names, Predicate<String> condition) {
	    names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
	        System.out.println(name + " ");
	    });
	}

}

class A {
	String name;

	public A(String name) {
		this.name = name;
	}
}

/**
 * Lambda���ʽ vs ������
 * ��Ȼlambda���ʽ������ʽȡ��Java�����е������ڲ��࣬��ô�б�Ҫ�Զ�����һ���ȽϷ�����
 * һ���ؼ��Ĳ�ͬ����ǹؼ��� this��������� this �ؼ���ָ�������࣬��lambda���ʽ�� this �ؼ���ָ���Χlambda���ʽ���ࡣ
 * ��һ����ͬ���Ƕ��ߵı��뷽ʽ��Java��������lambda���ʽ��������˽�з�����ʹ����Java 7�� invokedynamic �ֽ���ָ������̬�����������
 */

/*Java 8 Lambda���ʽҪ��*/
/**
 * 1��lambda���ʽ���ܷ������´��룺Ԥ����ʹ���� @Functional ע�͵ĺ���ʽ�ӿڣ��Դ�һ���������ķ���������SAM��Single Abstract Method �������󷽷������͡�
 * ��Щ��Ϊlambda���ʽ��Ŀ�����ͣ����������������ͣ���lambdaĿ�����Ĳ�����
 * ���磬��һ����������Runnable��Comparable���� Callable �ӿڣ����е������󷽷������Դ���lambda���ʽ��
 * ���Ƶģ����һ���������������� java.util.function ���ڵĽӿڣ����� Predicate��Function��Consumer �� Supplier����ô�������䴫lambda���ʽ��
 * 2��lambda���ʽ�ڿ���ʹ�÷������ã������÷������޸�lambda���ʽ�ṩ�Ĳ����������е�lambda���ʽ���Ի�Ϊ�������ã���Ϊ�����һ��������ͬ�ļ򵥷������á�
 * list.forEach(n -> System.out.println(n));
 * list.forEach(System.out::println);  // ʹ�÷�������
 * Ȼ�������Բ������κ��޸ģ�����ʹ�÷������ã��������������lambda���ʽ��������ʾ��
 * list.forEach((String s) -> System.out.println("*" + s + "*"));
 * ��ʵ�ϣ�����ʡ�������lambda�������������������������Դ��б���������Ʋ������
 * 3��lambda�ڲ�����ʹ�þ�̬���Ǿ�̬�;ֲ����������Ϊlambda�ڵı�������
 * 4��Lambda���ʽ��Java���ֳ�Ϊ�հ����������������������ͬ�°����бհ���ʱ�򣬲��þ��ȡ�
 * 5��Lambda�����ڱ������ڲ��������˽�з��������ɷ� invokedynamic �ֽ���ָ�������е��á�����ʹ��JDK�е� javap ������������class�ļ���
 * ʹ�� javap -p �� javap -c -v ��������һ��lambda���ʽ���ɵ��ֽ��롣����Ӧ�ó�������
 * private static java.lang.Object lambda$0(java.lang.String);
 * 6��lambda���ʽ�и����ƣ��Ǿ���ֻ������ final �� final �ֲ������������˵������lambda�ڲ��޸Ķ���������ı�����
 * List<Integer> primes = Arrays.asList(new Integer[]{2, 3,5,7});
 * int factor = 2;
 * primes.forEach(element -> { factor++; });
 * Compile time error : "local variables referenced from a lambda expression must be final or effectively final"
 * ���⣬ֻ�Ƿ������������޸��ǿ��Եģ�������ʾ��
 * List<Integer> primes = Arrays.asList(new Integer[]{2, 3,5,7});
 * int factor = 2;
 * primes.forEach(element -> { System.out.println(factor*element); });
 * �����
 * 4
 * 6
 * 10
 * 14
 * ��ˣ������������񲻿ɱ�հ���������Python��
 * 
 */
/**
 *���Ͼ���Java 8��lambda���ʽ��ȫ��11�����ӡ��˴��޸Ľ���ΪJavaʷ������һ�Σ�����ԶӰ��δ��Java������ʹ�ü��Ͽ�ܵķ�ʽ��
 *�����ģ�����Ƶ�һ���޸ľ���Java 5�ķ����ˣ��������˺ܶ��ŵ㣬�����˴������������磺���͡�ö�١��Զ�װ�䣨Autoboxing������̬���롢����API�ͱ���������
 *��������ʹ��Java�����������������lambda���ʽҲ����һ���Ľ����������ڴ��ſ������е������⣬�����ʹ������Ӧ�ñ�ø�����д�� 
 *ԭ�����ӣ�http://javarevisited.blogspot.com/2014/02/10-example-of-lambda-expressions-in-java8.html#ixzz3gCMp6Vhc
 *���������޸�
 */


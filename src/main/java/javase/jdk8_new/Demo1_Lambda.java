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
		JFrame jf = new JFrame("例2");
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
		System.out.println("例3 使用Java8 lambda表达式处理Comparator匿名类");
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
		System.out.println("例4 使用lambda表达式对列表进行迭代");
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
		System.out.println("例5 使用lambda表达式和函数式接口Predicate");
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
	     * 可以看到，Stream API的过滤方法也接受一个Predicate，这意味着可以将我们定制的 filter() 方法替换成写在里面的内联代码，这就是lambda表达式的魔力。
	     * 另外，Predicate接口也允许进行多重条件的测试，下个例子将要讲到。
	     */
	    /**
	     * 例6、如何在lambda表达式中加入Predicate
	     * 上个例子说到，java.util.function.Predicate 允许将两个或更多的 Predicate 合成一个。
	     * 它提供类似于逻辑操作符AND和OR的方法，名字叫做and()、or()和xor()，用于将传入 filter() 方法的条件合并起来。
	     * 例如，要得到所有以J开始，长度为四个字母的语言，可以定义两个独立的 Predicate 示例分别表示每一个条件，
	     * 然后用 Predicate.and() 方法将它们合并起来，如下所示
	     */
	    System.out.println("例6 如何在lambda表达式中加入Predicate");
	    // 甚至可以用and()、or()和xor()逻辑函数来合并Predicate，
	    // 例如要找到所有以J开始，长度为四个字母的名字，你可以合并两个Predicate并传入
	    Predicate<String> startsWithJ = (n) -> n.startsWith("J");
	    Predicate<String> fourLetterLong = (n) -> n.length() == 4;
	    languages.stream()
	    	.filter(startsWithJ.and(fourLetterLong))
	    	.forEach((n) -> System.out.print("nName, which starts with 'J' and four letter long is : " + n));
	    /*
	     * 类似地，也可以使用 or() 和 xor() 方法。本例着重介绍了如下要点：可按需要将 Predicate 作为单独条件然后将其合并起来使用。
	     * 简而言之，你可以以传统Java命令方式使用 Predicate 接口，也可以充分利用lambda表达式达到事半功倍的效果。
	     */
	    /**
	     * 例7.1、Java 8中使用lambda表达式的Map和Reduce示例
	     * 本例介绍最广为人知的函数式编程概念map。它允许你将对象进行转换。
	     * 例如在本例中，我们将 costBeforeTax 列表的每个元素转换成为税后的值。
	     * 我们将 x -> x*x lambda表达式传到 map() 方法，后者将其应用到流中的每一个元素。
	     * 然后用 forEach() 将列表元素打印出来。使用流API的收集器类，可以得到所有含税的开销。
	     * 有 toList() 这样的方法将 map 或任何其他操作的结果合并起来。
	     * 由于收集器在流上做终端操作，因此之后便不能重用流了。你甚至可以用流API的 reduce() 方法将所有数字合成一个，下一个例子将会讲到。
	     */
	    System.out.println("例7.1 Java 8中使用lambda表达式的Map和Reduce示例");
	    // 不使用lambda表达式为每个订单加上12%的税
	    List<Integer> costBeforeTax1 = Arrays.asList(100, 200, 300, 400, 500);
	    for (Integer cost : costBeforeTax1) {
	        double price = cost + .12*cost;
	        System.out.println(price);
	    }
	    // 使用lambda表达式为每个订单加上12%的税
	    List<Integer> costBeforeTax2 = Arrays.asList(100, 200, 300, 400, 500);
	    costBeforeTax2.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
	    
	    /**
	     * 例7.2、Java 8中使用lambda表达式的Map和Reduce示例
	     * 在上个例子中，可以看到map将集合类（例如列表）元素进行转换的。
	     * 还有一个 reduce() 函数可以将所有值合并成一个。
	     * Map和Reduce操作是函数式编程的核心操作，因为其功能，reduce 又被称为折叠操作。
	     * 另外，reduce 并不是一个新的操作，你有可能已经在使用它。
	     * SQL中类似 sum()、avg() 或者 count() 的聚集函数，实际上就是 reduce 操作，因为它们接收多个值并返回一个值。
	     * 流API定义的 reduce() 函数可以接受lambda表达式，并对所有值进行合并。
	     * IntStream这样的类有类似 average()、count()、sum() 的内建方法来做 reduce 操作，也有mapToLong()、mapToDouble() 方法来做转换。
	     * 这并不会限制你，你可以用内建方法，也可以自己定义。
	     * 在这个Java 8的Map Reduce示例里，我们首先对所有价格应用 12% 的VAT，然后用 reduce() 方法计算总和。
	     */
	    System.out.println("例7.2 Java 8中使用lambda表达式的Map和Reduce示例");
		 // 为每个订单加上12%的税
		 // 老方法：
		 List<Integer> costBeforeTax3 = Arrays.asList(100, 200, 300, 400, 500);
		 double total = 0;
		 for (Integer cost : costBeforeTax3) {
		     double price = cost + .12*cost;
		     total = total + price;
		 }
		 System.out.println("Total : " + total);
	    
		 // 新方法：
		 List<Integer> costBeforeTax4 = Arrays.asList(100, 200, 300, 400, 500);
		 double bill = costBeforeTax4.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
		 System.out.println("Total : " + bill);
	    /**
	     * 例8 通过过滤创建一个String列表
	     * 过滤是Java开发者在大规模集合上的一个常用操作，而现在使用lambda表达式和流API过滤大规模数据集合是惊人的简单。
	     * 流提供了一个 filter() 方法，接受一个 Predicate 对象，即可以传入一个lambda表达式作为过滤逻辑。
	     * 下面的例子是用lambda表达式过滤Java集合，将帮助理解。
	     * 另外，关于 filter() 方法有个常见误解。在现实生活中，做过滤的时候，通常会丢弃部分，但使用filter()方法则是获得一个新的列表，且其每个元素符合过滤原则。
	     */
		// 创建一个字符串列表，每个字符串长度大于2
		 System.out.println("例8 通过过滤创建一个String列表");
		 List<String> strList = new ArrayList<String>();
		 strList.add("asdadfs");
		 strList.add("das");
		 strList.add("594a");
		 strList.add("dd");
		 List<String> filtered = strList.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
		 System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
		 
		 /**
		  * 例9 对列表的每个元素应用函数
		  * 我们通常需要对列表的每个元素使用某个函数，例如逐一乘以某个数、除以某个数或者做其它操作。
		  * 这些操作都很适合用 map() 方法，可以将转换逻辑以lambda表达式的形式放在 map() 方法里，就可以对集合的各个元素进行转换了，如下所示。
		  */
		 System.out.println("例9 对列表的每个元素应用函数");
		// 将字符串换成大写并用逗号链接起来
		 List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		 String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		 System.out.println(G7Countries);
		 
		 /**
		  * 例10 复制不同的值，创建一个子列表
		  * 本例展示了如何利用流的 distinct() 方法来对集合进行去重。
		  */
		 System.out.println("例10 复制不同的值，创建一个子列表");
		// 用所有不同的数字创建一个正方形列表
		 List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		 List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		 System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);
		 /**
		  * 例11 计算集合元素的最大值、最小值、总和以及平均值
		  * IntStream、LongStream 和 DoubleStream 等流的类中，有个非常有用的方法叫做 summaryStatistics() 。
		  * 可以返回 IntSummaryStatistics、LongSummaryStatistics 或者 DoubleSummaryStatistic s，描述流中元素的各种摘要数据。
		  * 在本例中，我们用这个方法来计算列表的最大值和最小值。它也有 getSum() 和 getAverage() 方法来获得列表的所有元素的总和及平均值。
		  */
		 System.out.println("例11 计算集合元素的最大值、最小值、总和以及平均值");
		//获取数字的个数、最小值、最大值、总和以及平均值
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
	// 更好的办法
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
 * Lambda表达式 vs 匿名类
 * 既然lambda表达式即将正式取代Java代码中的匿名内部类，那么有必要对二者做一个比较分析。
 * 一个关键的不同点就是关键字 this。匿名类的 this 关键字指向匿名类，而lambda表达式的 this 关键字指向包围lambda表达式的类。
 * 另一个不同点是二者的编译方式。Java编译器将lambda表达式编译成类的私有方法。使用了Java 7的 invokedynamic 字节码指令来动态绑定这个方法。
 */

/*Java 8 Lambda表达式要点*/
/**
 * 1）lambda表达式仅能放入如下代码：预定义使用了 @Functional 注释的函数式接口，自带一个抽象函数的方法，或者SAM（Single Abstract Method 单个抽象方法）类型。
 * 这些称为lambda表达式的目标类型，可以用作返回类型，或lambda目标代码的参数。
 * 例如，若一个方法接收Runnable、Comparable或者 Callable 接口，都有单个抽象方法，可以传入lambda表达式。
 * 类似的，如果一个方法接受声明于 java.util.function 包内的接口，例如 Predicate、Function、Consumer 或 Supplier，那么可以向其传lambda表达式。
 * 2）lambda表达式内可以使用方法引用，仅当该方法不修改lambda表达式提供的参数。本例中的lambda表达式可以换为方法引用，因为这仅是一个参数相同的简单方法调用。
 * list.forEach(n -> System.out.println(n));
 * list.forEach(System.out::println);  // 使用方法引用
 * 然而，若对参数有任何修改，则不能使用方法引用，而需键入完整地lambda表达式，如下所示：
 * list.forEach((String s) -> System.out.println("*" + s + "*"));
 * 事实上，可以省略这里的lambda参数的类型声明，编译器可以从列表的类属性推测出来。
 * 3）lambda内部可以使用静态、非静态和局部变量，这称为lambda内的变量捕获。
 * 4）Lambda表达式在Java中又称为闭包或匿名函数，所以如果有同事把它叫闭包的时候，不用惊讶。
 * 5）Lambda方法在编译器内部被翻译成私有方法，并派发 invokedynamic 字节码指令来进行调用。可以使用JDK中的 javap 工具来反编译class文件。
 * 使用 javap -p 或 javap -c -v 命令来看一看lambda表达式生成的字节码。大致应该长这样：
 * private static java.lang.Object lambda$0(java.lang.String);
 * 6）lambda表达式有个限制，那就是只能引用 final 或 final 局部变量，这就是说不能在lambda内部修改定义在域外的变量。
 * List<Integer> primes = Arrays.asList(new Integer[]{2, 3,5,7});
 * int factor = 2;
 * primes.forEach(element -> { factor++; });
 * Compile time error : "local variables referenced from a lambda expression must be final or effectively final"
 * 另外，只是访问它而不作修改是可以的，如下所示：
 * List<Integer> primes = Arrays.asList(new Integer[]{2, 3,5,7});
 * int factor = 2;
 * primes.forEach(element -> { System.out.println(factor*element); });
 * 输出：
 * 4
 * 6
 * 10
 * 14
 * 因此，它看起来更像不可变闭包，类似于Python。
 * 
 */
/**
 *以上就是Java 8的lambda表达式的全部11个例子。此次修改将成为Java史上最大的一次，将深远影响未来Java开发者使用集合框架的方式。
 *我想规模最相似的一次修改就是Java 5的发布了，它带来了很多优点，提升了代码质量，例如：泛型、枚举、自动装箱（Autoboxing）、静态导入、并发API和变量参数。
 *上述特性使得Java代码更加清晰，我想lambda表达式也将进一步改进它。我在期待着开发并行第三方库，这可以使高性能应用变得更容易写。 
 *原文链接：http://javarevisited.blogspot.com/2014/02/10-example-of-lambda-expressions-in-java8.html#ixzz3gCMp6Vhc
 *这里稍作修改
 */

package javase.important_object.other_class;

/**
 * <p>{@link Demo5_BigDecimal}介绍了为了精确表示计算时使用的类BigDecimal,
 * 本例将介绍strictfp关键字strictfp, 即 strict float point (精确浮点)。</p>
 * <p>strictfp 关键字可应用于类、接口或方法。</p>
 * <p>使用 strictfp 关键字声明一个方法时，
 * 该方法中所有的float和double表达式都严格遵守FP-strict的限制,
 * 符合IEEE-754规范。当对一个类或接口使用 strictfp 关键字时，
 * 该类中的所有代码，包括嵌套类型中的初始设定值和代码，
 * 都将严格地进行计算。严格约束意味着所有表达式的结果都必须是 IEEE 754 算法对操作数预期的结果，
 * 以单精度和双精度格式表示。如果你想让你的浮点运算更加精确，
 * 而且<b>不会因为不同的硬件平台所执行的结果不一致的话，可以用关键字strictfp. </b></p>
 * <h4>使用方法</h4>
 * <p>你可以将一个类、接口以及方法声明为strictfp，但是不允许对接口中的方法以及构造函数声明strictfp关键字</p>
 * <p>1. 合法的使用关键字strictfp</p>
 * <pre>{@code}
 * strictfp interface A {}
 * 
 * public strictfp class FpDemo1 {
 *     strictfp void f() {}
 * }
 * </pre>
 * 2. 错误的使用方法
 * <pre>{@code}
 * interface A {
 *     strictfp void f();
 * }
 * 
 * public class FpDemo2 {
 *     strictfp FpDemo2() {}
 * }
 * </pre>
 * <p>一旦使用了关键字strictfp来声明某个类、接口或者方法时，
 * 那么在这个关键字所声明的范围内所有浮点运算都是精确的，符合IEEE-754规范的。
 * 例如一个类被声明为strictfp，那么该类中所有的方法都是strictfp的。</p>
 * <h4>来龙去脉</h4>
 * <p>对于Java的设计目标—在浮点运算中，一次编译到处运行的可移植性，并且结果不变的实现是很困难的，
 * double类型是64位来存储一个数值，但是一些处理器处理浮点运算是80位的，比如Intel系列的，
 * 在计算的中间步骤，会将80位的结果来计算，到最后的步骤时，截断为64位，这样的话，
 * 可以避免指数溢出的问题，并且结果也更加的精确，但是这样做的结果可能始终和在64位机器上运算的结果不一致，
 * 这样就无法实现移植性，那么jvm规范就规定，必须把中间的计算结果截断了！不能等到最后去截断！
 * 虽然可以实现移植性，不过，这样做的话有可能产生溢出，并且运算速度降低（因为截断消耗时间），
 * 这也是个矛盾所在，jvm规范也最后承认了这点，那就是完美的性能和结果与理想的移植性的矛盾！
 * 最终jvm规范妥协了，规定默认的时候中间运算结果可以不截断，但是方法或者类，在显式的使用strictfp关键字的时候，
 * 必须严格的执行浮点运算的计算原理，中间结果必须截断，来得到可复用移植的结果。</p>
 * <p>用的场合和机会不是很多，一般情况下不用深究。以后在细细的谈谈浮点数运算的机器表示和实现吧……</p>
 * @author Kang
 *
 */
public strictfp class Demo10_StrictFP_Keyword {
	public static void main(String[] args) {
		float aFloat = 0.6710339f;
		double aDouble = 0.04150553411984792d;
        double sum = aFloat + aDouble;
        float quotient = (float)(aFloat / aDouble);
        System.out.println("float: " + aFloat);
        System.out.println("double: " + aDouble);
        System.out.println("sum: " + sum);
        System.out.println("quotient: " + quotient);
	}
}

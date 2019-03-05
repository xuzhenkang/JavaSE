package javase.generic;

public abstract class Demo01_Father<T1, T2> {
	T1 age;
	public abstract void test(T2 name);
}
/**
 * 属性及方法类型  随位置而定
 * （1）
 * 子类重写方法的类型  随父类而定
 * 子类新增方法的类型  随子类而定
 * （2）
 * 子类中使用父类的属性  随父类而定
 * 子类中使用自己的属性  随父类而定
 */

//保留父类泛型
//1.全部保留
class C1<T1, T2> extends Demo01_Father<T1, T2> {
	// 子类重写父类方法的类型，随父类而定。
	// 子类使用父类的属性，随父类而定。（age是T1型的）
	@Override
	public void test(T2 name) {
	}}
class C11<T1, T2, A, B> extends Demo01_Father<T1, T2> {
	// 子类重写父类方法的类型，随父类而定。
	// 子类使用父类的属性，随父类而定。（age是T1型的）
	@Override
	public void test(T2 name) {
	}}
//2.部分保留
class C21<T1> extends Demo01_Father<T1, String> {
	// 子类重写父类方法的类型，随父类而定。
	// 子类使用父类的属性，随父类而定。（age是T1型的）
	@Override
	public void test(String name) {
	}}
class C22<T2> extends Demo01_Father<Integer, T2> {
	// 子类重写父类方法的类型，随父类而定。
	// 子类使用父类的属性，随父类而定。（age是Integer型的）
	@Override
	public void test(T2 name) {
	}}
class C23<T2, A, B> extends Demo01_Father<Integer, T2> {
	// 子类重写父类方法的类型，随父类而定。
	// 子类使用父类的属性，随父类而定。（age是Integer型的）
	@Override
	public void test(T2 name) {
	}}

//不保留父类泛型
//1.具体类型
class C3 extends Demo01_Father<Integer, String> {
	// 子类重写父类方法的类型，随父类而定。
	// 子类使用父类的属性，随父类而定。（age是Integer型的）
	@Override
	public void test(String name) {
	}}
class C31<A, B> extends Demo01_Father<Integer, String> {
	// 子类重写父类方法的类型，随父类而定。
	// 子类使用父类的属性，随父类而定。（age是Integer型的）
	@Override
	public void test(String name) {
	}}
//2.没有类型 （擦除）
class C4 extends Demo01_Father {
	// 子类重写父类方法的类型，随父类而定。
	// 子类使用父类的属性，随父类而定。（age是Object型的）
	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	}}





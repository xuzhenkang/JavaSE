package javase.generic;
/*
 * 泛型接口与泛型类 同理
 * 
 */
public interface Demo02_Comparator<T> {
	public static final int MAX_VALUE = 100;
//	public static final T MAX_VALUE = 100; 错误泛型不能用在静态属性上
//	public static T get(); 错误， 泛型不能用在静态方法上
	public abstract void test();
}


// 实现
class InterC1 implements Demo02_Comparator {

	@Override
	public void test() {
	}}
class InterC11<A> implements Demo02_Comparator {

	@Override
	public void test() {
	}}
class InterC2 implements Demo02_Comparator<Integer> {

	@Override
	public void test() {
	}}
class InterC21<A> implements Demo02_Comparator<Integer> {

	@Override
	public void test() {
	}}
class InterC3<T, A> implements Demo02_Comparator<T> {

	@Override
	public void test() {
	}}
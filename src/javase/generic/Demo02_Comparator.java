package javase.generic;
/*
 * ���ͽӿ��뷺���� ͬ��
 * 
 */
public interface Demo02_Comparator<T> {
	public static final int MAX_VALUE = 100;
//	public static final T MAX_VALUE = 100; �����Ͳ������ھ�̬������
//	public static T get(); ���� ���Ͳ������ھ�̬������
	public abstract void test();
}


// ʵ��
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
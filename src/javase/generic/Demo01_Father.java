package javase.generic;

public abstract class Demo01_Father<T1, T2> {
	T1 age;
	public abstract void test(T2 name);
}
/**
 * ���Լ���������  ��λ�ö���
 * ��1��
 * ������д����������  �游�����
 * ������������������  ���������
 * ��2��
 * ������ʹ�ø��������  �游�����
 * ������ʹ���Լ�������  �游�����
 */

//�������෺��
//1.ȫ������
class C1<T1, T2> extends Demo01_Father<T1, T2> {
	// ������д���෽�������ͣ��游�������
	// ����ʹ�ø�������ԣ��游���������age��T1�͵ģ�
	@Override
	public void test(T2 name) {
	}}
class C11<T1, T2, A, B> extends Demo01_Father<T1, T2> {
	// ������д���෽�������ͣ��游�������
	// ����ʹ�ø�������ԣ��游���������age��T1�͵ģ�
	@Override
	public void test(T2 name) {
	}}
//2.���ֱ���
class C21<T1> extends Demo01_Father<T1, String> {
	// ������д���෽�������ͣ��游�������
	// ����ʹ�ø�������ԣ��游���������age��T1�͵ģ�
	@Override
	public void test(String name) {
	}}
class C22<T2> extends Demo01_Father<Integer, T2> {
	// ������д���෽�������ͣ��游�������
	// ����ʹ�ø�������ԣ��游���������age��Integer�͵ģ�
	@Override
	public void test(T2 name) {
	}}
class C23<T2, A, B> extends Demo01_Father<Integer, T2> {
	// ������д���෽�������ͣ��游�������
	// ����ʹ�ø�������ԣ��游���������age��Integer�͵ģ�
	@Override
	public void test(T2 name) {
	}}

//���������෺��
//1.��������
class C3 extends Demo01_Father<Integer, String> {
	// ������д���෽�������ͣ��游�������
	// ����ʹ�ø�������ԣ��游���������age��Integer�͵ģ�
	@Override
	public void test(String name) {
	}}
class C31<A, B> extends Demo01_Father<Integer, String> {
	// ������д���෽�������ͣ��游�������
	// ����ʹ�ø�������ԣ��游���������age��Integer�͵ģ�
	@Override
	public void test(String name) {
	}}
//2.û������ ��������
class C4 extends Demo01_Father {
	// ������д���෽�������ͣ��游�������
	// ����ʹ�ø�������ԣ��游���������age��Object�͵ģ�
	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	}}





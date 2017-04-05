package javase.important_object.other_class;

/**
 * <p>{@link Demo5_BigDecimal}������Ϊ�˾�ȷ��ʾ����ʱʹ�õ���BigDecimal,
 * ����������strictfp�ؼ���strictfp, �� strict float point (��ȷ����)��</p>
 * <p>strictfp �ؼ��ֿ�Ӧ�����ࡢ�ӿڻ򷽷���</p>
 * <p>ʹ�� strictfp �ؼ�������һ������ʱ��
 * �÷��������е�float��double���ʽ���ϸ�����FP-strict������,
 * ����IEEE-754�淶������һ�����ӿ�ʹ�� strictfp �ؼ���ʱ��
 * �����е����д��룬����Ƕ�������еĳ�ʼ�趨ֵ�ʹ��룬
 * �����ϸ�ؽ��м��㡣�ϸ�Լ����ζ�����б��ʽ�Ľ���������� IEEE 754 �㷨�Բ�����Ԥ�ڵĽ����
 * �Ե����Ⱥ�˫���ȸ�ʽ��ʾ�������������ĸ���������Ӿ�ȷ��
 * ����<b>������Ϊ��ͬ��Ӳ��ƽ̨��ִ�еĽ����һ�µĻ��������ùؼ���strictfp. </b></p>
 * <h4>ʹ�÷���</h4>
 * <p>����Խ�һ���ࡢ�ӿ��Լ���������Ϊstrictfp�����ǲ�����Խӿ��еķ����Լ����캯������strictfp�ؼ���</p>
 * <p>1. �Ϸ���ʹ�ùؼ���strictfp</p>
 * <pre>{@code}
 * strictfp interface A {}
 * 
 * public strictfp class FpDemo1 {
 *     strictfp void f() {}
 * }
 * </pre>
 * 2. �����ʹ�÷���
 * <pre>{@code}
 * interface A {
 *     strictfp void f();
 * }
 * 
 * public class FpDemo2 {
 *     strictfp FpDemo2() {}
 * }
 * </pre>
 * <p>һ��ʹ���˹ؼ���strictfp������ĳ���ࡢ�ӿڻ��߷���ʱ��
 * ��ô������ؼ����������ķ�Χ�����и������㶼�Ǿ�ȷ�ģ�����IEEE-754�淶�ġ�
 * ����һ���౻����Ϊstrictfp����ô���������еķ�������strictfp�ġ�</p>
 * <h4>����ȥ��</h4>
 * <p>����Java�����Ŀ�ꡪ�ڸ��������У�һ�α��뵽�����еĿ���ֲ�ԣ����ҽ�������ʵ���Ǻ����ѵģ�
 * double������64λ���洢һ����ֵ������һЩ������������������80λ�ģ�����Intelϵ�еģ�
 * �ڼ�����м䲽�裬�Ὣ80λ�Ľ�������㣬�����Ĳ���ʱ���ض�Ϊ64λ�������Ļ���
 * ���Ա���ָ����������⣬���ҽ��Ҳ���ӵľ�ȷ�������������Ľ������ʼ�պ���64λ����������Ľ����һ�£�
 * �������޷�ʵ����ֲ�ԣ���ôjvm�淶�͹涨��������м�ļ������ض��ˣ����ܵȵ����ȥ�ضϣ�
 * ��Ȼ����ʵ����ֲ�ԣ��������������Ļ��п��ܲ�����������������ٶȽ��ͣ���Ϊ�ض�����ʱ�䣩��
 * ��Ҳ�Ǹ�ì�����ڣ�jvm�淶Ҳ����������㣬�Ǿ������������ܺͽ�����������ֲ�Ե�ì�ܣ�
 * ����jvm�淶��Э�ˣ��涨Ĭ�ϵ�ʱ���м����������Բ��ضϣ����Ƿ��������࣬����ʽ��ʹ��strictfp�ؼ��ֵ�ʱ��
 * �����ϸ��ִ�и�������ļ���ԭ���м�������ضϣ����õ��ɸ�����ֲ�Ľ����</p>
 * <p>�õĳ��Ϻͻ��᲻�Ǻܶ࣬һ������²�������Ժ���ϸϸ��̸̸����������Ļ�����ʾ��ʵ�ְɡ���</p>
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

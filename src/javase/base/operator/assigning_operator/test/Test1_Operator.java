package javase.base.operator.assigning_operator.test;

class Test1_Operator {
	public static void main(String[] args) {
		// ������:������ĳ����Ƿ������⣬��������⣬��ָ����˵�����ɡ�
		//short s=1;s = s+1;			//��short��int���������ʱ��,������Ϊint����,����int������ӵĽ��Ҳ��int����
		short s=1;s+=1;					//s = (short)(s + 1);

		System.out.println(s);
	}
}

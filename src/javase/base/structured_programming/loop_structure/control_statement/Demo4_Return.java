package javase.base.structured_programming.loop_structure.control_statement;
class Demo4_Return {
	public static void main(String[] args) {
		for (int i = 1;i <= 10 ;i++ ) {
			if (i == 4) {				
				//break;						//ֹͣѭ��
				return;							//���ص���˼,�������ط���
			}
		}

		System.out.println("ѭ��������");
	}
}

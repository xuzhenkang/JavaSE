package javase.base.structured_programming.loop_structure.test;
/*
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//�ڴ˴���д����
			}
			System.out.println(��Java�����ࡱ);
		}
		
		�����ڿ���̨���2��:��Java�����ࡰ
		�����ڿ���̨���7��:��Java�����ࡰ
		�����ڿ���̨���13��:��Java�����ࡰ	
*/
class Test1 {
	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//break;						//�����ڿ���̨���2��:��Java�����ࡰ
				//continue;						//�����ڿ���̨���7��:��Java�����ࡰ
				System.out.println("Java������");//�����ڿ���̨���13��:��Java�����ࡰ	
			}
			System.out.println("Java������");
		}
	}
}

package javase.important_object.string;

public class Demo3_String {
	public static void main(String[] args) {
		//1.�ж϶���ΪString���͵�s1��s2�Ƿ����
/*	     String s1 = "abc";
	     String s2 = "abc";
	     System.out.println(s1 == s2);
	     System.out.println(s2.equals(s2));*/
	     // 2.������仰���ڴ��д����˼�������
//	     String s1 = new String("abc");
	     //3.�ж϶���ΪString���͵�s1��s2�Ƿ����
/*	     String s1 = new String("abc");
	     String s2 = "abc";
	     System.out.println(s1 == s2); 
	     System.out.println(s1.equals(s2)); */
	    //4.�ж϶���ΪString���͵�s1��s2�Ƿ����
/*	     String s1 = "a" + "b" + "c";
	     String s2 = "abc";
	     System.out.println(s1 == s2); 
	     System.out.println(s1.equals(s2)); */
	    //5.�ж϶���ΪString���͵�s1��s2�Ƿ����
	     String s1 = "ab";
	     String s2 = "abc";
	     String s3 = s1 + "c";
	     System.out.println(s3 == s2); 
	     System.out.println(s3.equals(s2)); 
	}

}

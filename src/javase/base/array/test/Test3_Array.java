package javase.base.array.test;
/*
�����������͵�ֵ����,���ı�ԭֵ,��Ϊ���ú�ͻᵯջ,�ֲ�������֮��ʧ
�����������͵�ֵ����,�ı�ԭֵ,��Ϊ��ʹ������ջ,���Ƕ��ڴ����������,����ͨ����ַ��������

Java�е����Ǵ�ֵ���Ǵ�ַ
1,���Ǵ�ֵ,Ҳ�Ǵ���ַ,�����������ʹ��ݵ�ֵ,�����������ʹ��ݵĵ�ַ
2,java��ֻ�д�ֵ,��Ϊ��ֵַҲ��ֵ(��ȥ���Զ�˵����,֧�����Ǹ�˾��(java֮��))
*/
class Test3_Array {
	public static void main(String[] args) {
		/*int a = 10;
		int b = 20;
		System.out.println("a:"+a+",b:"+b);			//a = 10,b = 20
		change(a,b);
		System.out.println("a:"+a+",b:"+b);			//?*/

		int[] arr = {1,2,3,4,5};
		change(arr);
		System.out.println(arr[1]);
	}

	public static void change(int a,int b) {		//a = 10, b= 20
		System.out.println("a:"+a+",b:"+b);			//a = 10,b = 20
		a = b;										//a = 20
		b = a + b;									//b = 40
		System.out.println("a:"+a+",b:"+b);			//a = 20, b = 40
	}

	public static void change(int[] arr) {			//1,4,3,8,5
		for(int x=0; x<arr.length; x++) {
			if(arr[x]%2==0) {
				arr[x]*=2;
			}
		}
	}
}

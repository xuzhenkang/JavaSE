package javase.oo.static_keyword;

class Demo3_Main {
	public static void main(String[] args) {			
		/*
		public : ��jvm����,����Ȩ��Ҫ�㹻��
		static : ��jvm����,����Ҫ��������,ֱ������.���ü���
		void   : ��jvm����,����Ҫ���κεķ���ֵ
		main   : ֻ������д���ܱ�jvmʶ��,main���ǹؼ���
		String[] args : ��ǰ���������ռ���¼���
		*/

		System.out.println(args.length);
		for (int i = 0;i < args.length ;i++ ) {
			System.out.println(args[i]);
		}
	}
}

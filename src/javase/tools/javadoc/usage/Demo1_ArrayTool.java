package javase.tools.javadoc.usage;

class Demo1_ArrayTool {
	public static void main(String[] args) {
		int[] arr = {33,11,22,66,55,44};
		/*ArrayTool at = new ArrayTool();
		int max = at.getMax(arr);				//��ȡ��ֵ
		System.out.println(max);
		
		System.out.println("---------------");
		at.print(arr);							//��ӡ
		System.out.println();
		System.out.println("---------------");
		System.out.println("��ת��:");
		at.revArray(arr);						//��ת
		at.print(arr);	*/

		ArrayTool.print(arr);
	}
}

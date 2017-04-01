package javase.collections.map;

import java.util.HashMap;

public class Test1 {

	/**
	 * * A:������ʾ
	 * ����ͳ���ַ�����ÿ���ַ����ֵĴ���
	 * 
	 * ����:
	 * 1,����һ����Ҫ��ͳ���ַ����ַ���
	 * 2,���ַ���ת��Ϊ�ַ�����
	 * 3,����˫�м���,�洢�ַ������ַ��Լ��ַ����ֵĴ���
	 * 4,�����ַ������ȡÿһ���ַ�,�����ַ��洢��˫�м�����
	 * 5,�洢������Ҫ���ж�,��������в����������,�ͽ����ַ�������,ֵΪ1�洢,��������а��������,�ͽ�ֵ��1�洢
	 * 6,��ӡ˫�м��ϻ�ȡ�ַ����ֵĴ���
	 */
	public static void main(String[] args) {
		//1,����һ����Ҫ��ͳ���ַ����ַ���
		String s = "aaaabbbbbccccccccccccc";
		//2,���ַ���ת��Ϊ�ַ�����
		char[] arr = s.toCharArray();
		//3,����˫�м���,�洢�ַ������ַ��Լ��ַ����ֵĴ���
		HashMap<Character, Integer> hm = new HashMap<>();
		//4,�����ַ������ȡÿһ���ַ�,�����ַ��洢��˫�м�����
		for(char c: arr) {
			//5,�洢������Ҫ���ж�,��������в����������,�ͽ����ַ�������,ֵΪ1�洢,��������а��������,�ͽ�ֵ��1�洢
			/*if(!hm.containsKey(c)) {			//��������������
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c) + 1);
			}*/
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
		}
		//6,��ӡ˫�м��ϻ�ȡ�ַ����ֵĴ���
		
		for (Character key : hm.keySet()) {				//hm.keySet()�������м��ļ���
			System.out.println(key + "=" + hm.get(key));//hm.get(key)���ݼ���ȡֵ
		}
	}

}

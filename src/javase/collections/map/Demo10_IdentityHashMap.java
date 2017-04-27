package javase.collections.map;

import java.util.IdentityHashMap;

// IdentityHashMap
// ��ֻ�Ե�ַȥ�أ������ǱȽ�hashcode��equals
// ע�⣺���ǳ������е��ַ���
public class Demo10_IdentityHashMap {
	public static void main(String[] args) {
		IdentityHashMap<String, String> map = new IdentityHashMap<String, String>();
		// �������е�"a"
		map.put("a", "a1");
		map.put("a", "a2");
		System.out.println(map.size());
		map.put(new String("a"), "a3");
		map.put(new String("a"), "a4");
		System.out.println(map.size());
	}
}

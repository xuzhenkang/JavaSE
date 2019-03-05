package javase.collections.map;

import java.util.IdentityHashMap;

// IdentityHashMap
// 键只以地址去重，而不是比较hashcode与equals
// 注意：键是常量池中的字符串
public class Demo10_IdentityHashMap {
	public static void main(String[] args) {
		IdentityHashMap<String, String> map = new IdentityHashMap<String, String>();
		// 常量池中的"a"
		map.put("a", "a1");
		map.put("a", "a2");
		System.out.println(map.size());
		map.put(new String("a"), "a3");
		map.put(new String("a"), "a4");
		System.out.println(map.size());
	}
}

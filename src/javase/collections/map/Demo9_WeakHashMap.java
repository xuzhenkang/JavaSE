package javase.collections.map;

import java.util.WeakHashMap;

// WeakHashMap的键为弱类型，gc运行会立即回收，相关请参见jvm.gc.RefDemo
// 其他的HashMap都没办法达到这一点。
public class Demo9_WeakHashMap {
	public static void main(String[] args) {
		WeakHashMap<String, String> map = new WeakHashMap<String, String>();
		// 添加数据
		// 常量对象， 不会被回收
		map.put("abc", "a");
		map.put("d", "test");
		
		// gc回收了弱引用对象
		map.put(new String("kang"), "c");
		map.put(new String("dsf"), "d");
		
		// 通知回收
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}
}

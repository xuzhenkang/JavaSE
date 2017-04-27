package javase.collections.map;

import java.util.EnumMap;

// EnumMap
// 键必须为枚举的值
// 构造器：public EnumMap(指定枚举class对象)
public class Demo11_EnumMap {
	public static void main(String[] args) {
		EnumMap<Season, String> map  = new EnumMap<Season, String>(Season.class);
		map.put(Season.SPRING, "spring");
		map.put(Season.SUMMER, "summer");
		map.put(Season.AUTUMN, "autumn");
		map.put(Season.WINTER, "winter");
		System.out.println(map.size());
	}
}
// 季节
enum Season {
	SPRING, SUMMER, AUTUMN, WINTER
}
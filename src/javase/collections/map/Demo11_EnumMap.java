package javase.collections.map;

import java.util.EnumMap;

// EnumMap
// ������Ϊö�ٵ�ֵ
// ��������public EnumMap(ָ��ö��class����)
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
// ����
enum Season {
	SPRING, SUMMER, AUTUMN, WINTER
}
package classes.regex;

//��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
//���ַ�����ԭ��:����Ҫѧ��̡���
public class TestStringRegex {
	public static void main(String[] args) {
		String s = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		
		s = s.replaceAll("(\\.)+", "");
		s = s.replaceAll("(.)\\1+", "$1");
		System.out.println(s);
	}
}
// ���ţ�ƣ���ס�ɣ�
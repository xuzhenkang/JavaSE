package javase.oo.abstractclass;

public class Demo3_�������� {
	public static void main(String[] args) {
		����Ⱥ С���� = new ����Ⱥ();
		С����.�Թ�();
	}
}
abstract class �������� {
	public abstract void �Թ�();
}
class ����Ⱥ extends �������� {
	public void �Թ�() {
		System.out.println("����ǩ");
	}
}

class ��ƽ֮ extends �������� {
	public void �Թ�() {
		System.out.println("��ָ�׵�");
	}
}

class �������� extends �������� {

	@Override
	public void �Թ�() {
		System.out.println("�ô��ӣ�����ֱ��");
	}
	
}
package aop.dynamicproxypattern;

public class TestProxy {
	public static void main(String[] args) {
        // �󶨴������ַ�ʽ�������еķ������������淽��
        ITalk iTalk = (ITalk) new DynamicProxy().bind(new PeopleTalk("Proxy Test", "����"));
        iTalk.talk("ҵ��˵��");
    }
}
/**
	��̬����ģʽ�����ģʽ������ؽ��ܡ���designpattern.proxy���¡�
*/
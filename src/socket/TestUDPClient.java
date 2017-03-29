package socket;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class TestUDPClient {
	public static void main(String[] args) throws IOException {
		// ������ͷ
		DatagramSocket ds = new DatagramSocket();

		//������Է������ݵļ�װ��dp
		long n = 10000L;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeLong(n);//��n�����������10000Lд��dos��������baos�ܵ������ӵ����ڴ��еĴ�СΪ32�ֽڵ�byte������
		byte[] buf = baos.toByteArray();//DataOutputStream ���в�û��toByteArray()����������ByteArrayOutputStream ����ȴ��toByteArray()����, ���Բ����԰�baos ��Ϊdos���������ʱ�����! ByteArrayOutputStream����toByteArray()�����ĺ��壬ժ��API������һ���·���� byte ���顣���С�Ǵ�������ĵ�ǰ��С�����һ���������Ч�����Ѹ��Ƶ��������С�
		DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 5678));
		
		// ����ͷ�ϰѼ�װ���е����ݷ��͸��Է�
		ds.send(dp);
		// �ر���ͷ
		ds.close();
	}
}
/*
 * ע��ByteArrayOutputStream�����й��캯����û��byte[] buf�������βΣ�������ByteArrayOutputStream������ʱ�ǲ���ָ��byte����ģ�
 * ��Ϊ������ӵ���byte��������ByteArrayOutputStream�Զ����ɵ� 9�� API:"public ByteArrayOutputStream(): 
 * ����һ���µ� byte ���������������������������� 32 �ֽڣ����б�Ҫ���������С�� "
 * 9�д���һ��ִ����ϣ���ζ������: 1�����ڴ���������һ����СΪ32���ֽڵ�byte����
 * 2����һ������baos�Ĺܵ������ӵ��˸�byte�����У����ҿ���ͨ������ܵ����������д������
 * ��Ȼ��ʱ����ͨ��baos��baos�����ӵ������ڴ��з���õ�byte������д�����ݣ�
 * ����ByteArrayOutputStream����û���ṩ����ֱ�Ӱ�long��������ֱ��д��ByteArrayOutputStream�������ӵ���byte�����еķ���,
 * ��˵����û��ͨ��baos��baos�����ӵ���byte������д��long���͵�����, ��API�ĵ����Է���:
 * ByteArrayOutputStream���в�û������writeLong()�����ķ���������DataOutputStream����ȴ��writeLong() writeFloat()�ȷ���
 */
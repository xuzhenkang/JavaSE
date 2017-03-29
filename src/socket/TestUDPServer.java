package socket;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestUDPServer {
	public static void main(String[] args) throws SocketException {
		// ������ͷ
		DatagramSocket ds = new DatagramSocket(5678);
		
		//������������������ݵļ�װ��
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		try {
			while (true) {
				//����ͷ���ü�װ����ܶԷ����͹���������
				ds.receive(dp);//ע�⣺�����ִ����Ͼ���ζ�ţ�dp���ݰ��о��Ѿ������˴ӿͻ��˽��չ���������
				
				//1�� ByteArrayInputStream���ں˱����Ǹ��ֽ����飬�����ǴӸ��ֽ������ж�ȡ����  
				//2��dp.getData()��ʾ��dp��װ���е�����ת��Ϊһ���ֽ����鲢���ظ��ֽ�����
				ByteArrayInputStream bais = new ByteArrayInputStream(dp.getData());
				DataInputStream dis = new DataInputStream(bais);
				System.out.println(dis.readLong());
			}
		} catch (IOException e) {
			e.printStackTrace();
			// �ر���ͷ
			ds.close();
		}
	}
}

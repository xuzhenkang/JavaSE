package socket;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestUDPServer {
	public static void main(String[] args) throws SocketException {
		// 定义码头
		DatagramSocket ds = new DatagramSocket(5678);
		
		//定义可以用来接受数据的集装箱
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		try {
			while (true) {
				//在码头上用集装箱接受对方发送过来的数据
				ds.receive(dp);//注意：本语句执行完毕就意味着，dp数据包中就已经含有了从客户端接收过来的数据
				
				//1、 ByteArrayInputStream的内核必须是个字节数组，并且是从该字节数组中读取数据  
				//2、dp.getData()表示把dp集装箱中的数据转化为一个字节数组并返回该字节数组
				ByteArrayInputStream bais = new ByteArrayInputStream(dp.getData());
				DataInputStream dis = new DataInputStream(bais);
				System.out.println(dis.readLong());
			}
		} catch (IOException e) {
			e.printStackTrace();
			// 关闭码头
			ds.close();
		}
	}
}

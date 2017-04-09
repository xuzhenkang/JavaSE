package practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestUdpB {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(5050, InetAddress.getByName("127.0.0.1"));
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		socket.receive(packet);
		System.out.println(new String(packet.getData()));
		socket.close();
	}
}

package practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class TestUdpA {
	private static String data = "Test Data ÖÐÎÄ";
	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(System.in);
		
		
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getByName("127.0.0.1"), 5050);
		packet.setData(data.getBytes());
		socket.send(packet);
		socket.close();
		cin.close();
	}
}

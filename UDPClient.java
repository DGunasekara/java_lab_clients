//UDP Client

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.DatagramPacket;

public class UDPClient{
	
	public static void main(String[] args) throws Exception{

		DatagramSocket datadramsocket = new DatagramSocket();

		int i = 15;
		byte[] b = String.valueOf(i).getBytes();
		InetAddress address = InetAddress.getLocalHost();

		DatagramPacket datagramPacket = new DatagramPacket( b, b.length, address, 9999);

		datadramsocket.send(datagramPacket);

		byte[] b1 = new byte[1024];

		DatagramPacket dp1= new DatagramPacket(b, b.length);

		String str = new String(dp1.getData());
		System.out.println("result is "+str);

	}

}
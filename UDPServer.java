//UDP Server

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPServer{

	public static void main(String[] args) throws Exception{

		DatagramSocket ds = new DatagramSocket(9999);

		byte[] b1 = new byte[1024];

		DatagramPacket dp = new DatagramPacket(b1,b1.length);
		ds.receive(dp);

		String str = new String(dp.getData());

		int num = Integer.parseInt(str.trim());
		int result = num*num;

		byte[] b2 = String.valueOf(result).getBytes();

		InetAddress address = InetAddress.getLocalHost();


		DatagramPacket dp1 =new DatagramPacket(b1,b1.length,address,dp.getPort());

		ds.send(dp1);
	}
		
}
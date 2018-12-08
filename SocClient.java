//Work with TCP sockets : Client

import java.net.Socket;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SocClient{
	
	public static void main(String[] args) throws Exception{

		String ip = "localhost";
		int port = 9999;

		Socket socket = new Socket(ip,port);

		String str = "Hello server!!!";
		OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		out.println(str);
		out.flush();

		BufferedReader br = new BufferedReader(
										new InputStreamReader(socket.getInputStream()));
		String nickName = br.readLine();

		System.out.println("C: data from server :"+nickName);

	}
}

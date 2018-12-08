//Work with TCP sockets : TCP Server

import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SocServer{

	public static void main(String[] args) throws Exception{

		System.out.println("Serever started");
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("Serever is waiting for the client request");
		Socket socket = ss.accept();

		System.out.println("Client is connected");

		BufferedReader br = new BufferedReader(
										new InputStreamReader(socket.getInputStream()));
		String str = br.readLine();
		System.out.println("Client data :"+str);

		//String nickName = str.subString(0,3);

		OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		out.println(str);
		out.flush();

		System.out.println("S: Data sent from server "+str);
	}
	

}
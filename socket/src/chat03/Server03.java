package chat03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server03 {
	public static void main(String[] args) throws IOException{
	ServerSocket serverSocket = null;
	Socket socket = null;
	BufferedReader in = null;
	BufferedWriter  out = null;
	Scanner sc = new Scanner(System.in);
	
	try {
		serverSocket = new ServerSocket(7777);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	socket = serverSocket.accept();
	
	in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	
	while(true)
	{
		String inMessage = in.readLine();
		System.out.println("클라이언트로부터 온 메세지" + inMessage);
		
		System.out.println("서버에서 클라이언트로 보내기");
		String outMessage = sc.nextLine();
		out.write(outMessage + "\n");
		out.flush();
	}
	}
}
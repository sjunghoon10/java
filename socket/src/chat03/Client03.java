package chat03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client03 {
	public static void main(String[] args) throws IOException{
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		String serverIp = "localhost";
		
		try {
			socket = new Socket(serverIp,7777);
		
			 while(true)
			 {
				 System.out.println("서버에게 보낼 메세지");
				 String outMessage = sc.nextLine();
				 out.write();
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}
}

package v1_0;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	
	private Socket s;
	private DataInputStream dIn;
	
	Client() {
		
		try {
			
			// Create socket
			System.out.println("Starting client");
			s = new Socket("localhost", 6666);
			
			// Get message from server
			System.out.println("Recieving Message");
			dIn = new DataInputStream(s.getInputStream());
			String str = dIn.readUTF();
			System.out.println(str);
			
			// close socket
			s.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

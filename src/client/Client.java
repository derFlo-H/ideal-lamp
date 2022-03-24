package client;

import java.io.DataInputStream;
import java.net.Socket;

public class Client {
	
	private Socket s;
	private DataInputStream dIn;
	
	public static void main(String[] args) {
		
		new Client();
		
	}
	
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

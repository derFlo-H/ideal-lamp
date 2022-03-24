package server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private ServerSocket ss;
	private Socket s;
	private DataOutputStream dOut;
	
	public static void main(String[] args) {
		
		new Server();
		
	}
	
	Server() {
		
		try {
			
			// Create sockets
			System.out.println("Creating Server");
			ss = new ServerSocket(6666);
			s = ss.accept();
			System.out.println("Connected to client");
			
			// Create outputstream and send a string
			dOut = new DataOutputStream(s.getOutputStream());
			dOut.writeUTF("Hi");
			dOut.flush();
			System.out.println("Send message");
			
			// Close everything
			dOut.close();
			s.close();
			ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

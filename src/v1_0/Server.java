package v1_0;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private ServerSocket ss;
	private Socket s;
	private DataOutputStream dOut;
	
	void Server() {
		
		try {
			
			// Create sockets
			ss = new ServerSocket(6666);
			s = ss.accept();
			
			// Create outputstream and send a string
			dOut = new DataOutputStream(s.getOutputStream());
			dOut.writeChars("hi client");
			dOut.flush();
			
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

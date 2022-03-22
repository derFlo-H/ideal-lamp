package v1_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	
	private Socket s;
	private BufferedReader br;
	
	void Client() {
		
		try {
			
			// Create socket
			s = new Socket("localhost", 6666);
			
			// Get message from server
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str = br.readLine();
			System.out.println(str);
			
			// close socket
			s.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

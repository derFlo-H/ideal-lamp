package v1_0;

import java.util.Scanner;

public class Main {
	
	private static Server server;
	private static Client client;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String in = s.next();
		System.out.println(in);
		if(in.equals("client")) {
			client = new Client();
		} else {
			server = new Server();
		}
		
		s.close();
		
	}

}

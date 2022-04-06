package cntt61.h61133717;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CTChinh {

	public static void main(String[] args) throws IOException {
		ServerSocket socketserver = new ServerSocket(5555);
		System.out.print("I'm listening on port number 5555...");
		int id=0;
		while(true) {
			Socket s = socketserver.accept();
			id++;
			DichSo luongTask = new DichSo(s,id);
			luongTask.start();
		}
	}

}

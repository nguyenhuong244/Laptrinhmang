package cntt61.h61133717;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CTchinh {

	public static void main(String[] args) throws IOException {
		ServerSocket socketserver = new ServerSocket(9999);
		System.out.print("I'm listening on port number 9999");
		int id=0;
		while(true) {
			Socket s = socketserver.accept();
//			new LuongLamViec(s,id++).start();
			id++;
			LuongLamViec luongTask = new LuongLamViec(s,id);
			luongTask.start();
		}
	}

}

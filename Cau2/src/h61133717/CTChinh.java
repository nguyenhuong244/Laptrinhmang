package h61133717;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CTChinh {

	public static void main(String[] args) throws IOException {
		ServerSocket socketserver = new ServerSocket(9999);
		System.out.print("Máy chủ 9999 đang nghe...");
		int id=0;
		while(true) {
			Socket s = socketserver.accept();
			id++;
			LuongLamViec luongTask = new LuongLamViec(s, id);
			luongTask.start();
		}
	}

}

package TCP;

import java.io.IOException;
import java.net.Socket;

public class VD1 {

	public static void main(String[] args) {
		try {
			Socket soc = new Socket("ntu.edu.vn", 80);
			System.out.print("Connect!..");
		} catch (IOException e) {

			System.out.print("NoConnect....");
			e.printStackTrace();
		}

	}

}

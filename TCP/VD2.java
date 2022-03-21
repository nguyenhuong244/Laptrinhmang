package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class VD2 {

	public static void main(String[] args) {
		try {
			Socket soc = new Socket("time-a-g.nist.gov", 13);
			System.out.print("Connect!..");
			
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buff = new BufferedReader(inReader);
			
			System.out.println(buff.readLine());
			System.out.println(buff.readLine());
			
		} catch (IOException e) {

			System.out.print("NoConnect....");
			e.printStackTrace();
		}

	}

}

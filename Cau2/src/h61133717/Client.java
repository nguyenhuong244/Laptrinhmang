package h61133717;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socketclient = new Socket("localhost",9999);
			System.out.print("Kết nối thành công");
			
			OutputStream osToClient = socketclient.getOutputStream();
			OutputStreamWriter W2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(W2client);
			
			InputStream in = socketclient.getInputStream();
			InputStreamReader R2client = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(R2client);
			
			Scanner bp = new Scanner(System.in);
			while(true) {
				System.out.print("\nClient: ");
				String chuoiGui = bp.nextLine();
				buffW.write(chuoiGui+"\n");
				buffW.flush();
				
				String chuoiNhan = buffR.readLine();
				System.out.print("Server: "+ chuoiNhan);
				if(chuoiGui.contains("end")) break;
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

}

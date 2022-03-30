package till;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class AppEchoClient {

	public static void main(String[] args) {
		try {
			//Tạo 1 kết nối Socket đến Server time.nist.gov
			Socket soc = new Socket("localhost", 9999);
			System.out.print("Connect!");

			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);
			
			OutputStream osToClient = soc.getOutputStream();
			OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2client);
			
			//lấy chuỗi nhập từ bàn phím
			Scanner bp = new Scanner(System.in);
			while(true) {
//				System.out.println("\n"+buffR.readLine());
				System.out.print("\nClient:");
				String chuoiGui = bp.nextLine();
				//gửi đi, nếu chuỗi không phải là bye
				buffW.write(chuoiGui+"\n");
				buffW.flush();
				//nhận về 
				String chuoiNhan = buffR.readLine();
				System.out.print("Server: "+chuoiNhan);
				if(chuoiGui.equals("Bye")||chuoiGui.equals("bye")) break;
			}
			soc.close();
			
		} catch (IOException e) {

			System.out.print("NoConnect....");
			e.printStackTrace();
		}

	}

}

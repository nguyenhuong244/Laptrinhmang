package till;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AppEchoServer {

	public static void main(String[] args) {
		try {
			//mở cổng và bắt đầu nghe
			ServerSocket socketserver = new ServerSocket(9999);
			System.out.print("I'm listening on port number 9999");
			//luôn luôn lắng nghe
			while(true) {
				//khi có 1 yêu cầu tới, thì Accept, mở 1 socket để làm việc với client đó
				Socket socketclient = socketserver.accept();
				//gửi trả câu "Xin chào"
				//b1.Lấy về luông xuất
				OutputStream osToClient = socketclient.getOutputStream();
				OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
				BufferedWriter buffW = new BufferedWriter(write2client);
				
				InputStream in = socketclient.getInputStream();
				InputStreamReader inReader = new InputStreamReader(in);
				BufferedReader buffR = new BufferedReader(inReader);
				while(true) {
//					buffW.write("Mời nhập a:");
//					buffW.flush();
					//Nhận dữ liệu
					String chuoiNhan=buffR.readLine();
					String chuoiGui=chuoiNhan;
					
					buffW.write(chuoiGui+"\n");
					buffW.flush();
					if(chuoiGui.equals("Bye")||chuoiGui.equals("bye")) break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

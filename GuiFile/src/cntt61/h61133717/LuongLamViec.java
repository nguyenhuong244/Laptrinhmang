package cntt61.h61133717;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class LuongLamViec extends Thread{
	Socket socketClient;
	int id = -1;
	public LuongLamViec(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
	}
	public void guifile(String tenFile)throws IOException{
		//lấy về luồng nhập từ file
		FileReader fr = new FileReader(tenFile);
		BufferedReader buffR = new BufferedReader(fr);
		//lấy về luồng xuất (để gửi về client)
		OutputStream osToClient = socketClient.getOutputStream();
		OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
		BufferedWriter buffW = new BufferedWriter(write2client);
		//Đọc từng dòng
		String line;
		while((line=buffR.readLine()) != null) {
			//gửi về
			buffW.write(line);
			buffW.flush();
		}
		fr.close();
	}
	@Override
	public void run() {
		try {
			System.out.print(socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			
			OutputStream osToClient = socketClient.getOutputStream();
			OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2client);
			
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);
			
			while(true) {
				String chuoiNhan=buffR.readLine();
				System.out.print("\n"+chuoiNhan);
				
				if(chuoiNhan.equals("1")) {
					
				}
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}

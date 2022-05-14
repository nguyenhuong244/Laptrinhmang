package h61133717;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
	String guifile(File tenFile)throws IOException{
		FileReader fr = new FileReader(tenFile);
		BufferedReader buffR = new BufferedReader(fr);

		OutputStream osToClient = socketClient.getOutputStream();
		OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
		BufferedWriter buffW = new BufferedWriter(write2client);

		String line;
		while((line=buffR.readLine()) != null) {
			buffW.write(line);
			buffW.flush();
		}
		fr.close();
		return "";
	}
	
	public void run() {
		try {
			System.out.print(socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			
			OutputStream osToClient = socketClient.getOutputStream();
			OutputStreamWriter W2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(W2client);
			
			InputStream in = socketClient.getInputStream();
			InputStreamReader R2client = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(R2client);
			while(true) {
				String chuoinhan = buffR.readLine();
				System.out.print("\n"+chuoinhan);
				String name = null;
				if(chuoinhan.contains("create")) {
					for (String item : chuoinhan.split("create ")) {
						name = item;
					}
					File file = new File("D://"+ name); 
					if (file.createNewFile()) {
						System.out.print("\nDa tao file thanh cong!");
						String chuoigui = "Da tao file thanh cong";
						buffW.write(chuoigui+"\n");
						buffW.flush();
					}
					else {
						System.out.print("\nTao file that bai");
						String chuoigui = "Tao file that bai";
						buffW.write(chuoigui+"\n");
						buffW.flush();
					}
				}
				if(chuoinhan.contains("delete")) {
					for (String item : chuoinhan.split("delete ")) {
						name = item;
					}
					File file = new File("D://"+ name); 
					if(file.delete()) {
						System.out.print("\nDa xoa file thanh cong!");
						String chuoigui = "Da xoa file thanh cong";
						buffW.write(chuoigui+"\n");
						buffW.flush();
					}
					else {
						System.out.print("\nXoa file that bai");
						String chuoigui = "Xoa file that bai";
						buffW.write(chuoigui+"\n");
						buffW.flush();
					}
				}
				if(chuoinhan.contains("get")) {
					for (String item : chuoinhan.split("get ")) {
						name = item;
					}
					File file = new File("D://"+ name); 
					String chuoigui=guifile(file);
					buffW.write(chuoigui+"\n");
					buffW.flush();
					
				}
				if(chuoinhan.contains("end")) {
					String chuoigui="Kết thúc";
					buffW.write(chuoigui+"\n");
					buffW.flush();
					break;
				}
			}
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}

}

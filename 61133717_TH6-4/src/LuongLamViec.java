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
	void guifile(String tenFile)throws IOException{
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
					guifile("D:\\eclipse\\LapTrinhMang\\Laptrinhmang\\61133717_TH6-4\\file.txt\\1.txt");
//					buffW.flush();
				}else if(chuoiNhan.equals("2")) {
					guifile("D:\\2.txt");
					buffW.flush();
				}else if(chuoiNhan.equals("3")) {
					guifile("D:\\3.txt");
					buffW.flush();
				}else if(chuoiNhan.equals("4")) {
					guifile("D:\\4.txt");
					buffW.flush();
				}else if(chuoiNhan.equals("5")) {
					guifile("D:\\5.txt");
					buffW.flush();
				}else if(chuoiNhan.equals("6")) {
					guifile("D:\\6.txt");
					buffW.flush();
				}else if(chuoiNhan.equals("7")) {
					guifile("D:\\7.txt");
					buffW.flush();
				}else if(chuoiNhan.equals("8")) {
					guifile("D:\\8.txt");
					buffW.flush();
				}else if(chuoiNhan.equals("9")) {
					guifile("D:\\9.txt");
					buffW.flush();
				}else if(chuoiNhan.equals("10")) {
					guifile("D:\\10.txt");
					buffW.flush();
				}else if(chuoiNhan.equals("0")) {
					buffW.write("Kết thúc"+"\n");
					buffW.flush();
					break;
				}
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
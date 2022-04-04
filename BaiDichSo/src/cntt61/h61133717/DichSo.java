package cntt61.h61133717;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class DichSo extends Thread{
	Socket socketClient;
	int id = -1;
	public DichSo(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
	}
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
			
			while(true){
				String chuoiNhan=buffR.readLine();
				System.out.print(chuoiNhan);
				
				if(chuoiNhan.equals("0\n")) {
					String chuoiGui= "zero";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("1\n")) {
					String chuoiGui= "one";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("2\n")) {
					String chuoiGui= "two";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("3\n")) {
					String chuoiGui= "three";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("4\n")) {
					String chuoiGui= "four";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("5\n")) {
					String chuoiGui= "five";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("6\n")) {
					String chuoiGui= "six";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("7\n")) {
					String chuoiGui= "seven";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("8\n")) {
					String chuoiGui= "eight";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("9\n")) {
					String chuoiGui= "night";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("10\n")) {
					break;
				}
				
			}
			socketClient.close();
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}
}

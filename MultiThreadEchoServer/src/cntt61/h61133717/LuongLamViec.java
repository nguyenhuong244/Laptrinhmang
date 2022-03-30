package cntt61.h61133717;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class LuongLamViec extends Thread{
	Socket socketclient;
	int id = -1;
	public LuongLamViec(Socket socketclient, int id) {
		super();
		this.socketclient = socketclient;
		this.id = id;
	}
	
	@Override
	public void run() {
		try {
			System.out.print(socketclient.getInetAddress().getHostAddress());
			System.out.print(id);
			
			OutputStream osToClient = socketclient.getOutputStream();
			OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2client);
			
			InputStream in = socketclient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);
			
			while(true) {
				String chuoiNhan=buffR.readLine();
				System.out.print(chuoiNhan);
				
				String chuoiGui=chuoiNhan;
				buffW.write(chuoiGui+"\n");
				buffW.flush();
				if(chuoiGui.equals("Bye")||chuoiGui.equals("bye")) break;
			}
			socketclient.close();
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}

}

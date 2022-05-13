package h61133717;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
				float KQ = Float.parseFloat(chuoinhan);
				if(KQ%2==0 && KQ!=0) {
					String chuoigui = "Số chẵn";
					buffW.write(chuoigui+"\n");
					buffW.flush();
				}
				else if(KQ%2!=0 && KQ!=0) {
					String chuoigui = "Số lẻ";
					buffW.write(chuoigui+"\n");
					buffW.flush();
				}
				else if(KQ==0) {
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

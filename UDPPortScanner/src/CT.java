import java.net.DatagramSocket;
import java.net.SocketException;

public class CT {

	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			try {
				DatagramSocket socket = new DatagramSocket(1);
				
				socket.close();
				System.out.print("Cổng "+i+": ON\n");
			}catch(SocketException e) {
				System.out.print("Cổng "+i+": OFF");
			}
		}
	}

}

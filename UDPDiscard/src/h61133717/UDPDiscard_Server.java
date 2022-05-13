package h61133717;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPDiscard_Server {
	
	public static void main(String[] args) throws IOException {
		//lắng nghe cổng 9
		DatagramSocket server = new DatagramSocket(9);
		//chuẩn bị vùng nhớ để nhận gói
		byte[] buffer = new byte[1000];
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
		while(true) {
			//nhận về, đưa vào packet UDP
			server.receive(packet);
			//trích thông tin ra, mảng byte data nhận được thành chuỗi
			//từ byte đầu tiên --> byte cuối cùng
			String s = new String (packet.getData( ), 0, packet.getLength( ));
			//In ra màn hình thông tin
			System.out.println("UDP_Server: "+packet.getAddress( ) + " at port "
					+ packet.getPort( ) + " says " + s);
		}
	}
}

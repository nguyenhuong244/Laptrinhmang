package h61133717;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPDiscard_Client {

	public static void main(String[] args) {
		String hostABC = "localhost";
		try {
			//tạo socket
			DatagramSocket theSocket = new DatagramSocket();
			int dem =0;
			while(true) {
				//lấy dữ liệu từ bàn phím
				System.out.print("UDP_Client: ");
				Scanner bp = new Scanner(System.in);
				String theLine = bp.nextLine();
				
				//chuyển thành mảng byte
				byte[] buff = theLine.getBytes();
				//đóng gói vào packet (UDP Datagram)
				DatagramPacket thePacket = new DatagramPacket(buff, buff.length);
				//cài thông tin header cho gói UDP
				InetAddress addressABC = InetAddress.getByName(hostABC);
				thePacket.setAddress(addressABC);
				thePacket.setPort(9);
				//gửi đi
				theSocket.send(thePacket);
				if(dem<100) dem++;//gửi 100 lần
				else break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

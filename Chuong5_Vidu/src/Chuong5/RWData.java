package Chuong5;
import java.io.*;
public class RWData {

	public static void main(String[] args) throws IOException {
		DataOutputStream dataOut;
		DataInputStream dataIn;
		int i = 10;
		double d = 1023.56;
		boolean b = true; 
		try
		{
		dataOut = new DataOutputStream( new FileOutputStream("testdata"));
		}
		catch(IOException exc) {
			System.out.println("Không thể mở file"); 
			return; 
		}
		try
		{
			System.out.println("Thêm " + i);
			dataOut.writeInt(i);
			System.out.println("Thêm " + d);
			dataOut.writeDouble(d);
			System.out.println("Thêm " + b);
			dataOut.writeBoolean(b);
			System.out.println("Thêm " + 12.2 * 7.4);
			dataOut.writeDouble(12.2 * 7.4);
		}
		catch(IOException exc)
		{
			System.out.println("Ghi lỗi.");
		} 
		dataOut.close();
		System.out.println();
		try
		{
			dataIn = new DataInputStream( new FileInputStream("testdata"));
		}
		catch(IOException exc)
		{
			System.out.println("Không thể mở file"); return;
		}
		try
		{
			i = dataIn.readInt();
			System.out.println("Đọc " + i);
			d = dataIn.readDouble();
			System.out.println("Đọc " + d);
			b = dataIn.readBoolean();
			System.out.println("Đọc " + b);
			d = dataIn.readDouble();
			System.out.println("Đọc " + d);
		}
		catch(IOException exc) { 
			System.out.println("Lỗi!!!");
		}
			dataIn.close();

	}

}

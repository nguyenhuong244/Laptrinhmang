package files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DocFileNhiPhan {

	public static void main(String[] args) throws IOException {
		// Tạo đối tượng OutputStream
		InputStream is;
		//Gắn vào file
		FileInputStream FIn = new FileInputStream("test.dat");
		//Gắn os vào FOut
		is=FIn;
		//Tạo và gắn vào DataOutputStream
		DataInputStream dtIn = new DataInputStream(FIn);
		//Ghi dữ liệu
		int a=dtIn.readInt();
		double b=dtIn.readDouble();
		String chuoi=dtIn.readUTF();
		dtIn.close();
		is.close();
		FIn.close();
		System.out.print("Hoàn thành.");
		System.out.print(a);
		System.out.print(b);
		System.out.print(chuoi);

	}

}

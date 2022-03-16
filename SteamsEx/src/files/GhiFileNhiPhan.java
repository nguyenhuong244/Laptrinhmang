package files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GhiFileNhiPhan {

	public static void main(String[] args) throws IOException {
		// Tạo đối tượng OutputStream
		OutputStream os;
		//Gắn vào file
		FileOutputStream FOut = new FileOutputStream("test.dat");
		//Gắn os vào FOut
		os=FOut;
		//Tạo và gắn vào DataOutputStream
		DataOutputStream dtOut = new DataOutputStream(FOut);
		//Ghi dữ liệu
		dtOut.writeInt(123);
		dtOut.writeDouble(4.5);
		dtOut.writeUTF("Lớp 61 MMT");
		dtOut.close();
		os.close();
		FOut.close();
		System.out.print("Hoàn thành.");
		

	}

}

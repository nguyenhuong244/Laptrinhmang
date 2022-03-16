package input;

import java.io.IOException;
import java.io.InputStream;

public class Read1CharByInputStream {

	public static void main(String[] args) throws IOException { //throws IOException(ép lỗi cho chương trình chính)
		// Tạo một đối tượng của lớp InputStream
		InputStream is;
		//Gắn nó với luồng nhập chuẩn(Bàn phím)
		is = System.in;
		//Đọc 1 ký tự
		//-------------------------------
		//Cách bắt lỗi
//		try {
//			System.out.print("Mời nhập 1 ký tự: ");
//			int kt = is.read();
//			//nơi thực hiện các lệnh có khả năng sinh ra lỗi/ngoại lệ
//			System.out.print("Ký tự bạn vừa nhập: "+(char)kt);//nếu không ép kiểu thì nó sẽ in ra ASCII
//		}catch(IOException e) {
//			e.printStackTrace();
//			System.out.print("Bị lỗi!!!");
//			//nơi xử lý nếu có ngoại lệ xảy ra
//		}
		//------------------------------------
		// ép lỗi cho người khác
		System.out.print("Mời nhập 1 ký tự: ");
		int kt = is.read();
		System.out.print("Ký tự bạn vừa nhập: "+(char)kt);
	}

}

package input;

import java.io.IOException;
import java.io.InputStreamReader;

public class Read1CharByReader {
//ví dụ: đọc 1 ký tự sử dụng luồng dùng lớp InputStreamReader
	public static void main(String[] args) throws IOException {
		//Tạo 1 đối tượng của lớp InputStreamReader 
		InputStreamReader isRdr;
		isRdr = new InputStreamReader(System.in);
		System.out.print("Mời nhập 1 ký tự: ");
		int kt = isRdr.read();
		System.out.print("Ký tự bạn vừa nhập: "+(char)kt);
	}

}

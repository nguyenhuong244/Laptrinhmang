package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read1Line {

	public static void main(String[] args) throws IOException {
		// ví dụ: nhập 1 chuỗi ký tự
		//Tạo 1 đối tượng của lớp InputStreamReader 
		InputStreamReader isRdr;
		isRdr = new InputStreamReader(System.in);
		//Tạo đối tượng BufferedReader
		BufferedReader buffReader = new BufferedReader(isRdr);
		
		//Đọc 1 chuỗi từ bàn phím
		System.out.print("Mời nhập chuỗi ký tự: ");
		String strLine = buffReader.readLine();
		System.out.print("Ký tự bạn vừa nhập: "+strLine);

	}

}

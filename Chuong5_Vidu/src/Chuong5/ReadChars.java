package Chuong5;
import java.io.*;
public class ReadChars {

	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhập chuỗi ký tự, giới hạn trước dấu .");
		 // Đọc ký tự
		do
		{
			c = (char) br.read();
			System.out.println(c);
		} while(c != '.'); 

	}

}

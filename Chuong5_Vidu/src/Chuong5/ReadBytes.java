package Chuong5;

import java.io.*;

public class ReadBytes {

	public static void main(String[] args) throws IOException {
		byte data[] = new byte[100];
		System.out.print("Nhập 1 chuỗi ký tự: ");
		System.in.read(data);
		System.out.print("Chuỗi mới nhập: ");
		
		for(int i=0;i<data.length;i++)
			System.out.print((char) data[i]);

	}

}

package Chuong5;
import java.io.*;
public class ReadFile {

	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fin;
		try {
			fin = new FileInputStream("D:\\eclipse\\LapTrinhMang\\Chuong5_Vidu\\test.txt");
		}
		catch(FileNotFoundException exc) {
			System.out.print("Lỗi!!!");
			return;
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.print("Hoàn thành");
			return;
		}
		
		// đọc byte đến khi gặp EOF
		do {
			i=fin.read();
			if(i != -1) System.out.print((char) i);
		}while(i != -1);
		fin.close();

	}

}

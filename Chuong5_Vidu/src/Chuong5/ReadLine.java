package Chuong5;
import java.io.*;
public class ReadLine {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.print("Nhập 'stop' để kết thúc chương trình. ");
		System.out.print("Nhập chuỗi: ");
		do
		{
			str = br.readLine();
			System.out.println(str);
		} while(!str.equals("stop")); 

	}

}

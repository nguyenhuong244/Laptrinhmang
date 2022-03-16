package Chuong5;
import java.io.*;
public class CopyFile {

	public static void main(String[] args)throws IOException {
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		try {
			//mở file muốn copy
			try {
				fin = new FileInputStream("D:\\eclipse\\LapTrinhMang\\Chuong5_Vidu\\test.txt");
			}
			catch(FileNotFoundException exc){
				System.out.print("Không tìm thấy file!!!");
				return;
			}
			//mở file để copy nội dung vào
			try
			{
				fout = new FileOutputStream("D:\\eclipse\\LapTrinhMang\\Chuong5_Vidu\\dest.txt");
			}
			catch(FileNotFoundException exc)
			{
				System.out.println("Không tìm thấy file!!!"); 
				return;
			} 
		}
		catch(ArrayIndexOutOfBoundsException exc){
			System.out.print("Hoàn thành");
			return;
		}
		try
		{
			do
			{
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		} 
		catch(IOException exc) {
			System.out.print("Lỗi File");
		}
		fin.close();
		fout.close();

	}

}

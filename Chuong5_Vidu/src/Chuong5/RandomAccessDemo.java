package Chuong5;
import java.io.*;
public class RandomAccessDemo {

	public static void main(String[] args) throws IOException {
		double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25}; 
		double d;
		RandomAccessFile raf;
		try
		{ 
			raf = new RandomAccessFile("D:\\eclipse\\LapTrinhMang\\Chuong5_Vidu\\random.dat","rw");
		}
		catch(FileNotFoundException exc)
		{
			System.out.println("Lỗi!!!"); 
			return ;
		}
		// Thêm giá trị vào file.
		for(int i=0; i < data.length; i++)
		{ 
			try
			{
				raf.writeDouble(data[i]);
			}
			catch(IOException exc)
			{
				System.out.println("Lỗi!!");
				return ;
			}
		} 
		try {
			// Đọc lại các giá trị
			raf.seek(0);
			d = raf.readDouble();
			System.out.println("Giá trị 1: " + d);
			raf.seek(8);
			d = raf.readDouble();
			System.out.println("Giá trị 2: " + d);
			raf.seek(8 * 3);
			d = raf.readDouble();
			System.out.println("Giá trị 3: " + d);
			System.out.println();
			// 
			System.out.println("Giá trị khác: ");
			for(int i=0; i < data.length; i+=2)
			{
			raf.seek(8 * i);
			d = raf.readDouble();
			System.out.print(d + " ");
			}
			System.out.println("\n");
		}
		catch(IOException exc)
		{
			System.out.println("Lỗi!");
		}
		raf.close();

	}

}

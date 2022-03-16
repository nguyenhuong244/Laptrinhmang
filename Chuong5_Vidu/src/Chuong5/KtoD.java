package Chuong5;
import java.io.*;
public class KtoD {

	public static void main(String[] args) throws IOException {
		String str;
		FileWriter fw;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		try
		{
			fw = new FileWriter("D:\\eclipse\\LapTrinhMang\\Chuong5_Vidu\\testUnicode.txt");
		}
		catch(IOException exc)
		{
			System.out.println("Không thể mở file."); 
			return ;
		}
		 	System.out.println("Nhập 'stop' để kết thúc chương trình.");
		do
		{
			System.out.print("Nhập: ");
			str = br.readLine();
			if(str.compareTo("stop") == 0) break;
			str = str + "\r\n";
			fw.write(str);
		} while(str.compareTo("stop") != 0);
		fw.close(); 

	}

}

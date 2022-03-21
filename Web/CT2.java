package Web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CT2 {

	public static void main(String[] args) throws IOException {
		String chuoiURL="https://www.ntu.edu.vn/Gioi-thieu/Thong-điep-cua-Hieu-truong";
		//
		URL u = new URL(chuoiURL);
		//Mở kết nối
		URLConnection uCon = u.openConnection();
		uCon.connect();
		
		
		// Lấy về luồng nhập
		InputStream in = uCon.getInputStream();
		InputStreamReader inR = new InputStreamReader(in);
		BufferedReader buff = new BufferedReader(inR);
		//đoc buffer để in ra màn hình
		String lineHTML;
		while(true)
		{
			lineHTML = buff.readLine();
			if(lineHTML==null) break;
			else System.out.println(lineHTML);
		}
		
		buff.close();
		inR.close();
		in.close();

	}

}

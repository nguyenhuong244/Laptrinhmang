package Web;

import java.net.URLConnection;
import java.io.IOException;
import java.net.URL;

public class HeaderHTTP {

	public static void main(String[] args) throws IOException {
		String chuoiURL="https://www.ntu.edu.vn/Gioi-thieu/Thong-điep-cua-Hieu-truong";
		
		URL u = new URL(chuoiURL);
		
		URLConnection uCon = u.openConnection();
		uCon.connect();
		System.out.print("Connect: " + uCon.getContentType() );

	}

}

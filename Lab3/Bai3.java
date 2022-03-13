package Lab3;
import java.util.Arrays;
import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử mảng: ");
		int n = scanner.nextInt();
		int mang[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.printf("Nhập phần tử thứ %d: ",i+1);
			mang[i] = scanner.nextInt();
		}
		System.out.println("-----------------------------------------");
		System.out.println("Mảng được nhập: "+Arrays.toString(mang));
		Arrays.sort(mang);
		System.out.println("Mảng sau khi sắp xếp: "+Arrays.toString(mang));
		System.out.println("-----------------------------------------");
		//------------------------------------------------------------------------
		int min = mang[0];
		for(int i=0;i<n;i++) {
			min = Math.min(min, mang[i]);
		}
		System.out.println("Số nhỏ nhất mảng: "+min);
		//------------------------------------------------------------------------
		System.out.println("-----------------------------------------");
		int tong=0,dem=0;
		for(int i=0;i<n;i++) {
			if(mang[i]%3==0) {
				tong+=mang[i];
				dem++;
			}
		}
		System.out.println("Kết quả: "+(float)tong/dem);
	}

}

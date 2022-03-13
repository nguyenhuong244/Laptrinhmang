package Lab3;
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		boolean ok = true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập n:");
		int N = scanner.nextInt();
		
		for(int i=2;i<N-1;i++) {
			if(N%i==0) {
				ok = false;
				break;
			}
			i++;
		}
		if(ok = true) {
			System.out.print(N+" là số nguyên tố!");
		}
		else {
			System.out.print(N+" không phải là số nguyên tố!");
		}

	}

}

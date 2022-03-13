package Lab3;
import java.util.Scanner;
public class Bai4 {

	public static void SX(String sv[],double Diem[]) {
		for(int i=0;i<sv.length-1;i++) {
			for(int j=i+1;j<sv.length;j++) {
				if(Diem[i]>Diem[j]) {
					double diemtam = Diem[i];
					Diem[i] = Diem[j];
					Diem[j] = diemtam;
					String svtam = sv[i];
					sv[i] = sv[j];
					sv[j] = svtam;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng sinh viên: ");
		int n = scanner.nextInt();
		//------------------------------------------------------------------
		String sv[] = new String[n];
		double Diem[] = new double[n];
		for(int i=0;i<n;i++) {
			System.out.print("Nhập Họ và Tên sinh viên thứ "+(i+1)+" : ");
			scanner.nextLine();
			sv[i] = scanner.nextLine();
			System.out.print("Nhập điểm sinh viên thứ "+(i+1)+" : ");
			Diem[i] = scanner.nextDouble();
		}

		System.out.println("-----------------------------------------");
		System.out.println("Danh sách SV được nhập!!!");
		for(int i=0;i<n;i++) {
			System.out.println("Họ và Tên SV "+(i+1)+" : "+sv[i]);
			System.out.println("Điểm SV "+(i+1)+" :"+Diem[i]);
		}
		SX(sv, Diem);
		System.out.println("-----------------------------------------");
		System.out.println("Danh sách sau khi có thêm học lực!!!");
		for(int i=0;i<n;i++) {
			if(Diem[i]<5) {
				System.out.println("Họ và Tên SV: "+sv[i]+"\nĐiểm SV: "+Diem[i]+"\nHọc lực: Yếu");
			}
			if(Diem[i]>=5 && Diem[i]<6.5) {
				System.out.println("Họ và Tên SV: "+sv[i]+"\nĐiểm SV: "+Diem[i]+"\nHọc lực: Trung bình");
			}
			if(Diem[i]>=6.5 && Diem[i]<7.5) {
				System.out.println("Họ và Tên SV: "+sv[i]+"\nĐiểm SV: "+Diem[i]+"\nHọc lực: Khá");
			}
			if(Diem[i]>=7.5 && Diem[i]<9) {
				System.out.println("Họ và Tên SV: "+sv[i]+"\nĐiểm SV: "+Diem[i]+"\nHọc lực: Giỏi");
			}
			if(Diem[i]>=9) {
				System.out.println("Họ và Tên SV: "+sv[i]+"\nĐiểm SV: "+Diem[i]+"\nHọc lực: Xuất sắc");
			}
		}
		
	}

}

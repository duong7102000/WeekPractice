package week2;

public class Bai7 {
	public static void main(String[] args) {
		int dem0=0, dem1=0, dem2=0, dem3=0;
		for(int i=1; i<=100; i++) {
			if(i%5==0) dem0++;
			if(i%5==1) dem1++;
			if(i%5==2) dem2++;
			if(i%5==3) dem3++;
		}
		System.out.println("Số số chia hết cho 5 là: " + dem0);
		System.out.println("Số chia 5 dư 1 là: " + dem1);
		System.out.println("Số chia 5 dư 2 là: " + dem2);
		System.out.println("Số chia 5 dư 3 là: " + dem3);
		System.out.println("Đào Tùng Dương - 20183509");
	}
}

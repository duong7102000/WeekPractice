package week2;

public class Bai3b {
	public static void main(String[] args) {
		int n=10, i=2;
		double tong=1, mau=1, tich=1;
		while (i<=n) {
			tich = tich * i;
			mau = mau + tich;
			tong = tong + (1/mau);
			i = i + 1;
		}
		System.out.print("Kết quả với n = 10: "+tong);
		System.out.println("\nĐào Tùng Dương - 20183509");
	}
}

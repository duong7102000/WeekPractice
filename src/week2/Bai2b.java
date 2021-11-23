package week2;

public class Bai2b {
	public static void main(String[] args) {
		int n=10, i=1;
		double tong=0, mau=0;
		while (i<=n) {
			mau = mau + i;
			tong = tong + (1/mau);
			i = i + 1;
		}
		System.out.print("Kết quả với n = 10: "+tong);
		System.out.println("\nĐào Tùng Dương - 20183509");
	}
}

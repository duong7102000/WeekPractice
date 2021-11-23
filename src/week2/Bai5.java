package week2;
public class Bai5 {
	public static void main(String[] args) {
		System.out.println("Các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3, 5 và 7 là:");
		for (int i=1000; i<=2000; i++) {
			if((i%3==0)&&(i%5==0)&&(i%7==0)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nĐào Tùng Dương - 20183509");
	}
}

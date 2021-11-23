package week2;
public class Bai4 {
	public static void main(String[] args) {
		System.out.println("Các số nhỏ hơn 100 và chia hết cho 3, 7 là:");
		for (int i=1; i<=100; i++) {
			if((i%3==0)||(i%7==0)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nĐào Tùng Dương - 20183509");
	}
}

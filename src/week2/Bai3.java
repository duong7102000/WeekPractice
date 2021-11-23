package week2;
public class Bai3 {
	public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
        System.out.println("Các số nguyên tố từ 1000 đến 2000 là:");
        for(int i=1000; i<=2000; i++){
        	if(isPrimeNumber(i)) {
        		System.out.print(i + " ");
        	}
        }
        System.out.println("\nĐào Tùng Dương - 20183509");
    }
}

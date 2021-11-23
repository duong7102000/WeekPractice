package week2;
public class Bai2 {
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
        System.out.println("20 số nguyên tố đầu tiên là:");
        int dem = 0, i = 0;
        while(dem < 20) {
        	if(isPrimeNumber(i)) {
        		System.out.print(i + " ");
        		dem++;
        	}
        	i++;
        }
        System.out.println("\nĐào Tùng Dương - 20183509");
    }
}

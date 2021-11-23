package week2;

public class Bai8 {
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
        System.out.println("Ước nguyên tố nhỏ nhất của 2310 là: ");
        for (int i = 0; i <= 2310; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i);
                break;
            }
        }
        System.out.println("\nĐào Tùng Dương - 20183509");
    }
}

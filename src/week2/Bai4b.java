package week2;

public class Bai4b {
	public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
	public static void main(String[] args) {
		System.out.print("Số Fibonacci thứ 10 là: " + fibonacci(10));
		System.out.println("\nĐào Tùng Dương - 20183509");
	}
}

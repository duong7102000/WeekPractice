package week3;

import java.util.Arrays;
import java.util.List;

public class Bai5 {
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(7, 9, 5, 1, 4, 3);
        System.out.println("Day so: ");
        System.out.println(arrays);
        int numsnt = 0;
        for(int i:arrays){
            if(isPrimeNumber(i)){
                numsnt ++;
            }
        }
        System.out.println("So cac so nguyen to: " + numsnt);
        System.out.println("So cac hop so: " + (arrays.size() - numsnt));
        System.out.println("Dao Tung Duong - 20183509");
    }
}

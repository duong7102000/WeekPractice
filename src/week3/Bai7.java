package week3;

import java.util.Arrays;
import java.util.List;

public class Bai7 {
    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(7, 9, 5, 1, 4, 4);
        System.out.print("Day so: ");
        System.out.println(arrays);
        System.out.print("So thoa man yeu cau: ");
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if(!arrays.contains(i)){
                System.out.println(i);
                break;
            }
        }
        System.out.println("Dao Tung Duong - 20183509");
    }
}

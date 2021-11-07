package week3;

import java.util.Arrays;
import java.util.List;

public class Bai12 {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(7, 9, 5, 1, 4, 4, 5, 5, 5, 10);
        System.out.print("Day so a: ");
        System.out.println(a);
        List<Integer> b = Arrays.asList(7, 9, 5, 1, 4, 4, 5, 5, 5, 10, 12, 7);
        System.out.print("Day so b: ");
        System.out.println(b);
        boolean check = true;
        for (int i:
             a) {
            if(!b.contains(
                    i
            )) {check = false; break;}
        }
        if(check) System.out.println("Day a la day con cua day b");
        else System.out.println("Day a khong phai la day con cua day b");
        System.out.println("Dao Tung Duong - 20183509");
    }
}

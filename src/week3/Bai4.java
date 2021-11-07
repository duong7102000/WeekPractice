package week3;

import java.util.Arrays;
import java.util.List;

public class Bai4 {
    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(7, 9, 5, -1, 4, 4, -1);
        System.out.println("Day so:");
        System.out.println(arrays);
        int maxi = Integer.MIN_VALUE;
        for (int i:arrays) {
            if(i>maxi){
                maxi = i;
            }
        }
        System.out.println("Gia tri max: " + maxi);
        System.out.println("Cac chi so cua gia tri nay:");
        for (int i = 0; i < arrays.size(); i++) {
            if(arrays.get(i)==maxi){
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDao Tung Duong - 20183509");
    }
}

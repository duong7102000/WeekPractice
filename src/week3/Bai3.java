package week3;

import java.util.Arrays;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(7, 9, 5, -1, 4, 4, -1);
        System.out.println("Day so:");
        System.out.println(arrays);
        int mini = Integer.MAX_VALUE;
        for (int i:arrays) {
            if(i<mini){
                mini = i;
            }
        }
        System.out.println("Gia tri min: " + mini);
        System.out.println("Cac chi so cua gia tri nay:");
        for (int i = 0; i < arrays.size(); i++) {
            if(arrays.get(i)==mini){
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDao Tung Duong - 20183509");
    }
}

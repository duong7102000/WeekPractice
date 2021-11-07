package week3;

import java.util.Arrays;
import java.util.List;

public class Bai10 {
    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(7, 9, 5, 1, 4, 4, 5, 5, 5, 10);
        System.out.print("Day so: ");
        System.out.println(arrays);
        int max_size = Integer.MIN_VALUE;
        int max_first = -1;
        for (int i = 0; i < arrays.size()-1; i++) {
            int first = i;
            int size = 1;
            for (int j = i+1; j < arrays.size(); j++) {
                if(arrays.get(j) != arrays.get(i)) break;
                size ++;
            }
            if (size>max_size){
                max_size=size;
                max_first=first;
            }
        }
        System.out.println("So luong cua day con: " + max_size);
        System.out.println("Chi so dau tien cuar day con: " + max_first);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

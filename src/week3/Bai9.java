package week3;

import java.util.Arrays;
import java.util.List;

public class Bai9 {
    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(7, 9, 5, 1, 4, 4);
        System.out.print("Day so: ");
        System.out.println(arrays);
        int c = 4;
        System.out.println("So c: " + c);
        int lon=0, be=0, bang=0;
        for (int i:
             arrays) {
            if(i<c) be++;
            if (i==c) bang++;
            if (i>c) lon++;
        }
        System.out.println("So cac phan tu be hon so c: " + be);
        System.out.println("So cac phan tu lon hon so c: " + lon);
        System.out.println("So cac phan tu bang so c: " + bang);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

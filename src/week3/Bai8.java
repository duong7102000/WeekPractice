package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai8 {
    public static void main(String[] args) {
        Integer valuesInArray[]={7, 9, 5, 0, 1, 4, 4, 0};
        List arrays = new ArrayList(Arrays.asList(valuesInArray));
        System.out.print("Day so: ");
        System.out.println(arrays);
        boolean isRemoved = arrays.removeIf(t -> t.equals(0));
        System.out.print("Day sau khi xoa cac phan tu = 0: ");
        System.out.println(arrays);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

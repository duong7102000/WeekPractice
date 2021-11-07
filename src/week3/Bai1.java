package week3;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(7, 9, 5, -1, 4, 4);
        System.out.println("Day truoc khi sap xep:");
        System.out.println(arrays);
        arrays.sort((o1, o2) -> o2 - o1);
        System.out.println("Day sau khi sap xep:");
        System.out.println(arrays);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

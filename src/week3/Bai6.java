package week3;

import java.util.*;

public class Bai6 {
    public static List<Integer> listUoc(int i){
        List<Integer> l = new ArrayList<>();
        l.add(1);
        if(i<=2) return l;
        for (int j = 2; j < i; j++) {
            if(i%j==0){
                l.add(j);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.print("Day so: ");
        List<Integer> arrays = Arrays.asList(7, 9, 5, 1, 4, 3);
        System.out.println(arrays);
        Set<Integer> setA = new HashSet<Integer>();
        for (int i:arrays) {
            for (int j:
                 listUoc(i)) {
                if(arrays.contains(j)) setA.add(j);
            }
        }
        System.out.print("Cac phan tu la uoc cua 1 phan tu trong day: ");
        System.out.println(setA);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

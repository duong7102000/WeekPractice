package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai11 {
    static boolean checkTang(List<Integer> a){
        for (int i = 0; i < a.size()-1; i++) {
            if(a.get(i) >= a.get(i + 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Day so: ");
        int a[] = {1,2,6,3,6,8,5,3,5,7,10};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int maxf=-1, maxe=-1;
        int maxsize = Integer.MIN_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j < a.length; j++) {
                List<Integer> b = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    b.add(a[k]);
                }
                if(checkTang(b)){
                    if (b.size()>maxsize){
                        maxsize = b.size();
                        maxf=i; maxe=j;
                    }
                }
            }
        }
        System.out.print("\nDay con tang dai nhat: ");
        for (int i = maxf; i <= maxe; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nDao Tung Duong - 20183509");
    }
}

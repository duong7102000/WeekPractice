package week4;

public class Bai14 {

    static String process(String s, int i, int j){
        char [] s0 = s.toCharArray();
        char k = s0[i];
        s0[i] = s0[j];
        s0[j] = k;
        return String.valueOf(s0);
    }

    public static void main(String[] args) {
        String s1 = "1111100000";
        int n = 7;
        System.out.println("So n: "+n);
        System.out.println("Xau S1: "+s1);
        for (int i = 2; i <= n; i++) {
            s1 = process(s1, i - 1, i);
            System.out.println("Xau S" + i + ": " + s1);
        }
        System.out.println("Dao Tung Duong - 20183509");
    }
}

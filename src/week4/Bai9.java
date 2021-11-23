package week4;

public class Bai9 {
    public static void main(String[] args) {
        String s = "once upon a time";
        int i = 7, j = 10;
        System.out.println("Xau s: "+s);
        System.out.println("Chi so i va j: "+i + " "+j);
        char [] s0 = new char[s.length()];
        s0 = s.toCharArray();
        char k = s0[i];
        s0[i] = s0[j];
        s0[j] = k;
        System.out.println("Xau s da doi cho ky tu i va j: "+String.valueOf(s0));
        System.out.println("Dao Tung Duong - 20183509");
    }
}

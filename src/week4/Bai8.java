package week4;

public class Bai8 {
    public static void main(String[] args) {
        String s1 = "abcwnijqpmclabcabcabc";
        String s2 = "abc";
        System.out.println("Xau s1: "+s1);
        System.out.println("Xau s2: "+s2);
        int count = (s1.length() - s1.replace(s2, "").length())/s2.length();
        System.out.println("So lan xuat hien xau s2 trong xau s1: "+count);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

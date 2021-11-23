package week4;

public class Bai15 {
    public static void main(String[] args) {
        String s1 = "once upon a time";
        String s2 = "abc";
        String s3 = "";
        System.out.println("Xau s1: "+s1);
        System.out.println("Xau s2: "+s2);
        int middle = s1.length()/2;
        for (int i = 0; i < middle; i++) {
            s3 = s3 + s1.charAt(i);
        }
        s3 = s3 + s2;
        for (int i = middle; i < s1.length(); i++) {
            s3 = s3 + s1.charAt(i);
        }
        System.out.println("Xau s2 chen vao giua xau s1: "+s3);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

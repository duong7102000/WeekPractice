package week4;

public class Bai2 {

    public static void main(String[] args) {
        String line = "abcwnijqpmclabcabcabc";
        System.out.println("Xau cho truoc: "+line);
        int count = (line.length() - line.replace("abc", "").length())/3;
        System.out.println("So lan xuat hien xau 'abc': "+count);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

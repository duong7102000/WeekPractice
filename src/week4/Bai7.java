package week4;
import java.util.regex.Pattern;

public class Bai7 {
    public static void main(String[] args) {
        String s1 = "jivmapm28401mmkwpc2048";
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            if(Pattern.matches("[0-9]", String.valueOf(s1.charAt(i)))){
                s2 = s2 + "$";
            }
            else s2 = s2 + s1.charAt(i);
        }
        System.out.println("Xau s1: "+s1);
        System.out.println("Xau s2: "+s2);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

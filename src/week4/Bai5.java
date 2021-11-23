package week4;

public class Bai5 {
    public static void main(String[] args) {
        String s1 = "0000000001111101010100111";
        String s2 = new String();
        for (int i = 0; i < s1.length()-1; i++) {
            s2 = s2 + s1.charAt(i);
            if(s1.charAt(i)!=s1.charAt(i+1)){
                s2 = s2+" ";
            }
        }
        s2 = s2+ s1.charAt(s1.length() - 1);
        System.out.println("Xau cu: "+s1);
        System.out.println("Xau moi: "+s2);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

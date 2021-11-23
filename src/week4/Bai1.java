package week4;

public class Bai1 {
    public static void main(String[] args) {
        String ten = "    Dao   Tung      Duong     ";
        System.out.println("Ten truoc: "+ten);
        String ten1 = ten.trim().replaceAll(" +", " ");
        System.out.println("Ten sau: "+ten1);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

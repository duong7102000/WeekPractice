package week4;

public class Bai10 {
    public static void main(String[] args) {
        String[] name = {"Đào Tùng Dương", "Nguyễn Thị Hoa", "Vũ Mạnh Hùng", "Nguyễn Thị Thủy", "Vũ Thanh Hương", "Hoàng Văn An"};
        int maxLength = Integer.MIN_VALUE;
        String maxL = "";
        for (String s:
             name) {
            if(s.length()>maxLength){
                maxLength = s.length();
                maxL = s;
            }
        }
        System.out.println("Mang xau: ");
        for (String s:
             name) {
            System.out.println(s);
        }
        System.out.println("Xau dai nhat: "+maxL);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

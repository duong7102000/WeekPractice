package week4;

public class Bai13 {
    public static void main(String[] args) {
        String[] name = {"Đào Tùng Dương", "Nguyễn Thị Hoa", "Vũ Mạnh Hùng", "Nguyễn Thị Thủy", "Vũ Thanh Hương", "Hoàng Văn An"};
        int cnt = 0;
        for (String s:
                name) {
            String ten1 = s.substring(s.lastIndexOf(" ")+1);
            if(String.valueOf(ten1.charAt(0)).equals("H")) cnt++;
        }
        System.out.println("Danh sach: ");
        for (String s:
                name) {
            System.out.println(s);
        }
        System.out.println("So ban ten bat dau bang H: "+cnt);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

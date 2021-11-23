package week4;

public class Bai12 {
    public static void main(String[] args) {
        String[] name = {"Đào Tùng Dương", "Nguyễn Thị Hoa", "Vũ Mạnh Hùng", "Nguyễn Thị Thủy", "Vũ Thanh Hương", "Hoàng Văn An"};
        int cnt = 0;
        for (String s:
                name) {
            if(s.contains("Thị")) cnt++;
        }
        System.out.println("Danh sach: ");
        for (String s:
                name) {
            System.out.println(s);
        }
        System.out.println("So ban co ten dem 'Thị': "+cnt);
        System.out.println("Dao Tung Duong - 20183509");
    }
}

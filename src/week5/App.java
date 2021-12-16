package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    private List<TheMuon> listThe;

    public App(List<TheMuon> listThe) {
        this.listThe = listThe;
    }

    public App(){
        this.listThe = new ArrayList<>();
    }

    public List<TheMuon> getListThe() {
        return listThe;
    }

    public void setListThe(List<TheMuon> listThe) {
        this.listThe = listThe;
    }

    public void show(){
        if (this.listThe.size() == 0){
            System.out.println("Hiện không có thẻ mượn nào.\n");
            return;
        }
        for (TheMuon the:
             this.listThe) {
            System.out.println("==============================================");
            System.out.println("Mã phiếu mượn:" + the.getMaPhieuMuon());
            System.out.println("Ngày mượn: " + the.getNgayMuon());
            System.out.println("Hạn trả: " + the.getHanTra());
            System.out.println("Số hiệu sách: " + the.getSoHieuSach());
            System.out.println("Thông tin sinh viên mượn sách:");
            System.out.println("Tên: " + the.getSinhVien().getTen());
            System.out.println("Tuổi: " + the.getSinhVien().getTuoi());
            System.out.println("Lớp: " + the.getSinhVien().getLop() + "\n");
        }
    }

    public boolean themThe(TheMuon the){
        if(this.listThe.size() == 0){
            the.setMaPhieuMuon(1);
        }
        else{
            int maPhieuMuon = this.listThe.get(this.listThe.size()-1).getMaPhieuMuon() + 1;
            the.setMaPhieuMuon(maPhieuMuon);
        }
        this.listThe.add(the);
        return true;
    }

    public boolean xoaThe(int maThe){
        int index = -1;
        for (int i = 0; i < this.listThe.size(); i++) {
            if (maThe == this.listThe.get(i).getMaPhieuMuon()){
                index = i;
                break;
            }
        }
        if (index != -1) {
            this.listThe.remove(index);
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        System.out.println("Đào Tùng Dương - 20183509");
        System.out.println("Bài 8 bài tập tự chọn:");
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        Boolean loop = true;
        while (loop){
            System.out.println("Các chức năng của chương trình:");
            System.out.println("1. Xem toàn bộ thẻ mượn.");
            System.out.println("2. Thêm thẻ mượn.");
            System.out.println("3. Xóa thẻ mượn theo mã thẻ.");
            System.out.println("4. Thoát chương trình.");
            System.out.print("Mời bạn chọn chức năng: ");
            String a = scanner.nextLine();
            while (!a.equals("1")&&!a.equals("2")&&!a.equals("3")&&!a.equals("4")){
                System.out.print("Mời bạn nhập lại: ");
                a = scanner.nextLine();
            }
            switch (a) {
                case "1":
                    app.show();
                    break;
                case "2":
                    System.out.print("Mời bạn nhập tên sinh viên: ");
                    String tenSinhvien = scanner.nextLine();
                    System.out.print("Mời bạn nhập tuối sinh viên: ");
                    int tuoiSinhVien = Integer.parseInt(scanner.nextLine());
                    System.out.print("Mời bạn nhập lớp sinh viên: ");
                    String lopSinhVien = scanner.nextLine();
                    SinhVien sinhVien = new SinhVien(tenSinhvien, tuoiSinhVien, lopSinhVien);
                    System.out.print("Mời bạn nhập ngày mượn: ");
                    int ngayMuon = Integer.parseInt( scanner.nextLine());
                    System.out.print("Mời bạn nhập số hiệu sách: ");
                    String soHieuSach = scanner.nextLine();
                    TheMuon theMuon = new TheMuon(ngayMuon, soHieuSach, sinhVien);
                    if (app.themThe(theMuon)){
                        System.out.println("Thêm thẻ mượn thành công.\n");
                    }
                    break;
                case "3":
                    System.out.print("Mời bạn nhập mã số thẻ muốn xóa: ");
                    int maThe = Integer.parseInt(scanner.nextLine());
                    if (app.xoaThe(maThe)){
                        System.out.println("Xóa thành công thẻ mã số " + maThe + "\n");
                    }
                    else{
                        System.out.println("Không có thẻ mã số " + maThe + " trong hệ thống\n");
                    }
                    break;
                case "4":
                    System.out.println("Cảm ơn bạn đã sử dụng ứng dụng.");
                    loop = false;
                    break;
            }
        }
    }
}

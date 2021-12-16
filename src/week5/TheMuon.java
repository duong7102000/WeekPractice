package week5;

public class TheMuon {
    private int maPhieuMuon;
    private int ngayMuon;
    private int hanTra;
    private String soHieuSach;
    private SinhVien sinhVien;

    public int getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(int maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getHanTra() {
        return hanTra;
    }

    public void setHanTra() {
        this.hanTra = this.ngayMuon + 7;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public TheMuon(int ngayMuon, String soHieuSach, SinhVien sinhVien) {
        this.ngayMuon = ngayMuon;
        this.soHieuSach = soHieuSach;
        this.sinhVien = sinhVien;
        setHanTra();
    }
}

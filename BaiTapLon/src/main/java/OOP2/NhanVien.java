package OOP2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public abstract class NhanVien {

    public static double luongCoBan = 22000;
    private static int dem;
    protected String maNV = String.format("NV%02d", ++dem);
    protected Date ngaySinh;
    protected String tenNV;
    protected String email;
    protected String gioiTinh;
    protected double heSoLuong;
    protected String thuocPhongBan;
    protected PhongBan phongBan; //Nhan viên bất kì luôn có một phòng ban
    protected List<DuAn> thamGiaDA = new ArrayList<>(); //List này đánh dấu sự tham gia của nhân viên trong 1 dự án nào đó // conect với lớp trung gian "NhanVienThamGiaDuAn"
    protected List<DuAn> dungDauDuAn = new ArrayList<>(); //Nhân viên bất kì luôn đứng đầu dự án nào đó 
    protected List<NhanThan> dsNT = new ArrayList<>(); // Nhân thân có 1 mối quan hệ với 1 trong số nhiều nhân viên trong này // conect với lớp trung gian "SoChinhSachBaoHiem"

    public NhanVien() {
    }

    public NhanVien(Date ngaySinh, String tenNV, String email, String gioiTinh, double heSoLuong, String thuocPhongBan) {
        this.ngaySinh = ngaySinh;
        this.tenNV = tenNV;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.heSoLuong = heSoLuong;
        this.thuocPhongBan = thuocPhongBan;

    }

    public NhanVien(String ngaySinh, String tenNV, String email, String gioiTinh, double heSoLuong, String thuocPhongBan) throws ParseException {
        this(CauHinh.f.parse(ngaySinh), tenNV, email, gioiTinh, heSoLuong, thuocPhongBan);
    }

    public abstract double luongOT();

    public abstract double bonus();

    public abstract double error();

    public double tinhLuong() {
        return getLuongCoBan() * this.getHeSoLuong();
    }

    public String tinhTuoi() {
        Date d = new Date();
        String tuoi = String.valueOf(d.getYear() - this.ngaySinh.getYear()); // ép kiểu thành String để dễ dàng dùng Stream.filter
        return tuoi;
    }

    public void nhapNhanVien() throws ParseException {
        System.out.print("Nhap ho ten nhan vien : ");
        this.tenNV = CauHinh.sc.nextLine();
        System.out.print("Nhap ngay sinh : ");
        this.ngaySinh = CauHinh.f.parse(CauHinh.sc.nextLine());
        System.out.print("Nhap gioi tinh : ");
        this.gioiTinh = CauHinh.sc.nextLine();
        System.out.print("Nhap email : ");
        this.email = CauHinh.sc.nextLine();
        System.out.print("Nhap He so luong : ");
        this.heSoLuong = CauHinh.sc.nextDouble();
        System.out.print("Nhap phong ban : ");
        this.thuocPhongBan = new Scanner(System.in).nextLine();
    }

    public void showNhanVien() {
        System.out.printf("-Id : %s\n", this.maNV);
        System.out.printf("-Ngay Sinh : %s\n", CauHinh.f.format(this.ngaySinh));
        System.out.printf("-Ho va ten: %s\n", this.tenNV);
        System.out.printf("-Email: %s\n", this.email);
        System.out.printf("-Gioi Tinh : %s\n", this.gioiTinh);
        System.out.printf("-He so luong : %,.0f\n", this.heSoLuong);
        System.out.printf("-Phong ban : %s\n", this.thuocPhongBan);

    }

    public void showDuAnDaThamGia() {
        System.out.println("===============================");
        System.out.println("DANH SACH DU AN DA THAM GIA : ");
        this.thamGiaDA.forEach(da -> {
            da.showDA();
            System.out.println("===============================");
        });
    }

    public void showNguoiThanCuaNV() {
        System.out.println("===============================");
        System.out.println("DANH SACH NGUOI THAN CUA NHAN VIEN :");
        this.dsNT.forEach(x -> {
            x.showNT();
            System.out.println("===================================");
        });
    }

    public static double getLuongCoBan() {
        return luongCoBan;
    }

    public static int getDem() {
        return dem;
    }

    public String getMaNV() {
        return maNV;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getEmail() {
        return email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public String getThuocPhongBan() {
        return thuocPhongBan;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public List<DuAn> getThamGiaDA() {
        return thamGiaDA;
    }

    public List<DuAn> getDungDauDuAn() {
        return dungDauDuAn;
    }

    public List<NhanThan> getDsNT() {
        return dsNT;
    }

    public static void setLuongCoBan(double luongCoBan) {
        NhanVien.luongCoBan = luongCoBan;
    }

    public static void setDem(int dem) {
        NhanVien.dem = dem;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setThuocPhongBan(String thuocPhongBan) {
        this.thuocPhongBan = thuocPhongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public void setThamGiaDA(List<DuAn> thamGiaDA) {
        this.thamGiaDA = thamGiaDA;
    }

    public void setDungDauDuAn(List<DuAn> dungDauDuAn) {
        this.dungDauDuAn = dungDauDuAn;
    }

    public void setDsNT(List<NhanThan> dsNT) {
        this.dsNT = dsNT;
    }
}

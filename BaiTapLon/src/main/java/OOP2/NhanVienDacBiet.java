package OOP2;

import java.text.ParseException;
import java.util.Date;

public class NhanVienDacBiet extends NhanVien {

    private static int dem = 0;
    public int soPhongBanQl = 0;//ban đầu số PB là 0 để đếm lên +1 nếu tham gia vào 1 phòng ban bất kì tương tự với +2
    public PhongBan[] phongQuanLy = new PhongBan[2]; //1 nhân viên dặc biệt chỉ quản lý tối đa 2 phòng ban 
    private Date ngayNhamChuc;

    public NhanVienDacBiet(Date ngayNhamChuc, String ngaySinh, String tenNV, String email, String gioiTinh, double heSoLuong, String thuocPhongBan) throws ParseException {
        super(ngaySinh, tenNV, email, gioiTinh, heSoLuong, thuocPhongBan);
        this.maNV = String.format("QL%02d", ++dem);
        this.ngayNhamChuc = ngayNhamChuc;
    }

    public NhanVienDacBiet(String ngayNhamChuc, String ngaySinh, String tenNV, String email, String gioiTinh, double heSoLuong, String thuocPhongBan) throws ParseException {
        this(CauHinh.f.parse(ngayNhamChuc), ngaySinh, tenNV, email, gioiTinh, heSoLuong, thuocPhongBan);
    }

    public NhanVienDacBiet() {
        this.maNV = String.format("QL%02d", ++dem);
    }

    @Override
    public void nhapNhanVien() throws ParseException {
        super.nhapNhanVien();
        System.out.println("-Nhap ngay nham chuc : ");
        this.ngayNhamChuc = CauHinh.f.parse(CauHinh.sc.nextLine());
    }

    @Override
    public void showNhanVien() {
        super.showNhanVien();
        System.out.printf("-Ngay nham chuc : %s\n", CauHinh.f.format(this.ngayNhamChuc));
    }

    public Date getNgayNhamChuc() {
        return ngayNhamChuc;
    }

    public void setNgayNhamChuc(Date ngayNhamChuc) {
        this.ngayNhamChuc = ngayNhamChuc;
    }

    @Override
    public double luongOT() {
        return 0;
    }

    @Override
    public double bonus() {
        return 0;
    }

    @Override
    public double error() {
        return 0;
    }

    public static int getDem() {
        return dem;
    }

    public int getSoPhongBanQl() {
        return soPhongBanQl;
    }

    public PhongBan[] getPhongQuanLy() {
        return phongQuanLy;
    }

    public static void setDem(int dem) {
        NhanVienDacBiet.dem = dem;
    }

    public void setSoPhongBanQl(int soPhongBanQl) {
        this.soPhongBanQl = soPhongBanQl;
    }

    public void setPhongQuanLy(PhongBan[] phongQuanLy) {
        this.phongQuanLy = phongQuanLy;
    }

}

package OOP2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DuAn {

    private static int dem;
    private String maDA = String.format("DA%02d", ++dem);
    private String tenDA;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private double tongChiPhi;
    private NhanVien chuNhiemDuAn;//1 nhân viên bất kì có thể là chủ nhiệm của 1 dự án
    private List<NhanVien> nhanVienThamGia = new ArrayList<>();  // conect với lớp trung gian "NhanVienThamGiaDuAn"

    public DuAn() {
    }

    public DuAn(String tenDA, Date ngayBatDau, Date ngayKetThuc, double tongChiPhi, NhanVien chuNhiemDuAn) {
        this.tenDA = tenDA;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.tongChiPhi = tongChiPhi;
        this.chuNhiemDuAn = chuNhiemDuAn;
        this.getChuNhiemDuAn().getDungDauDuAn().add(this);
        this.getChuNhiemDuAn().getThamGiaDA().add(this);

    }

    public DuAn(String tenDA, String ngayBatDau, String ngayKetThuc, double tongChiPhi, NhanVien chuNhiemDuAn) throws ParseException {
        this(tenDA, CauHinh.f.parse(ngayBatDau), CauHinh.f.parse(ngayKetThuc), tongChiPhi, chuNhiemDuAn);
    }

    public boolean isNhanVienCuaDuAn(NhanVien nv) {
        if (this.nhanVienThamGia.size() < 10 && nv.thamGiaDA.size() < 3) { //1 nhân viên tham gia tối đa 3 DA và 1 dự án có tối đa 10 nv
            this.nhanVienThamGia.add(nv);
            nv.thamGiaDA.add(this);
            return true;
        }
        return false;
    }

    public void nhap1DA() throws ParseException {
        System.out.print("-Ma du an : ");
        this.maDA = CauHinh.format(CauHinh.sc.nextLine());
        System.out.print("-Ten du an : ");
        this.tenDA = CauHinh.sc.nextLine();
        System.out.print("-Ngay bat dau du an : ");
        this.ngayBatDau = (CauHinh.f.parse(CauHinh.sc.nextLine()));
        System.out.print("-Ngay ket thuc du an : ");
        this.ngayKetThuc = CauHinh.f.parse(CauHinh.sc.nextLine());
        System.out.print("-Tong chi phi du an : ");
        this.tongChiPhi = new Scanner(System.in).nextDouble();
        themChuNhiem();

    }

    public void themChuNhiem() {
        setChuNhiemDuAn(null); //ban đầu gắn cho chủ nhiệm là rỗng để có thể thêm vào chủ nhiệm
        System.out.print("-Nhap ma nhan vien chu nhiem du an : ");
        String id = CauHinh.format(CauHinh.sc.nextLine());
        NhanVien nvm = Demo.qlnv.timKiemID(id);
        setChuNhiemDuAn(nvm);       //sau khi tìm mã NV thì gắn trực tiếp mã nhân viên đó vào làm chủ nhiệm mới
        nvm.getDungDauDuAn().add(this);
        nvm.getThamGiaDA().add(this);
    }

    public void showNhanVienThamGiaDuAn() {
        System.out.println("DANH SACH NHAN VIEN CUA DU AN :");
        chuNhiemDuAn.showNhanVien();
        this.nhanVienThamGia.forEach(x -> {
            x.showNhanVien();
            System.out.println("=============================");
        });
    }

    public void showDA() {
        System.out.printf("-Ma du an : %s\n", this.maDA);
        System.out.printf("-Ten du an : %s\n", this.tenDA);
        System.out.printf("-Ngay bat dau du an : %s\n", CauHinh.f.format(this.ngayBatDau)); //format ngày thành dd/mm/yyyy
        System.out.printf("-Ngay du kien ket thuc du an : %s\n", CauHinh.f.format(this.ngayKetThuc));
        System.out.printf("-Tong chi phi cua du an : %.0f\n", this.tongChiPhi);
        System.out.printf("-chu nhiem du an : %s\n", this.chuNhiemDuAn.getTenNV());
        System.out.printf("");
    }

    public static int getDem() {
        return dem;
    }

    public String getMaDA() {
        return maDA;
    }

    public String getTenDA() {
        return tenDA;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public double getTongChiPhi() {
        return tongChiPhi;
    }

    public NhanVien getChuNhiemDuAn() {
        return chuNhiemDuAn;
    }

    public List<NhanVien> getNhanVienThamGia() {
        return nhanVienThamGia;
    }

    public static void setDem(int dem) {
        DuAn.dem = dem;
    }

    public void setMaDA(String maDA) {
        this.maDA = maDA;
    }

    public void setTenDA(String tenDA) {
        this.tenDA = tenDA;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public void setTongChiPhi(double tongChiPhi) {
        this.tongChiPhi = tongChiPhi;
    }

    public void setChuNhiemDuAn(NhanVien chuNhiemDuAn) {
        this.chuNhiemDuAn = chuNhiemDuAn;
    }

    public void setNhanVienThamGia(List<NhanVien> nhanVienThamGia) {
        this.nhanVienThamGia = nhanVienThamGia;
    }
}

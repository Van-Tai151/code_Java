package OOP2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NhanThan {

    private String tenNT;
    private static int dem;
    private String id = String.format("NT%02d", ++dem);
    private String gioiTinhNT;
    private Date ngaySinhNT;
    private String tenMQH;
    private List<NhanVien> dsNV = new ArrayList<>(); // conect với lớp trung gian "SoChinhSachBaoHiem"

    public NhanThan() {
    }

    public NhanThan(String tenNT, String gioiTinhNT, Date ngaySinhNT, String tenMQH) {
        this.tenNT = tenNT;
        this.gioiTinhNT = gioiTinhNT;
        this.ngaySinhNT = ngaySinhNT;
        this.tenMQH = tenMQH;
    }   

    public NhanThan(String tenNT, String gioiTinhNT, String ngaySinhNT, String tenMQH) throws ParseException {
        this(tenNT, gioiTinhNT, CauHinh.f.parse(ngaySinhNT), tenMQH);
    }

    public void showNT() {
        System.out.printf("-Ma nhan than : %s\n", this.id);
        System.out.printf("-Ten nhan than : %s\n", this.tenNT);
        System.out.printf("-Gioi tinh : %s\n", this.gioiTinhNT);
        System.out.printf("-Ngay sinh : %s\n", CauHinh.f.format(this.ngaySinhNT));
        System.out.printf("-La %s cua nhan vien \n ", this.tenMQH);
    }

    public String getTenNT() {
        return tenNT;
    }

    public String getGioiTinhNT() {
        return gioiTinhNT;
    }

    public Date getNgaySinhNT() {
        return ngaySinhNT;
    }

    public void setTenNT(String tenNT) {
        this.tenNT = tenNT;
    }

    public void setGioiTinhNT(String gioiTinhNT) {
        this.gioiTinhNT = gioiTinhNT;
    }

    public void setNgaySinhNT(Date ngaySinhNT) {
        this.ngaySinhNT = ngaySinhNT;
    }

    public String getTenMQH() {
        return tenMQH;
    }

    public void setTenMQH(String tenMQH) {
        this.tenMQH = tenMQH;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getDem() {
        return dem;
    }

    public List<NhanVien> getDsNV() {
        return dsNV;
    }

    public static void setDem(int dem) {
        NhanThan.dem = dem;
    }

    public void setDsNV(List<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }

}

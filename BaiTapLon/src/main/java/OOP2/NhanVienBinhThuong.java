package OOP2;

import java.text.ParseException;

public class NhanVienBinhThuong extends NhanVien {

    public NhanVienBinhThuong() {
    }

    public NhanVienBinhThuong(String ngaySinh, String tenNV, String email, String gioiTinh, double heSoLuong, String thuocPhongBan) throws ParseException {
        super(ngaySinh, tenNV, email, gioiTinh, heSoLuong, thuocPhongBan);
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong();
    }

    @Override
    public double bonus() {
        return 0;
    }

    @Override
    public double luongOT() {
        return 0;
    }

    @Override
    public double error() {
        return 0;
    }
    
    
    
}

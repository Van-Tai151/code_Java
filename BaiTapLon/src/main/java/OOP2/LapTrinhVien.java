
package OOP2;

import java.text.ParseException;

public class LapTrinhVien extends NhanVien{   
    private static int dem = 0;
    public LapTrinhVien(String ngaySinh, String tenNV, String email, String gioiTinh, double heSoLuong, String thuocPhongBan) throws ParseException {
        super(ngaySinh, tenNV, email, gioiTinh, heSoLuong, thuocPhongBan);
        this.maNV = String.format("LTV%02d", ++dem);
    }
    public LapTrinhVien() {
        this.maNV = String.format("LTV%02d", ++dem);
    }  
    @Override
    public double luongOT(){
        System.out.print("-Nhap luong OT cua lap trinh vien : ");
        double x = CauHinh.sc.nextDouble();
        return x;
    }
    @Override
    public void showNhanVien(){
        super.showNhanVien();        
    }
    @Override
    public double tinhLuong(){
        return super.tinhLuong()+this.luongOT();
    }
    @Override
    public double bonus() {
return 0;    }
    @Override
    public double error() {
return 0;    } 
}

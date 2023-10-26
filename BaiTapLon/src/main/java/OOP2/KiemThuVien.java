
package OOP2;

import java.text.ParseException;

public  class KiemThuVien extends NhanVien{
    public static int dem= 0;

    public KiemThuVien(String ngaySinh, String tenNV, String email, String gioiTinh, double heSoLuong, String thuocPhongBan) throws ParseException {
        super(ngaySinh, tenNV, email, gioiTinh, heSoLuong, thuocPhongBan);
        this.maNV = String.format("KTV%02d", ++dem);
    }

    public KiemThuVien() {
        this.maNV= String.format("KTV%02d", ++dem);
    }  
    @Override
    public double error(){
        System.out.print("Nhap so loi quan trong phat hien : ");
        int x = CauHinh.sc.nextInt();
        return x;
    }
    @Override
    public void showNhanVien(){
        super.showNhanVien();
    } 
    @Override
    public double tinhLuong(){
        return super.tinhLuong()+this.error()*200000;
    }
    @Override
    public double luongOT() {
return 0;    }
    @Override
    public double bonus() {
return 0;    }   
}

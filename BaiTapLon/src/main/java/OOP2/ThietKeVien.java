
package OOP2;
import java.text.ParseException;
public  class ThietKeVien extends NhanVien{
    private static int dem = 0;

    public ThietKeVien(String ngaySinh, String tenNV, String email, String gioiTinh, double heSoLuong, String thuocPhongBan) throws ParseException {
        super(ngaySinh, tenNV, email, gioiTinh, heSoLuong, thuocPhongBan);
        this.maNV = String.format("TKV%02d", ++dem);
    }
    public ThietKeVien() {
        this.maNV = String.format("TKV%02d", ++dem);
    }
   
    @Override
    public double bonus(){
        System.out.print("-Nhap vao luong bonus cua Thiet Ke Vien: ");
        double x = CauHinh.sc.nextDouble();
        return x;
    }
    @Override
    public void showNhanVien(){
        super.showNhanVien();
        
    }
    @Override
    public double tinhLuong(){
        return super.tinhLuong()+this.bonus();
    }

    @Override
    public double luongOT() {
return 0;    }

    @Override
    public double error() {
return 0;    }

}

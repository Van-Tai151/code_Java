package OOP2;

import java.text.ParseException;

public class Demo {

    public static QuanLyNhanVien qlnv = new QuanLyNhanVien();
    public static QuanLyNhanThan qlnt = new QuanLyNhanThan();
    public static QuanLyDuAn qlda = new QuanLyDuAn();
    public static QuanLyPhongBan qlpb = new QuanLyPhongBan();

    public static void main(String[] args) throws ParseException {
        NhanVien nv1 = new NhanVienDacBiet("1/1/2013", "10/10/2003", "Phan Van Tai", "tai123@gmail", "nam", 1.2, "Quan Ly Dao Tao");
        NhanVien nv2 = new NhanVienDacBiet("2/12/2022", "22/2/2002", "Phan Nguyen Hong Son", "Sonpro123@gmail", "nam", 1.5, "Tai Chinh");
        NhanVien nv3 = new NhanVienDacBiet("31/12/2012", "24/04/2006", "Thanh Thao", "Thao345", "nu", 2.3, "Kiem Toan");
        NhanVien nv4 = new KiemThuVien("26/04/2006", "Huynh Ngan", "Ngandangiu345", "nu", 1.8, "Nhan Su");
        NhanVien nv5 = new KiemThuVien("30/04/1981", "Ngoc Lan", "Lan545", "nu", 2.3, "Marketing");
        NhanVien nv6 = new KiemThuVien("14/2/2002", "Ba Hai", "Haipro123", "nam", 1.5, "Tai Chinh");
        NhanVien nv7 = new LapTrinhVien("22/09/2004", "Minh Quan", "Nam", "nam", 1.7, "Kiem Toan");
        NhanVien nv8 = new LapTrinhVien("15/1/2000", "Huynh Tri", "chiiuminhem@", "nam", 2.3, "Nhan Su");
        NhanVien nv9 = new LapTrinhVien("30/3/2003", "Thien Tu", "anchaodabat@", "nam", 1.5, "Tai Chinh");
        NhanVien nv10 = new ThietKeVien("26/04/2006", "Huynh Ngan", "Ngandangiu345", "nu", 1.8, "Kiem Toan");
        NhanVien nv11 = new ThietKeVien("14/11/2001", "Thanh Huyen", "HuyenSociu123", "nu", 1.9, "Quan Ly Dao Tao");
        NhanVien nv12 = new ThietKeVien("15/7/2000", "Thanh Tuan", "TuanLucSipro@112", "nam", 3.0, "Nhan Su");
        NhanVien nv13 = new NhanVienBinhThuong("8/8/2000", "Thanh Tinh", "TuanLucSipro@112", "nam", 3.0, "Quan Ly Dao Tao");
        NhanVien nv14 = new NhanVienBinhThuong("11/7/2001", "Thanh Tuan", "TuanLucSipro@112", "nam", 3.0, "Nhan Su");
        NhanVien nv15 = new NhanVienBinhThuong("12/12/2002", "Thanh Tuan", "TuanLucSipro@112", "nam", 3.0, "Quan Ly Dao Tao");
        qlnv.themDSNhanVien(nv1, nv2, nv3, nv4, nv5, nv6, nv7, nv8, nv9, nv10, nv11, nv12, nv13, nv14, nv15);

        DuAn da1 = new DuAn("Tokyo", "24/12/2015", "25/1/2020", 2100000, nv1);
        DuAn da2 = new DuAn("Hokaido", "24/4/2015", "25/1/2021", 3100000, nv2);
        DuAn da3 = new DuAn("Kawaki", "30/12/2012", "25/1/2016", 1800000, nv3);
        DuAn da4 = new DuAn("HoChiMinh", "25/1/2016", "25/1/2018", 1500000, nv4);
        DuAn da5 = new DuAn("HaNoi", "15/12/2012", "25/1/2015", 5000000, nv5);
        qlda.themDSDuAn(da1, da2, da3, da4, da5);
        
        NhanVienThamGiaDuAn nv_da = new NhanVienThamGiaDuAn();
        nv_da.NhanVien_DuAn(nv9, da1);
        nv_da.NhanVien_DuAn(nv10, da1);
        nv_da.NhanVien_DuAn(nv11, da2);
        nv_da.NhanVien_DuAn(nv12, da2);
        nv_da.NhanVien_DuAn(nv13, da3);
        nv_da.NhanVien_DuAn(nv14, da3);

        NhanThan nt1 = new NhanThan("Duong An ", "nam", "1/1/1990", "cha");
        NhanThan nt2 = new NhanThan("Quy Mui", "nu", "10/5/1980", "me");
        NhanThan nt3 = new NhanThan("Chien Thang", "nam", "8/1/1990", "chu");
        NhanThan nt4 = new NhanThan("Minh Thuy`", "nu", "1/1/1990", "co");
        qlnt.themDSNT(nt1, nt2, nt3);

        SoChinhSachBaoHiem sbh = new SoChinhSachBaoHiem();
        sbh.capSoChinhSachBaoHiem("BaoHiem123", nv10, nt1);
        sbh.capSoChinhSachBaoHiem("BaoHiem456", nv11, nt2);
        sbh.capSoChinhSachBaoHiem("BaoHiem789", nv12, nt3);
        sbh.capSoChinhSachBaoHiem("BaoHiem910", nv13, nt3);
        sbh.capSoChinhSachBaoHiem("BaoHiem1112", nv14, nt4);
        sbh.capSoChinhSachBaoHiem("BaoHiem1314", nv15, nt4);
        

        Menu menu = new Menu();
        menu.mainMenu();
    }
}

package OOP2;

import java.text.ParseException;
import java.util.Scanner;

public class Menu {

    private int choose;
    private final NhanVien nv = new NhanVienBinhThuong();
    private final PhongBan pb = new PhongBan();
    private final NhanThan nt = new NhanThan();
    private final DuAn da = new DuAn();

    public void mainMenu() throws ParseException {
        do {
            System.out.println("!! CHUONG TRINH QUAN LY DU AN !!");
            System.out.printf("1/ Chuc nang ve nhan vien. \n2/ Chuc nang ve du an. \n3/ Chuc nang ve than nhan cua nhan vien va phong ban.\n");
            System.out.print("-Ban chon : ");
            choose = Integer.parseInt(CauHinh.sc.nextLine());
            System.out.println("=====================================================");

            switch (choose) {
                case 1 -> {
                    MenuNhanVien();
                }
                case 2 -> {
                    MenuDuAn();
                }
                case 3 -> {
                    MenuThanNhan_PhongBan();
                }
                default -> {
                    System.out.println("===== CHUONG TRINH KET THUC =====");
                    System.exit(0);
                }
            }
        } while (choose > 0 && choose < 4);
    }

    public void MenuNhanVien() throws ParseException {
        do {
            System.out.println("CHUC NANG NHAN VIEN");
            System.out.printf("""
                              1/ Them nhan vien
                              2/ Tim kiem nhan vien theo ten 
                              3/ Tim kiem nhan vien theo ngay sinh  
                              4/ Tim kiem nhan vien theo phong ban
                              5/ Tim kiem nhan vien theo do tuoi                               
                              6/ Tinh tien luong nhan vien
                              7/ Hien thi danh sach nhan vien                                                                                                                    
                              8/ Quay lai!!
                              9/ KET THUC !!!                              
                              """);
            System.out.print("-Ban chon :  ");
            choose = Integer.parseInt(CauHinh.sc.nextLine());
            System.out.println("=====================================================");

            switch (choose) {
                case 1-> {
                    Demo.qlnv.showQuanLyNhanVien();
                    nv.nhapNhanVien();
                    Demo.qlnv.them1NhanVien(nv);
                    System.out.println("===== !! Them nhan vien thanh cong !! =====");
                }
                case 2->{
                    Demo.qlnv.showQuanLyNhanVien();
                    System.out.print("Nhap ten sinh vien can tim : ");
                    String name = CauHinh.sc.nextLine();
                    System.out.printf("CAC NHAN VIEN CO TEN %s \n", name);
                    Demo.qlnv.timKiemTenNV(name).forEach(nv1 -> {
                        nv1.showNhanVien();
                        System.out.println("=====================================================");
                    });
                }
                case 3->{
                    Demo.qlnv.showQuanLyNhanVien();
                    System.out.print("Nhap ngay sinh vien can tim :  ");
                    String day = CauHinh.sc.nextLine().trim();
                    System.out.printf("NGAY SINH %s CO CAC NHAN VIEN SAU : \n", day);
                    Demo.qlnv.timKiemNgaySinhNV(CauHinh.f.parse(day)).forEach(nv2 -> {
                        nv2.showNhanVien();
                        System.out.println("=====================================================");
                    });
                }
                case 4->{
                    Demo.qlnv.showQuanLyNhanVien();
                    System.out.print("+Nhap ten phong ban can tim : ");
                    String name = CauHinh.sc.nextLine();
                    System.out.printf("PHONG BAN %s CO CAC NHAN VIEN SAU : \n", name);
                    Demo.qlnv.timKiemPhongBanNV(name).forEach(nv3 -> {
                        nv3.showNhanVien();
                        System.out.println("=====================================================");
                    });
                }
                case 5->{
                    Demo.qlnv.showQuanLyNhanVien();
                    System.out.print("+Nhap do tuoi can tim : ");
                    String tuoi = CauHinh.sc.nextLine();
                    String[] words = tuoi.split("-");
                    System.out.printf("TUOI %s CO CAC NHAN VIEN SAU : \n", tuoi);
                    for (String x : words) {
                        Demo.qlnv.timKiemTuoi(x).forEach(nv4 -> {
                            nv4.showNhanVien();
                            System.out.println("=====================================================");
                        });
                    }
                }
                case 6->{
                    Demo.qlnv.getDsNV().forEach(nv4 -> {
                        nv4.showNhanVien();
                        System.out.printf("- Luong %,.0f\n", nv4.tinhLuong());
                        System.out.println("=====================================================");
                    });
                }
                case 7->{
                    Demo.qlnv.showQuanLyNhanVien();
                }
                case 8->{
                    mainMenu();
                }
                case 9->{
                    System.out.println("================       CHUONG TRINH DA KET THUC HEN GAP LAI       =================");
                    System.exit(0);
                }
                default->{
                    System.out.println("!!! Ban nhap chua dung yeu cau !!! nhap lai (1->9)");
                    MenuNhanVien();
                }
            }
            CauHinh.vietTiep();
        } while (choose > 0 && choose <= 9);

    }

    public void MenuDuAn() throws ParseException {
        do {
            System.out.println("CHUC NANG DU AN");
            System.out.printf("""
                              1/ Them du an 
                              2/ Xoa du an 
                              3/ Sua du an
                              4/ Hien thi danh sach du an
                              5/ Tim kiem du an theo ten
                              6/ Tim kiem du an theo ngay bat dau
                              7/ Sap xep du an theo chi phi tang dan
                              8/ Them nhan vien cho du an
                              9/ Hien thi danh sach nhan vien tham gia 1 du an nao do 
                              10/ Hien thi danh sach du an cua nhan vien can xem 
                              11/ Gan quan ly cho du an
                              12/ Quay lai !!
                              13/ KET THUC !!!                                                           
                              """);
            System.out.print("-Ban chon : ");
            choose = Integer.parseInt(CauHinh.sc.nextLine());
            System.out.println("=====================================================");

            switch (choose) {
                case 1->{
                    Demo.qlda.showTatCaDuAn();
                    da.nhap1DA();
                    Demo.qlda.them1DuAN(da);
                    System.out.println("!!! Them du an thanh cong !!!");
                }
                case 2->{
                    Demo.qlda.showTatCaDuAn();
                    System.out.print("+Nhap ma du an can xoa : ");
                    String id = CauHinh.format(CauHinh.sc.nextLine());
                    Demo.qlda.xoaDuAn(Demo.qlda.timKiemMA(id));
                    System.out.println("===== Xoa du an thanh cong =====");
                }
                case 3->{
                    Demo.qlda.showTatCaDuAn();
                    System.out.print("+Nhap ma du an can chinh sua : ");
                    String id = CauHinh.format(CauHinh.sc.nextLine());
                    Demo.qlda.capNhatDuAn(Demo.qlda.timKiemMA(id));
                    System.out.println("==== Chinh sua du an thanh cong ====");
                }
                case 4->{
                    Demo.qlda.showTatCaDuAn();
                }

                case 5->{
                    Demo.qlda.showTatCaDuAn();
                    System.out.print("+Nhap ten du an can tim : ");
                    String name = CauHinh.sc.nextLine();
                    System.out.printf("DU AN %s : \n", name);
                    Demo.qlda.timKiemTenDA(name).forEach(ten -> {
                        ten.showDA();
                        System.out.println("=====================================================");
                    });
                }
                case 6->{
                    Demo.qlda.showTatCaDuAn();
                    System.out.print("+Nhap ngay bat dau cua du an can tim :  ");
                    String day = CauHinh.sc.nextLine().trim();
                    System.out.printf("NGAY BAT DAU %s CO CAC DU AN : \n", day);
                    Demo.qlda.timTheoNgayBatDau(CauHinh.f.parse(day)).forEach(p -> {
                        p.showDA();
                        System.out.println("=====================================================");
                    });
                }
                case 7->{
                    if (Demo.qlda.getDs().size() > 0) {
                        Demo.qlda.sapXepChiPhi();
                        System.out.println("=========  Sap xep thanh cong  ========= \n");
                        Demo.qlda.showTatCaDuAn();
                    }
                }
                case 8->{
                    Demo.qlda.showTatCaDuAn();
                    System.out.print("+Nhap du an can them nhan vien : ");
                    String id = CauHinh.format(CauHinh.sc.nextLine());
                    DuAn da = Demo.qlda.timKiemMA(id);
                    System.out.print("+Nhap so nhan vien ban muon them vao du an (toi hieu 5 va toi da 10) : ");
                    int n = new Scanner(System.in).nextInt();
                    do {
                        System.out.print("+Nhap ma nhan vien tham gia : ");
                        String idNV = CauHinh.format(CauHinh.sc.nextLine());
                        NhanVien nv = Demo.qlnv.timKiemID(idNV);
                        if (da.isNhanVienCuaDuAn(nv) == false) {
                            System.out.println("!!! Nhan vien da tham gia du an hoac du an do da du nhan vien !!! ");
                        } else {
                            System.out.println("===== !!! Them thanh cong !!! ===== ");
                        }
                    } while (da.getNhanVienThamGia().size() < n);
                }
                case 9->{
                    Demo.qlda.showTatCaDuAn();
                    System.out.print("+Nhap ma du an : ");
                    String id = CauHinh.format(CauHinh.sc.nextLine());
                    System.out.println("===============================");
                    Demo.qlda.timKiemMA(id).showNhanVienThamGiaDuAn();
                }
                case 10->{
                    Demo.qlnv.showQuanLyNhanVien();
                    System.out.print("+Nhap ma nhan vien ");
                    String id = CauHinh.format(CauHinh.sc.nextLine());
                    Demo.qlnv.timKiemID(id).showDuAnDaThamGia();
                }
                case 11->{
                    Demo.qlda.showTatCaDuAn();
                    System.out.print("+Nhap ma du an can gan quan ly : ");
                    String id = CauHinh.format(CauHinh.sc.nextLine());
                    Demo.qlda.timKiemMA(id).themChuNhiem();
                    System.out.println("===== Them quan ly thanh cong =====");
                }
                case 12->{
                    mainMenu();
                }
                case 13->{
                    System.out.println("================       CHUONG TRINH DA KET THUC HEN GAP LAI       =================");
                    System.exit(0);
                }
                default->{
                    System.out.println("!!! Ban nhap chua dung yeu cau !!! nhap lai (1->13)");
                    MenuDuAn();
                }
            }
            CauHinh.vietTiep();
        } while (choose > 0 && choose <= 13);

    }

    public void MenuThanNhan_PhongBan() throws ParseException {
        do {
            System.out.println("CHUC NANG VE NHAN THAN + Phong Ban");
            System.out.printf("""
                              1/ Hien thi tat ca cac thong tin nhan than hien co                              
                              2/ Xuat danhh sach nhan than cua 1 nhan vien dua tren ma nhan vien
                              3/ Them phong ban va hien thi danh sach phong ban moi them
                              4/ Quay lai!!
                              5/ Ket thuc !! 
                              """);
            System.out.print("Ban chon :  ");
            choose = Integer.parseInt(CauHinh.sc.nextLine());
            System.out.println("=====================================================");

            switch (choose) {

                case 1 -> {
                    Demo.qlnt.showDSNT();
                }
                case 2 -> {
                    System.out.print("+Nhap ma nhan vien : ");
                    String id = CauHinh.sc.nextLine();
                    Demo.qlnv.timKiemID(id).showNguoiThanCuaNV();
                }
                case 3 -> {
                    PhongBan pb1 = new PhongBan();
                    pb1.nhapPhongBan();
                    Demo.qlpb.themPhongBan(pb1);
                    System.out.println("=====Them thanh cong !!!=====");
                    Demo.qlpb.showQuanLyPhongBan();
                }
                case 4 -> {
                    mainMenu();
                }
                case 5 -> {
                    System.out.println("================       CHUONG TRINH DA KET THUC HEN GAP LAI       =================");
                    System.exit(0);
                }
                default -> {
                    System.out.println("!!! Ban nhap chua dung yeu cau !!! nhap lai (1->6)");
                    MenuThanNhan_PhongBan();
                }
            }
            CauHinh.vietTiep();
        } while (choose > 0 && choose <= 6);

        System.exit(0);
    }
}

package OOP2;

import java.util.ArrayList;

import java.util.List;

public class PhongBan {

    private String tenPhongBan;
    private List<NhanVien> dsNV = new ArrayList<>();
    private NhanVienDacBiet nhanVienDacBiet;   //Nhân viên đặc biệt có nhiệm vụ quản lý 1 phòng ban bất kì 

    public PhongBan(String tenPhongBan, NhanVienDacBiet nhanVienDacBiet) {
        this.tenPhongBan = tenPhongBan;
        this.nhanVienDacBiet = nhanVienDacBiet;
        this.nhanVienDacBiet.soPhongBanQl++;//nếu quản lý phòng ban nào thì +1
    }

    public PhongBan() {
    }

    public void themNhanVien(NhanVien nv) {
        dsNV.add(nv);
        nv.setPhongBan(this);
    }

    public void themQuanLy() {
        do {
            System.out.print("-Nhap ma nhan vien quan ly : ");
            String id = CauHinh.format(CauHinh.sc.nextLine());
            this.nhanVienDacBiet = (NhanVienDacBiet) Demo.qlnv.timKiemID(id);
            if (this.nhanVienDacBiet.soPhongBanQl < 2) {
                this.nhanVienDacBiet.phongQuanLy[nhanVienDacBiet.soPhongBanQl] = this;
                this.nhanVienDacBiet.soPhongBanQl++;
                themNhanVien(this.nhanVienDacBiet);
                break;
            } else {
                System.out.printf("Nhan vien %s da quan ly 2 phong ban \n", this.nhanVienDacBiet.getTenNV());
            }

        } while (this.nhanVienDacBiet.soPhongBanQl == 2);
    }

    public void nhapPhongBan() {
        System.out.print("-Nhap ten phong ban : ");
        this.tenPhongBan = CauHinh.sc.nextLine();
        themQuanLy();
    }

    public void show1PhongBan() {
        System.out.printf("-Ten phong ban :%s\n-Quan ly phong ban do: %s\n", this.tenPhongBan, this.nhanVienDacBiet.getTenNV());
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public List<NhanVien> getDsNV() {
        return dsNV;
    }

    public NhanVienDacBiet getQuanLy() {
        return nhanVienDacBiet;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public void setDsNV(List<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }

    public void setQuanLy(NhanVienDacBiet nhanVienDacBiet) {
        this.nhanVienDacBiet = nhanVienDacBiet;
    }
}

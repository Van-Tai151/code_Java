
package OOP2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyNhanVien {
    private List<NhanVien> dsNV = new ArrayList<>();
    
    public QuanLyNhanVien(List<NhanVien> dsNV ) {
        this.dsNV = dsNV;
    }
    public QuanLyNhanVien() {
    }
    public void them1NhanVien(NhanVien nv) {
        this.dsNV.add(nv);
    }

    public void themDSNhanVien(NhanVien... nv) {
        this.dsNV.addAll(Arrays.asList(nv));
    }
    
    public void themDSNhanVien(List<NhanVien> dsNV) {
        dsNV.forEach(nv -> this.dsNV.add(nv));
    }

    public NhanVien timKiemID(String key) {
        for (int i = 0; i < dsNV.size(); i++) {
            if (dsNV.get(i).getMaNV().equals(key) == true) {
                return dsNV.get(i);
            }
        }
        return null;
    }

    public List<NhanVien> timKiemTenNV(String key) {
        return this.dsNV.stream().filter(nv -> nv.getTenNV().contains(key) == true).collect(Collectors.toList());
    }

    public List<NhanVien> timKiemNgaySinhNV(Date key) {
        return this.dsNV.stream().filter(nv -> nv.getNgaySinh().equals(key) == true).collect(Collectors.toList());
    }

    public List<NhanVien> timKiemPhongBanNV(String key) {
        return this.dsNV.stream().filter(nv -> nv.getThuocPhongBan().contains(key) == true).collect(Collectors.toList());
    }
    public List<NhanVien> timKiemTuoi(String key){
        return this.dsNV.stream().filter(nv->nv.tinhTuoi().contains(key)==true).collect(Collectors.toList());
    }
    public void showQuanLyNhanVien() {
        System.out.println("DANH SACH NHAN VIEN : ");
        this.dsNV.forEach(nv -> {
            nv.showNhanVien();
            System.out.println("++++++++++++++++++++++++++++++++");
        });
    }
    public List<NhanVien> getDsNV() {
        return dsNV;
    }

    public void setDsNV(List<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }
}

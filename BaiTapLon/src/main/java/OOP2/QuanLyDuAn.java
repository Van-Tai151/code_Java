package OOP2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyDuAn {

    private List<DuAn> ds = new ArrayList<>();

    public void them1DuAN(DuAn d) {
        this.ds.add(d);
    }

    public void themDSDuAn(DuAn... d) {
        this.ds.addAll(Arrays.asList(d));
    }

    public void xoaDuAn(DuAn d) {
        this.ds.remove(d);
        Demo.qlnv.getDsNV().forEach(nv -> {
            nv.getThamGiaDA().remove(d);
            nv.getDungDauDuAn().remove(d);
        });
    }

    public void capNhatDuAn(DuAn d) throws ParseException {
        d.nhap1DA();
        Demo.qlnv.getDsNV().forEach(nv -> {
            nv.getThamGiaDA().forEach(da -> {
                if (da.equals(d) == true) {
                    da = d;
                }
            });
            nv.getDungDauDuAn().forEach(da -> {
                if (da.equals(d) == true) {
                    da = d;
                }
            });
        });
    }

    public void sapXepChiPhi() {
        this.ds.sort((p1, p2) -> {
            double cost1 = p1.getTongChiPhi();
            double cost2 = p2.getTongChiPhi();

            return (cost1 > cost2 ? 1 : (cost1 < cost2 ? -1 : 0)); // tăng dần / giảm dần thì thêm -
        });
    }

    public DuAn timKiemMA(String key) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaDA().equals(key) == true) {
                return ds.get(i);
            }
        }
        return null;
    }

    public List<DuAn> timKiemTenDA(String key) {
        return this.ds.stream().filter(p -> p.getTenDA().contains(key) == true).collect(Collectors.toList());
    }

    public List<DuAn> timTheoNgayBatDau(Date key) {
        return this.ds.stream().filter(staff -> staff.getNgayBatDau().equals(key) == true).collect(Collectors.toList());
    }

    public void showTatCaDuAn() {
        System.out.println("DANH SACH DU AN :");
        this.ds.forEach(x -> {
            x.showDA();
            System.out.println("=============================");
        });
    }

    public List<DuAn> getDs() {
        return ds;
    }

    public void setDs(List<DuAn> ds) {
        this.ds = ds;
    }
}

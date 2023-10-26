
package OOP2;

import java.util.ArrayList;
import java.util.List;

public class QuanLyPhongBan {
    private List<PhongBan> dsPhongBan = new ArrayList<>();
    public void themPhongBan(PhongBan d){
        this.dsPhongBan.add(d);
    }
    public void showQuanLyPhongBan(){
        System.out.println("DANH SACH PHONG BAN : ");
        this.dsPhongBan.forEach(p->{
            p.show1PhongBan();
            System.out.println("=======================================");
        });
    }
    public List<PhongBan> getDsPhongBan() {
        return dsPhongBan;
    }
    public void setDsPhongBan(List<PhongBan> dsPhongBan) {
        this.dsPhongBan = dsPhongBan;
    }
}

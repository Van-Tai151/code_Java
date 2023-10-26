
package OOP2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class QuanLyNhanThan {
    private List<NhanThan> dsNT = new ArrayList<>();
    public NhanThan timKiemIDNT(String key){
        for(int i = 0;i<dsNT.size();i++){
            if(dsNT.get(i).getId().equals(key)==true){
                return dsNT.get(i);
            }
        }
        return null;
    }
    public void themDSNT(NhanThan...d){
        this.dsNT.addAll(Arrays.asList(d));
    }
    public void showDSNT(){
        System.out.println("DANH SACH NHAN THAN :");
        this.dsNT.forEach(x->{            
            x.showNT();
            System.out.println("==============================");
        });
    }
    
    public List<NhanThan> getDsNT() {
        return dsNT;
    }
    public void setDsNT(List<NhanThan> dsNT) {
        this.dsNT = dsNT;
    } 
}

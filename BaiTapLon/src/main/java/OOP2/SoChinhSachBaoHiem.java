/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP2;

/**
 *
 * @author Tài đẹp trai
 */
public class SoChinhSachBaoHiem {

    private String sbh;
    private NhanVien nv;
    private NhanThan nt;

    public SoChinhSachBaoHiem() {
    }

    public void capSoChinhSachBaoHiem(String sbh, NhanVien nv, NhanThan nt) {
        this.sbh = sbh;
        this.nv = nv;
        this.nt = nt;

        this.nt.getDsNV().add(nv);
        this.nv.getDsNT().add(nt);
    }

    public String getSbh() {
        return sbh;
    }

    public NhanVien getNv() {
        return nv;
    }

    public NhanThan getNt() {
        return nt;
    }

    public void setSbh(String sbh) {
        this.sbh = sbh;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public void setNt(NhanThan nt) {
        this.nt = nt;
    }

}

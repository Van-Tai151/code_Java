package OOP2;

public class NhanVienThamGiaDuAn {

    private NhanVien nv;
    private DuAn da;

    public NhanVienThamGiaDuAn() {
    }

    public void NhanVien_DuAn(NhanVien nv, DuAn da) {
        this.nv = nv;
        this.da = da;

        this.nv.getDungDauDuAn().add(da);
        this.da.getNhanVienThamGia().add(nv);
        this.nv.getThamGiaDA().add(da);
    }

    public NhanVien getNv() {
        return nv;
    }

    /**
     * @param nv the nv to set
     */
    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    /**
     * @return the da
     */
    public DuAn getDa() {
        return da;
    }

    /**
     * @param da the da to set
     */
    public void setDa(DuAn da) {
        this.da = da;
    }
}


package main;

public class LopHoc {
    QLDS qldsGV;
    QLDS qldsHS;

    public LopHoc() {
        qldsGV = new QLDS();
        qldsHS = new QLDS();
    }

    public LopHoc(QLDS qldsGV, QLDS qldsHS) {
        this.qldsGV = qldsGV;
        this.qldsHS = qldsHS;
    }

    public QLDS getQldsGV() {
        return qldsGV;
    }

    public void setQldsGV(QLDS qldsGV) {
        this.qldsGV = qldsGV;
    }

    public QLDS getQldsHS() {
        return qldsHS;
    }

    public void setQldsHS(QLDS qldsHS) {
        this.qldsHS = qldsHS;
    }
    
    public int themHocSinh(HocSinh hs){
        qldsHS.them(hs);
        return 0;
    }
    
    public int themGVGD(GiaoVien gv){
        qldsGV.them(gv);
        return 0;
    }
    
    public int inDSHS(){
        qldsHS.inDS();
        return 0;
    }
    
    public int inDSGV(){
        qldsGV.inDS();
        return 0;
    }
}

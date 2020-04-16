
package main;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        LopHoc lh = new LopHoc();
        
        HocSinh hs1 = new HocSinh("1A", "Choi game", "Nguyen Tuan Huy", "Dien Khanh - Khanh Hoa", "0362422116", 6);
        HocSinh hs2 = new HocSinh("2B", "Ca hat", "Le Van Luyen", "Tuy Hoa - Phu Yen", "0123245564", 7);
        HocSinh hs3 = new HocSinh("2E", "Hoi hoa", "Bui Tien Dung", "Nha Trang - Khanh Hoa", "0367837826", 7);
        GiaoVien gv1 = new GiaoVien("Toan", "Toan hoc", "Lai Van Sam", "Binh Dinh", "0361253616", 30);
        GiaoVien gv2 = new GiaoVien("Tin", "Cong nghe thong tin", "Tran Quang", "Son La","012356137", 43);
        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        lh.themHocSinh(hs3);
        lh.themGVGD(gv1);
        lh.themGVGD(gv2);
        
        //System.out.println(hs1.HienThiTT());
        lh.inDSHS();
        lh.inDSGV();
    }
    
}

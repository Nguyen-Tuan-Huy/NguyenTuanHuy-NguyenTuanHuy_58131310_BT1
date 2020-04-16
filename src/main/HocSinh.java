/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author zasx1
 */
public class HocSinh extends CaNhan{
    
    private String lop, nangKhieu;

    public HocSinh(String lop, String nangKhieu, String hoTen, String diaChi, String sdt, int tuoi) {
        super(hoTen, diaChi, sdt, tuoi);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public String HienThiTT() {
        return "\nHo ten: " + hoTen
                + "\nDia chi: " + diaChi
                + "\nSo dien thoai: " + sdt
                + "\nTuoi: " + tuoi
                + "\nLop: " + lop
                + "\nNang khieu: " + nangKhieu;
    }
}

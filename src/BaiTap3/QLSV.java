/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien>  dsSinhVien = new ArrayList<>();

    public QLSV(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    QLSV() {
       
    }
    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public ArrayList<SinhVien> getDsSV() {
        return dsSinhVien;
    }

    public void setDsSV(ArrayList<SinhVien> dsSV) {
        this.dsSinhVien = dsSV;
    }
     public void themSV(SinhVien sv)
            
    {
        dsSinhVien.add(sv);
    }
    public void SapXep()
    {
        dsSinhVien.sort((arg0, arg1) -> {
            return soSanh.soSanh(arg0, arg1);
        });

      
   }
    public void inDanhSach()
    {
        for(SinhVien i : dsSinhVien)
        {
            i.Xuat();
        }
    }
}

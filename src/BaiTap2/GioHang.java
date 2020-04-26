/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class GioHang {
    IThanhToan hinhThucTT;
    int giatienHang;
    ArrayList<HangHoa> ds = new ArrayList<>();

    public IThanhToan getHinhThucTT() {
        return hinhThucTT;
    }

    public int getGiatienHang() {
        return giatienHang;
    }

    public void setGiatienHang(int giatienHang) {
        this.giatienHang = giatienHang;
    }


    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    
     public double thanhToan(int tienHang)
    {
        return hinhThucTT.thanhToan(tienHang);
    }
     
      public void themHangHoa(HangHoa hh)
            
    {
        ds.add(hh);
        giatienHang+=hh.getGia();
    }
    
    public void inDanhSach()
    {
        for(HangHoa i : ds)
        {
           i.Xuat();
            
        }System.out.println("Tiền hàng: "+giatienHang);
    }
}

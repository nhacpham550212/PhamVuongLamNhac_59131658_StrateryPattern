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
    int giaHangHoa;
    ArrayList<HangHoa> ds = new ArrayList<>();

    public IThanhToan getHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public int getGiaHangHoa() {
        return giaHangHoa;
    }

    public void setGiaHangHoa(int giaHangHoa) {
        this.giaHangHoa = giaHangHoa;
    }
    
     public double thanhToan(int tienHang)
    {
        return hinhThucTT.thanhToan(tienHang);
    }
     
      public void themHangHoa(HangHoa hh)
            
    {
        ds.add(hh);
    }
    
    public void inDanhSach()
    {
        for(HangHoa i : ds)
        {
            i.Xuat();
            
        }
    }
}

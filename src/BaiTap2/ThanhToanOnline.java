/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Administrator
 */
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        
       if(tienHang<1000000&&tienHang>0)
       {
           return tienHang -(tienHang*0.05);
       }
       else
       {
           return tienHang -(tienHang*0.07);
       }
    }
    
}

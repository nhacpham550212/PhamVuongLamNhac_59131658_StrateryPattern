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
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa hanghoa1 =new HangHoa("Xe đạp ", 1200000, "xe đạp mã mới nhất");
        HangHoa hanghoa2=new HangHoa("Xe Máy", 22000000, "Xe Máy HonDa đời mới");
        HangHoa hanghoa3=new HangHoa("Xe Ô Tô", 200000000, "xe ô tô rẻ");
        HangHoa hanghoa4=new HangHoa("Bánh xe dự phòng ô tô", 1500000, "bánh xe lốp dày");
        //
        GioHang giohang1 = new GioHang();
        giohang1.themHangHoa(hanghoa1);
        giohang1.themHangHoa(hanghoa2);
        giohang1.inDanhSach();
        giohang1.setHinhThucTT(new ThanhToanOnline());
        System.out.println("Tiền khách hàng phải trả là :"+giohang1.thanhToan(12000000));
        //
        GioHang giohang2 = new GioHang();
        giohang2.themHangHoa(hanghoa3);
        giohang2.themHangHoa(hanghoa4);
        giohang2.inDanhSach();
        giohang2.setHinhThucTT(new ThanhToanCOD());
    }
    
}

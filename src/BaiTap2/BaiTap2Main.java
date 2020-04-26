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
        HangHoa hanghoa1 =new HangHoa("Xe đạp ", 500000, "xe đạp mã mới nhất");
        HangHoa hanghoa2=new HangHoa("Xe Máy", 5000000, "Xe Máy HonDa đời mới");
        HangHoa hanghoa3=new HangHoa("Tủ lạnh ", 4000000, "tủ lạnh đứng 2 tầng");
        HangHoa hanghoa4=new HangHoa("Bánh xe dự phòng ô tô", 1500000, "bánh xe lốp dày");
        //
        GioHang giohang1 = new GioHang();
        GioHang giohang2 = new GioHang();
        //
        giohang1.themHangHoa(hanghoa1);
        giohang1.themHangHoa(hanghoa2);
        System.out.println("Danh sách Hàng Hóa giỏ hàng 1:\n");
        giohang1.inDanhSach();
        giohang1.setHinhThucTT(new ThanhToanOnline());
        System.out.println("Tiền khách hàng phải trả là :"+giohang1.thanhToan(giohang1.getGiatienHang())+"\n");
        //
        giohang2.themHangHoa(hanghoa3);
        giohang2.themHangHoa(hanghoa4);
        System.out.println("Danh sách Hàng Hóa giỏ hàng 2:\n");
        giohang2.inDanhSach();
        giohang2.setHinhThucTT(new ThanhToanCOD());
        System.out.println("Tiền khách hàng phải trả là :"+giohang1.thanhToan(giohang2.getGiatienHang())+"\n");
    }
    
}

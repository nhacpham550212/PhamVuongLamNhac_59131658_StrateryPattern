/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author Administrator
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
            QLSV qlsv = new QLSV();
            SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
             SinhVien sv1 = new SinhVien("Ngô Bá Khá", ft.parse("19-10-1999"),9.1f);
             SinhVien sv2 = new SinhVien("Huấn Rose", ft.parse("10-11-1999"),8.2f);
             SinhVien sv3 = new SinhVien("Sứ Giả sự thật", ft.parse("11-12-1999"),7.3f);
           qlsv.themSV(sv1);
           qlsv.themSV(sv2);
           qlsv.themSV(sv3);
           
           System.out.println("Sắp Xếp theo tên :\n");
           qlsv.setSoSanh(new SoSanhTheoTen());
           qlsv.SapXep();
           qlsv.inDanhSach();
           //--------------------------------------------
           System.out.println("Sắp Xếp theo Điểm :\n");
           qlsv.setSoSanh(new SoSanhTheoDiem());
           qlsv.SapXep();
           qlsv.inDanhSach();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Administrator
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context cong = new Context();
       Context tru = new Context();
       cong.setTinhToan(new Cong());
        System.out.println("75+12=" + cong.tinh(75, 12));
       tru.setTinhToan(new Tru());
        System.out.println("54-78="+ tru.tinh(54, 78));
       
    }
    
}

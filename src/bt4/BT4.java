/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

/**
 *
 * @author admin
 */
public class BT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sanpham sp1 = new Sanpham(1, "Ban phim", "cai", 500000, 2000);
        sp1.output();
        
        Sanpham sp2 = new Sanpham(2, "Chuot", "cai", 100000, 2005);
        sp2.output();
        
        Sanpham sp3 = new Sanpham(3, "SmartTV,", "cai", 10000000, 2010);
        sp3.output();
        
        System.out.print("\nSo luong hang mua: 3 ban phim; 10 Chuot; 7 SmartTV");
        System.out.print("\nTong hoa don: "+(sp1.gia*3+sp2.gia*10+sp3.gia*7));
    }
    
}

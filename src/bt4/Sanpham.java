/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

import java.util.Scanner;
/*
3)	Xây dựng lớp sản phẩm (SanPham.java) bao gồm:
-	Mã sản phẩm, Tên sản phẩm, Đơn vị tính, Giá và Năm sản xuất
-	Constructor 5 tham số để khởi tạo giá trị cho 5 thông tin trên
-	Hàm xuất sản phẩm sao cho thông tin 1 sản phẩm là 1 dòng bao gồm 5 thông tin trên cách nhau bởi dấu chấm phẩy (;)
a.	Tạo ra 3 sản phẩm khác nhau và xuất 3 sản phẩm này ra màn hình. 
b.	Giả sử hóa đơn bao gồm 3 sản phẩm trên với số lượng tương ứng là 3,10 và 7. Tính tổng số tiền của hóa đơn
c.	Tạo mảng gồm N sản phẩm bất kỳ (N là hằng số với giá trị được xác định trong chương trình). Tìm sản phẩm có giá cao nhất

*/


/**
 *
 * @author admin
 */
public class Sanpham {
    
    public int ma;
    public String ten;
    public String donvi;
    public int gia;
    public int namsx;
    
    
    public Sanpham (int ma, String ten, String donvi, int gia, int namsx)
    {
        this.ma=ma;
        this.ten=ten;
        this.donvi= donvi;
        this.gia = gia;
        this.namsx = namsx;
    }
    
    public void output ()
    {
        System.out.print("\nThong tin cua san pham la: \n");
        System.out.print("Ma san pham: "+ma+"; Ten: "+ten+"; Don vi tinh: "+donvi+"; Gia: "+gia+"; Nam san xuat: "+namsx);
    }
    
  
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import java.text.SimpleDateFormat;

/**
 *
 * @author boss dung
 */
public class bai1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
   
    HoaDonHeader donHeader =new HoaDonHeader.Builder().addMaHD("LG01").addNgayBan("21/3/2019")
           .addTenKH("Diep Tuy Dung").build();
    CTHD cthd= new CTHD.Builder().addsanpham("Ti vi LG 42 inches").addsoluong(1).adddongia(10000)
            .addchieckhau(50).build();
    HoaDon hd =new HoaDon.Builder().addhoaDonHeader(donHeader).addlist(cthd).build();
           
        System.out.println(hd.toString());
                                                        
    }
}

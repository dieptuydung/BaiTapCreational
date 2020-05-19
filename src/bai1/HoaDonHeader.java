/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;


import java.util.Date;


/**
 *
 * @author boss dung
 */
public class HoaDonHeader {
    String MaHD;
    String NgayBan;
    String TenKH;

    public HoaDonHeader( Builder builder) {
        this.MaHD=builder.MaHD;
        this.NgayBan=builder.NgayBan;
        this.TenKH=builder.TenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "MaHD=" + MaHD + ", NgayBan=" + NgayBan + ", TenKH=" + TenKH + '}';
    }
    
    
    public static class Builder
    {
        String MaHD;
       String NgayBan;
        String TenKH;

        public Builder() {
        }
        

       
        public Builder addMaHD(String MaHD)
        {
            this.MaHD=MaHD;
            return this;
        }
        public Builder addNgayBan(String NgayBan)
        {
            this.NgayBan=NgayBan;
            return this;
        }
        public Builder addTenKH(String TenKH)
        {
            this.TenKH=TenKH;
            return this;
        }
        public HoaDonHeader build()
        {
            return new HoaDonHeader(this);
        }
            
    }  
        
       
    }

   
  


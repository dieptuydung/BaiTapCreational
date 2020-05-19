/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author boss dung
 */
public class CTHD {
        String sanpham;
        int soluong;
        double đongia;
        float chieckhau;

    public CTHD(Builder builder) {
        
        this.sanpham=builder.sanpham;
        this.soluong=builder.soluong;
        this.đongia=builder.đongia;
        this.chieckhau=builder.chieckhau;
    }

    @Override
    public String toString() {
        return  "sanpham=" + sanpham + ", soluong=" + soluong + "dongia=" + đongia + ", chieckhau=" + chieckhau + '\n';
    }
    
    public static class Builder
    {
         String sanpham;
        int soluong;
        double đongia;
        float chieckhau;

        public Builder() {
        }
        public Builder addsanpham(String sanpham)
        {
            this.sanpham=sanpham;
            return this;
            
        }
       
        public Builder addsoluong(int soluong)
        {
            this.soluong=soluong;
            return this;
            
        }
        public Builder adddongia(double dongia)
        {
            this.đongia=dongia;
            return this;
            
        }
        public Builder addchieckhau(float chieckhau)
        {
            this.chieckhau=chieckhau;
            return this;
            
        }
        public CTHD build()
        {
            return new CTHD(this);
        }
        
    }

   

   

   
    
           
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;

/**
 *
 * @author boss dung
 */
public class HoaDon {
    
    private HoaDonHeader hoaDonHeader;
    private ArrayList<CTHD> list;

    public HoaDon(Builder builder) {
      this.hoaDonHeader=builder.hoaDonHeader;
      this.list =builder.list;
        
    }

    @Override
    public String toString() {
        return "HoaDon{" + "hoaDonHeader=" + hoaDonHeader + ", list=" + list + '}';
    }
    
    public  static class Builder
    {
        
           
    private HoaDonHeader hoaDonHeader;
    private ArrayList<CTHD> list =new ArrayList<>();

       

       
        public  Builder addhoaDonHeader(HoaDonHeader hoaDonHeader)
        {
           this.hoaDonHeader=hoaDonHeader;
           return this;
        }
        public Builder addlist(CTHD list)
        {
            this.list.add(list);
            return this;
        }
        
        public HoaDon build()
                {
                    return new HoaDon(this);
                }
        
    
    }
    

}


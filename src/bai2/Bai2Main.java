/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author boss dung
 */
public class Bai2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MyStringBuilder msb= new MyStringBuilder.Builder().AddStr("Builder").AddBool(true).AddFloat(2.2f).builde();
        System.out.println(msb.toString());
    }
    
}

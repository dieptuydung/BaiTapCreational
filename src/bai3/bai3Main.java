/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author boss dunga
 */
public class bai3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ShapeFactory factory = ShapeFactory.Instance();
       Shape Circle= factory.createShape(ShapeType.circle);
       Circle.setBrush("co"+"\n");
       Circle.setPaper("giay ve"+"\n");
       Circle.setFrame("khung ve"+"\n");
        System.out.println(Circle.Draw());
    }
    
}

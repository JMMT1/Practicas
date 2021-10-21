/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_copia_objetos;

/**
 *
 * @author Admin
 */
public class Eva1_7_Copia_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj1 = new Prueba();
        System.out.println(obj1);
        Prueba obj2 = obj1;
        System.out.println(obj2);
        System.out.println("Valor de la x = " + obj1.x);
        obj2.x++;
        System.out.println("Valor de la x = " + obj1.x);

    }
    
}
class Prueba{
    int x = 10;
}

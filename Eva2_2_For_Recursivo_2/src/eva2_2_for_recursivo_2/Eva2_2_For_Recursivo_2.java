/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_for_recursivo_2;

/**
 *
 * @author Admin
 */
public class Eva2_2_For_Recursivo_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fakeForDown(5);
    }
    
    public static void fakeForDown (int iVal){
        System.out.println(iVal + " _ ");
        if(iVal > 1){
            fakeForDown(iVal - 1);//Esto es lo que debemos de controlar
        }    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_tipos_datos_primitivos;

/**
 *
 * @author Admin
 */
public class Eva1_1_Tipos_Datos_Primitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iVal = Integer.MAX_VALUE;
        System.out.println("Valor mas grande: " + iVal);
        iVal += 1;//overflow --> stackoverflow
        System.out.println("Valor mas grande: " + iVal);
        iVal = Integer.MIN_VALUE;
        System.out.println("Valor mas pequeño: " + iVal);
        
        for (int i = 0; i < 10; i++){
            String mensaje = "Hola mundo";
            System.out.println(mensaje + i);
        }
       
        
    }
    
}

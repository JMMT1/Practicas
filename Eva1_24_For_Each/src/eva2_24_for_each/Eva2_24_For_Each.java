/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_24_for_each;

/**
 *
 * @author Admin
 */
public class Eva2_24_For_Each {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []iArreglo = new int [10];
        
        for (int i = 0; i < iArreglo.length; i++) {
            iArreglo [i] = 100;
            
        }
        //for-each
        //Variable que almacena el valor de cada posicion: Arreglo que vamos a leer
        for(int temp: iArreglo){//va del primer elemento al ultimo
            System.out.print("[" + temp + "]");
            
        }
        
        System.out.println("");
        //Declara y se ponen en el arreglo
        int[] Datos = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[]sCadenas = new String[]{"Lunes", "Martes", "Miercoles", "Jueves"};
        for (String sCadena : sCadenas){
            System.out.println(sCadena);
        }
    }
    
}

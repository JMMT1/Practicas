/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_ordenamientos;

/**
 *
 * @author Admin
 */
public class EVA3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VAMOS A ORDENAR ARREGLO(INT)
        int[] datos = new int[10];
        llenar(datos);//envio el arreglo a llnar con valores aleatorios
        selectionSort(datos);
        imprimir(datos);//imrimir contenido
        
    }
    //LLENADO DE AREGLO CON VALORES ALEATORIOS 0 - 99
    public static void llenar(int[] datos){
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() * 100);
            
        }
        
    }
    //COPIA DE ARREGLO
    //IMPRIMIR ARREGLO
     public static void imprimir(int[] datos){
         System.out.println("");
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }
    }   
    
     //EFICIENCIA O(N 2)
     public static void selectionSort(int[] datos){
         
     }
}

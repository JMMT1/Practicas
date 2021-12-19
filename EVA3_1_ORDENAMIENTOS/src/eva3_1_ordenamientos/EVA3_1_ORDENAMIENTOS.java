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
        llenar(datos);//envio el arreglo a llenar con valores aleatorios
        imprimir(datos);//imprimir contenido
        selectionSort(datos);
        imprimir(datos);//imprimir contenido
        
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
    
     //EFICIENCIA O(N^2)
     public static void selectionSort(int[] datos){
         for (int i = 0; i < datos.length; i++) {
             int iMin = i;//EMPIEZA EL ALGORITMO, EL MINIMO ES EL PRIMER ELEMENTO
             for (int j = i + 1; j < datos.length; j++) {//BUSCAR LA POSICION DEL VALOR MAS PEQUEÑO
                 //COMPARAR
                 //valor [j] vs valor [min]
                 if(datos[j] < datos[iMin]){
                     iMin = j;
                 }
             }
             //INTERCAMBIO
             if(i != iMin){
                 //3 PASOS
                 //RESPALDAR UN VALOR
                 int iTemp = datos[i];
                 //INTERCAMBIAR UN VALOR
                 datos[i] = datos[iMin];
                 //REPONER EL VALOR RESPALDADO
                 datos[iMin] = iTemp;
            }
        } 
    }
}

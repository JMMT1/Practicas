/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_factorial;

/**
 *
 * @author Admin
 */
public class Eva2_3_Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial de 5 = " + factorialFor(5));
    }
    
    public static int factorial(int iVal){//Factorial usando recursividad
        if(iVal == 0)
            return 1;
        else
            return iVal * factorial(iVal - 1);
    }
    
    public static int factorialFor(int iVal){//Factorial usando un ciclo
        int iTemp = 0;
        for (int i = iVal; i > 0; i--) {
            iTemp = iTemp * i;
        }
        
        return iTemp;
    }
    
}

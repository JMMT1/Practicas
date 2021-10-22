/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Eva1_23_Numeros_Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int iVal = input.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < iVal; i++) {//Menor (iVal - 1) --> Nunca debe ser igual o mayor
            //Division: iVal / i --> Division exacta -- no es prmo
            //Modulo --> calcula el resiuo de una division
            //Java el modulo es % --> num1 % num2
            //7 % 5 = 2 division con residuo diferente a cero
            //15 % 3 = 0 divicion exacta
            int iMod = iVal % i;
            if (iMod == 0){//modulo es igual a cero, no es primo, hay que terminar
                esPrimo = false;
                break; //detiene permanente mente el for
                //continue;//detiene la iteracion actual
            }
            //si la divsion es exacta --> terminamos NO es primo
            //si terminamos el for sin dividir exactamente: es primo
        }
        //Imprimir si es primo o no
        if(esPrimo)
            System.out.println("El numero es primo");
        else
            System.out.println("El numero no es primo");
    }
    
}

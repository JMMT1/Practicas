/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_gcd;

/**
 *
 * @author Admin
 */
public class Eva2_4_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El MCD de 180 y 48 es " + gcd(48,180));
    }
    
    public static int gcd(int iDividendo, int iDivisor){
        //¿Como calculmos el residuo?
        //Modulo --> %
        if(iDivisor == 0)//Detenernos
            return iDividendo;
        else{            //Recursividad 
            int iResi = iDividendo % iDivisor;
            return gcd(iDivisor, iResi);
        }
        
    }
    
}

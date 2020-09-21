/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

/**
 *
 * @author walmir
 */
import java.util.Scanner;
class calcarea {
    public double b , r  , a ;
    
    public void calc(){
         Scanner ler = new Scanner(System.in);
           System.out.println(" digite o valor da base do retangulo");
        b = ler.nextDouble();
        
        System.out.println(" digite o valor dA altura ");
        a = ler.nextDouble();
        
        r = a * b;
        
        System.out.println("o area do retangulo total é " + r + "²");
    }
}

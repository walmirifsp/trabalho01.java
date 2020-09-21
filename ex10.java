/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.Scanner;

/**
 *
 * @author walmir
 */
public class ex10 {
     double c , r;
     public void celsius(){
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o valor em graus celsius ");
        c  = ler.nextDouble();
        r =(c * 9/5) + 32;
        System.out.println("o valor convertido em fahrenheit é " + r );
     }
    
}

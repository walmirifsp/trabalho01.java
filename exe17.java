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
public class exe17 {
     double x , y , t;
     public void exp(){
        System.out.println("digite o valor de x ");
           Scanner ler = new Scanner(System.in);
            x =  ler.nextDouble();
             System.out.println("digite o valor de y ");
            y =  ler.nextDouble();
            
            t = Math.pow(x, y);
            System.out.println("o numero digitado de x elevado a y é " + t);
     }
}

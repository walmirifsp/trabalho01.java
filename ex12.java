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
public class ex12 {
      double raio , altura , v;
      public void volume(){
       System.out.println("programa para descobrir o volume de um cone");
         System.out.println("digite o raio do cone");
      Scanner ler = new Scanner(System.in);
         raio  = ler.nextDouble();
                  System.out.println("digite a altura do cone");
                  altura  = ler.nextDouble();
              v =  Math.PI * Math.pow(raio, 2) * altura / 3 ;
              System.out.println("o volume do cone total é " + v);
      }
}

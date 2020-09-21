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
public class ex13 {
      double  v , h , k  ; 
      public  void VlMedia(){
       System.out.println("digite a velocidade ");
      Scanner ler = new Scanner(System.in);
      v =  ler.nextDouble();
        System.out.println("digite quantas horas o percurso");
        h =  ler.nextDouble();
       k = v / h;
        System.out.println("a velosidade media é de " + k + "km/s");
      }
}

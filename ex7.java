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
public class ex7 {
     double n1 , n2 , g;
     public void Mgeometrica(){
         Scanner ler = new Scanner(System.in);
        System.out.println("programa para calcular formulas geometricas entre dois valores");
       	System.out.println("Digite o valor 1 ");
	n1 = ler.nextDouble();
        System.out.println("Digite o valor 2 ");
	n2 = ler.nextDouble();
        
        g = Math.sqrt(n1 * n2);
        
        System.out.println("a media geometrica dos valores é " + g);
     }
}

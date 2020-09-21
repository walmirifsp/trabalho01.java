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
public class ex6 {
      double n1 , n2 , n3 , n4 , media;
      public void media(){
        Scanner ler = new Scanner(System.in);
	System.out.println("Digite o valor 1 ");
	n1 = ler.nextDouble();
        
        System.out.println("Digite o valor 2 ");
	n2 = ler.nextDouble();
        
        System.out.println("Digite o valor 3 ");
	n3 = ler.nextDouble();
        
        System.out.println("Digite o valor 4 ");
	n4 = ler.nextDouble();
        
        media = (n1 + n2 + n3 + n4 )/ 4; 
        
        System.out.println("a media total é " + media);
      }
}

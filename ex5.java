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
public class ex5 {
     double D , v , volume;

  public void esfera(){
        Scanner ler = new Scanner(System.in);
	System.out.println("Digite o valor da diametroe");
	D = ler.nextDouble();
        
        v = 4 * Math.PI * Math.pow(D, 3);
        volume = v /3;
	
        System.out.println("o volume da esfera é de " + volume);
  }
}

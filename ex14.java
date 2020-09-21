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
public class ex14 {
      double aresta , raio , volume , m , vl;
      public void esfera(){
        System.out.println("digite o valor da aresta ");
        Scanner ler = new Scanner(System.in);
        aresta =  ler.nextDouble();    
        
        volume = Math.pow(3, aresta);
        
        m = Math.cbrt(volume);
        System.out.println("digite o raio");
        raio =  ler.nextDouble(); 
        
        vl = 4/3 * Math.PI * Math.pow( raio / 2, 3);
        System.out.println("o volume total da esfera inscrita no cubo é de " + vl);
      }
}

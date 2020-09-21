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
public class ex11 {
     double d , raio , A;
     public void areacir(){
        System.out.println("digite o diametro do circulo");
      Scanner ler = new Scanner(System.in);
        d  = ler.nextDouble();
        raio = d / 2;
        
        A = Math.PI * Math.pow(raio , 2);
        
        System.out.println("a area total do circulo é de " + A );
     }
    
}

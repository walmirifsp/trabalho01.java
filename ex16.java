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
public class ex16 {
     double angulo , seno , cosseno , tangente , secante;
     
     public void tan(){
        System.out.println("digite o angulo");
          Scanner ler = new Scanner(System.in);
            angulo =  ler.nextDouble(); 
            seno = Math.sin(Math.toRadians(angulo));
            cosseno = Math.cos(Math.toRadians(angulo));
            tangente = Math.tan(Math.toRadians(angulo));
            secante = Math.ceil(Math.toRadians(angulo));
            
            System.out.println("o seno do angulo de " + angulo + "tem o seno  de " + seno);
                     System.out.println("o cosseno  do angulo de " + angulo + "tem o cosseno   de " + cosseno);
                              System.out.println("a tangente  do angulo de " + angulo + "tem a tangente   de " + tangente);
                                       System.out.println("o secante  do angulo de " + angulo + "tem o secante   de " + secante);
     }
}

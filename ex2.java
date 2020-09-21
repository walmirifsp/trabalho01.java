/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

/**
 *
 * @author walmir
 */
import java.util.Scanner;
class ex2 {
     double a , t;
     public void aresta(){
        Scanner ler = new Scanner(System.in);
        System.out.println(" digite o valor da aresta do quadrado");
        a = ler.nextDouble();
        
        t = a * a;
        System.out.println("o valor total do quadrado  é " + t);
     }
}

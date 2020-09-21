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
public class ex18 {
   
        
        double  p1 , p2 , p3 , p4 , p5 , t , v , troco;
        public void calcPreco(){
             Scanner ler = new Scanner(System.in);
        System.out.println("digite o valor do produto 1 ");
        p1 =   ler.nextDouble();
        System.out.println("digite o valor do produto 2 ");
        p2 =  ler.nextDouble();
        System.out.println("digite o valor do produto 3 ");
        p3 =  ler.nextDouble();
        System.out.println("digite o valor do produto 4 ");
        p4 =    ler.nextDouble();
        System.out.println("digite o valor do produto 5 ");
    
        p5 =  ler.nextDouble();
        
        
        t = p1 + p2 + p3 + p4;
        
        System.out.println(" o valor da compra ficou em  " + t);
        
        
        
        System.out.println("digite o valor dadod pelo cliente ");
         v  =  ler.nextDouble();
                 
        
        while(v < t )
        {
        
            System.out.println("dinheiro insuficiente");
             System.out.println("digite outro valor ");
              v  =  ler.nextDouble();
        }
            troco = v - t;
        System.out.println(" o troco fica em  " + troco );
       
        }
}

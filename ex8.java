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
public class ex8 {
     double mi , totquilomentros;
     
     public void totquilometros(){
                Scanner ler = new Scanner(System.in);
        System.out.println("digite o valor em milhas");
        mi = ler.nextDouble();
      totquilomentros = mi * 1.852;
      
        System.out.println("total em quilometros é " + totquilomentros);
        
   
     }
}

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
public class ex9 {
    
     double R , i , v;
     public void tensao(){
           Scanner ler = new Scanner(System.in);
        System.out.println("digite o valor da resistencia ");
        R = ler.nextDouble();
            System.out.println("digite o valor da corrente");
        i = ler.nextDouble();
        
        v = R * i;
        System.out.println("o valor da tensao  é de " + v+"v");
     }
    
}

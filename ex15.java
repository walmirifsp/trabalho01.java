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
public class ex15 {
    double real , d , dolar;
    public void dolar(){
        System.out.println(" digite o valor em real ");
        Scanner ler = new Scanner(System.in);
        real =  ler.nextDouble(); 
        
        dolar = real * 5.40;
        
        System.out.println("o valor convertido em dola é de  " + dolar);
        
    }
}

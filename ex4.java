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
public class ex4 {
    
    double diag , l;
    public void totquadrado(){
            Scanner ler = new Scanner(System.in);
              System.out.println(" digite a diagonal do quadrado");
            diag  =   ler.nextDouble();
            
            l = Math.pow(2,diag) / 2;
            System.out.println(" o valor total do quadrado é de " + l);
    }
}

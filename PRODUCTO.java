/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;
import java.util.Scanner;

/**
 *
 * @author AMD
 */
public class PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int volumen;
        int valor;
        int costo;
        
      System.out.println("CANTIDAD DEL PRODUCTO");
      volumen=entrada.nextInt();
      
      System.out.println("PRECIO DEL5 PRODUCTO");
      valor = entrada.nextInt();
      
      costo = volumen * valor;
      System.out.println("EL COSTO :"+" "+costo);
            
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p2;
import java.util.Scanner;
/**
 *
 * @author osiri
 */
public class PP2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaracion de variables
        float m;
        //estructura
        m = pedir();
        mostrar (m);
    }
    public static float pedir(){
        float m;
        Scanner teclado = new Scanner (System.in);
        System.out.println("*****   Conversor de metros   *****");
        System.out.println("Introduce en no. de metros");
        m = teclado.nextFloat();
        return m;
    }
    public static void mostrar (float m){
        //En esta parte de hace la conversion, durante el proceso de mostrar
        System.out.println("El equivalente en pies es "+m*3.28);
        System.out.println("El equivalente en yardas es "+m*1.09);
        System.out.println("El equivalente en millas es "+m*0.0006);
    }
    
}

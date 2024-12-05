/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejemplo02 {

    public static void main(String[] args) {

        int operacion;
        double calculo;
        double farenheit = 20;
        String cadena = "";

        for (operacion = 0; operacion <= 20; operacion ++){

       
        calculo = (5.0 / 9) * (farenheit - 32);
        
        cadena = String.format("%sOperacion(%d)Farenheit: %.2f===> Celcius: %.2f\n",
                cadena,
                operacion,
                farenheit,
                calculo);
         farenheit = farenheit + 4  ;
        }
     System.out.printf("%s\n", cadena);
    }
   
    
}

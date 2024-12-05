/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int limite;
        String cadena1 = "";
        
        for(num1 = 30; num1 >= 10; num1--){
            limite = num1;
            for(num2 = 60; num2 >=20; num2 -= 2 ){
            cadena1 = String.format("%s %d - %d - \n",
                    cadena1, num1, num2);
            }
        }
                
        System.out.printf("%s\n", cadena1);
    }
}

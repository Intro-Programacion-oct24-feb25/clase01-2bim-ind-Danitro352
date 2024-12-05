/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejemplo03 {
    public static void main(String[] args) {
        for (int num1 = 1; num1 <= 5; num1++) {
            for (int contador = 1; contador <= num1; contador++) {
                
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
        for (int num2 = 5; num2 >= 1; num2--) {
            for (int contador = 1; contador <= num2; contador++) {
                
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }
}

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
        int o2;
        int o3;
        int o4;
        int limite;
        String cadena1 = "";
        
        for(num1 = 30; num1 >= 10; num1--){
           
            o2 = num1 * 2;
            o3 = num1 * 3;
            o4 = num1 * 4;
            
                   
            cadena1 = String.format("%s %d - %d - %d - %d\n",
                    cadena1, num1, o2, o3, o4);
               }
        System.out.printf("%s\n", cadena1);
            }
    
        }
                
        
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author fabian
 */
public class Ejercicio1 {

    /**
     Declara 2 variables numéricas (con el valor que desees), he indica cual 
es mayor de los dos.Si son iguales indicarlo también. Ves cambiando 
los valores para comprobar que funciona.
     * @param args
     */
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 25;
        if (num1 < num2){ 
            System.out.println( num2 + " es mayor que " + num1);
        }else if(num2 < num1) {
            System.out.println( num1 + " es mayor que " + num2);
                    }else if(num2 == num1) {
            System.out.println( num1 + " es igual a " + num2);
          
        }
        }
    }
    


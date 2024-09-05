package EjerciciosJava.Ejer_Condicionales;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;
public class NumeroExtraño {
@Author: //Danilo Ramirez Salgado
    /*

 * Ejercicio en el cual, dado un numero entero diga si es Weird (extraño) o not Weird(no extraño)
 * si el numero esta entre el 1 y el 100
 * Dado un entero, , realice las siguientes acciones condicionales:

Si n es impar, imprima Extraño
Si n es par y está en el rango inclusivo de 2 a 5, imprima No Extraño
Si es par y está en el rango inclusivo de 6 a 20, imprima Extraño
Si es par y mayor que 20, imprima No Extraño
Caso de muestra 0: si n=3
n es impar y los números impares son extraños, imprimamos Extraño.

Caso de muestra 1: n=24
n>20 y es par, por lo que no es extraño. Por lo tanto, imprimimos No Extraño.
 * 
 */


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N>=1&&N<=100){
                  if(N==3){
                       System.out.println("Weird");
                }
            if(N>=2&&N<5&&N!=3){
          
                            System.out.println("Not Weird");

            }else if(N==5){
                   System.out.println("Weird");
            }
            else if(N>5&&N<=20){
                            System.out.println("Weird");

            }else if(N>20){
                     if(N%2==0){
                            System.out.println("Not Weird");
                     }else{
                            System.out.println("Weird");
                     }
            }
        }else{
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}

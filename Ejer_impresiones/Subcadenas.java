package EjerciciosJava.Ejer_impresiones;

import java.util.Scanner;

public class Subcadenas {public static void main(String[] args) {
    /*
     * La primera línea contiene una cadenaLa segunda línea contiene otra cadenaLas cadenas se componen únicamente de letras minúsculas del alfabeto inglés.

Formato de salida

Hay tres líneas de salida:
Para la primera línea, sume las longitudes de A y B.
Para la segunda línea, escribe Yes si A es lexicográficamente mayor que B. De lo contrario, imprima No en su lugar.
Para la tercera línea, escriba en mayúscula la primera letra de ambas A y B e imprimirlos en una sola línea, separados por un espacio.
en caso de que las cadenas sean iguales imprima no en la segunda impresion
     * 
     * 
     */
        
               
     Scanner sc=new Scanner(System.in);
     String A=sc.next();
     String B=sc.next();
     
             String primeraLetraA = A.substring(0, 1).toUpperCase();
     String restoA = A.substring(1);
     String cadena1 = primeraLetraA+restoA;
               String primeraLetraB = B.substring(0, 1).toUpperCase();
     String restoB = B.substring(1);
     String cadena2=primeraLetraB+restoB;

     String cadenafinal=cadena1+" "  +cadena2;
  int cantidad1=A.length();
  int cantidad2=B.length();
  System.out.println(cantidad1+cantidad2);
if(A.equals(B)){
    System.out.println("No");
} else{
    boolean resultado = A.compareTo(B) < 0;
if(resultado==true){
             System.out.println("No");
 }else{
 System.out.println("Yes");    
 }
}

 System.out.println(cadenafinal);
 
 }

}

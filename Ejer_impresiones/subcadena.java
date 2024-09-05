package EjerciciosJava.Ejer_impresiones;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class subcadena {
    /*
     * Programa que solicita una cadena de texto, la cual debe ser pega al dar espacio espera un entero que indica 
     * el inicio de la subcadena y espacio y otro entero para decir el final de la subcadena
     */
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String texto=S.substring(start,end);
        System.out.println(texto);
    }
}

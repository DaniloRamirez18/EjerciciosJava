package EjerciciosJava.Ejer_Ciclos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TablaMultiplicar {
    //Programa que imprima las tablas de multiplicar dado un el formato N * I = result
    public static void main(String[] args) throws IOException { 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//comento esta linea ya que el valor lo genera en haker rang
    //    int N = Integer.parseInt(bufferedReader.readLine().trim());

        for(int i=1; i<=10;i++){
            //ingreso el valor de dato tipo machetazo
            int N=2;
                int result = N * i; 
                System.out.printf("%d x %d = %d%n", N, i, result);
    
            }

        bufferedReader.close();
   
      
       
}    


    
}

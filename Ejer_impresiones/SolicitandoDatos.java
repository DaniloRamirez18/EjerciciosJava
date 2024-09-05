package EjerciciosJava.Ejer_impresiones;

import java.util.Scanner;

public class SolicitandoDatos {
            Scanner teclado = new Scanner(System.in);
        
        int i=teclado.nextInt();
        double b=teclado.nextDouble();
        //esto para cerrar el buffer y decirle que pida una cadena de texto
  teclado.nextLine();
  //y luego se pide el valor de la nueva cadena de texto
 
        String valor=teclado.nextLine();
 System.out.println("String: " + valor);
 System.out.println("Double: "+ b);
        System.out.println("Int: "+ i);
 
    }
}

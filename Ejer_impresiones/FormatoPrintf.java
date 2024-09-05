package EjerciciosJava.Ejer_impresiones;

import java.util.Scanner;

public class FormatoPrintf {
/*
 * Cada línea de entrada contendrá una cadena seguida de un entero.
Cada cadena tendrá un máximo de caracteres alfabéticos y cada entero estará en el rango inclusivo de 0 a 999.

Formato de salida

En cada línea de salida debe haber dos columnas:
La primera columna contiene la cadena y está justificada a la izquierda utilizando exactamente 15 caracteres.
La segunda columna contiene el entero, expresado en exactamente 3 dígitos; si la entrada original tiene menos 
de tres dígitos, debe rellenar los dígitos iniciales de la salida con ceros.
 */


/*
 * Explicación de los Específicos de Formato
%s – String (cadena de caracteres).
%d – Entero decimal.
%f – Número de punto flotante.
%.2f – Número de punto flotante con 2 decimales.
%tF – Fecha en formato YYYY-MM-DD.
%tT – Hora en formato HH:MM:SS.
%-15s – Cadena de caracteres alineada a la izquierda con un ancho mínimo de 15 caracteres.
%5d – Entero alineado a la derecha con un ancho mínimo de 5 caracteres.
%8.2f – Número de punto flotante con un ancho mínimo de 8 caracteres y 2 decimales.
Estos son solo algunos ejemplos y hay muchos más formatos disponibles que puedes utilizar según tus necesidades.
 */
     public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
   //en el tamaño se pone 14 porque lo inicio en cero el ciclo de for
   System.out.printf("%-14s %03d %n", s1, x);

            }
            System.out.println("================================");

    }
    
}

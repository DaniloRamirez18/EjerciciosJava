package EjerciciosJava.Ejer_impresiones;

public class ManejoCadenasBasico {
    //@Author: Danilo Ramirez Salgado
    public static void main(String[] args) {
        String nombre="Karla";
        String apellido="Esparza";
        System.out.print("sin retorno de carro");
        System.out.println("Concatenacion:" + nombre + apellido);
        System.out.println("");//aqui sabemos que hay retorno de carro, que es dejar espacio en ellos
        System.out.println("Nueva linea: \n" + nombre + " " + apellido); System.out.println("Tabulador: \t" + nombre + " " + apellido);
        System.out.println("Retroceso:\b" + nombre + " " + apellido);
        System.out.println("Retorno de carro: \r" + nombre + " " + apellido);
        System.out.println("Comilla simple: \'" + nombre + " " + apellido + "\'");
        System.out.println("Comilla doble: \"" + nombre + " " + apellido + "\"");
        }
        





}

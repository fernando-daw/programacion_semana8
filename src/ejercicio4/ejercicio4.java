package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

    public static String cadena(String cadena){
        return cadena;
    }
    public static int pedirEntero (String cadena){
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Introduce un valor entero");
        int valor = cubrir.nextInt();
        return valor;
    }

    public static void mostrar(String cadena){
        System.out.println(cadena);
    }


}

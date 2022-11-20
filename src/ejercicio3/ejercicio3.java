package ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    public static void main (String[] args){
        Scanner pedir = new Scanner(System.in);
        System.out.println("Introduce el numero de datos que quieres rellenar");
        int datos= pedir.nextInt();
        System.out.println("Establace un rango");
        System.out.println("Indica el maximo");
        int maximo=pedir.nextInt();
        System.out.println("Indica el minimo");
        int minimo=pedir.nextInt();

        int [] array = new int[datos];
        System.out.println("Los" +datos+ "numeros entre " + maximo + "y" + minimo + "son:");
        for (int i=0; i<= array.length; i++){
            int cualquiera = (int)Math.floor(Math.random()*(maximo-minimo+1)+minimo);
            for (int j=0; j<= array.length;j++){
                System.out.println("el primer digito es:"+ i);
            }

        }



    }

}

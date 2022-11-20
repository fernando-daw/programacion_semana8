package ejercicio2;

import java.util.Random;

public class azar {
    public  void parametros(int minimo, int maximo){
        Random al = new Random();
        int numero = al.nextInt(10);
        System.out.println("El numero aleatorio es " + numero);

    }

}

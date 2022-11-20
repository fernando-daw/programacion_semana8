package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class juego {
    Random al = new Random();
    int cualquiera = al.nextInt(10);
    int numero;

    public void acertarNumero(){
        for (int i=0; ;i++){
            Scanner cubrir= new Scanner(System.in);
            numero = cubrir.nextInt();
            if (cualquiera<numero){
                System.out.println("CASI! El numero a adivinar es menor");
            }
            if (cualquiera>numero){
                System.out.println("CASI ACIERTAS!El numero a adivinar es mayor");

            } else if (cualquiera==numero) {
                System.out.println("HAS ACERTADO EL NUMERO");


            }
        }
    }




}

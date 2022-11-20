package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {
    int numero, aleatorio = 0;
    int contador=1;
    Scanner rellenar = new Scanner(System.in);

    public void adivinar(){
        aleatorio = (int)(Math.random()*100);
        do {
            System.out.println("Es el intento " + contador + " de 5, el numero a adivinar es:");
            contador++;
            numero = rellenar.nextInt();
            if (aleatorio==numero){
                System.out.println("Has acertado el numero, ENHORABUENA!");
                return;
            }
            if (aleatorio<numero){
                System.out.println("Has fallado, el numero es mayor, intentalo de nuevo!");
            }
            if (aleatorio>numero){
                System.out.println("Has fallado, el numero es menor, intentalo de nuevo!");
            }
        } while (contador!=6);
            System.out.println("Has agotado tus intentos, vuelve a insertar moneda");
        }
    }


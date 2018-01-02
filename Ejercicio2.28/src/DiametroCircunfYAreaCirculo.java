/**
 * Created by marina on 28/12/17.
 */

import java.util.Scanner;

/**
 * escriba una aplicacion que reciba del usuario el radio de un circulo como un entero, y qeu imprima el diametro
 * la circunferencia y el area del Circulo mediante el uso del valor de punto flotante 3,14159 para Pi.
 */
public class DiametroCircunfYAreaCirculo {

  public static void main(String [] args){

    int radio;
    int diametro;
    double area;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el radio del circulo");
    radio = entrada.nextInt();

    diametro = 2*radio;
    area = 3.14159 * radio * radio;

    System.out.println("El diametro de la circunferencia es: " + diametro);
    System.out.println("El area de la circunferencia es: " + area);


  }
}



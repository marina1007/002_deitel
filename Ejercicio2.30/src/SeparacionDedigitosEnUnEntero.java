/**
 * Created by marina on 02/01/18.
 */

import java.util.Scanner;

/**
 * Escriba una aplicacion que reciba del usuario un numero compuesto por 5 digitos, que separe ese numero en
 * sus digitos individuales y los imprima, cada uno separado de los demas por tres espacios ej si el usuario
 * escribe el numero 42339 el programa debe imprimir 4   2   3   3   9
 */
public class SeparacionDedigitosEnUnEntero {

  public static void main(String[] args){

    int num, d1, d2, d3, d4, d5;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese un numero de 5 digitos");
    num = entrada.nextInt();

    d1 = num %10;
    d2 = num %100 / 10;
    d3 = num %1000 / 100;
    d4 = num %10000 / 1000;
    d5 = num %100000 / 10000;

    System.out.printf("%d   %d   %d   %d   %d\n\n", d5, d4, d3, d2, d1);


  }
}



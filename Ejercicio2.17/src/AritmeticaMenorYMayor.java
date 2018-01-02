/**
 * Created by marina on 27/12/17.
 */

import java.util.Scanner;

/**
 * escriba una aplicacion que reciba tres enteros del usuario y muestre la suma, producto, menor, y mayor de esos
 * numeros. utilice las tecnicas de la fig 2.15, el calculo del promedio en este ejercicio debe resultar en una
 * representacion entera del promedio. por lo tanto, si la suma de los valores es 7, el promedio debe ser 2
 * y no 2.3333...
 */
public class AritmeticaMenorYMayor {

  public static void main(String[] args){

    int num1;
    int num2;
    int num3;
    int suma;
    int prod;
    int promedio;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el primer numero: ");
    num1 = entrada.nextInt();

    System.out.println("Ingrese el segundo numero: ");
    num2 = entrada.nextInt();

    System.out.println("Ingrese el tercer numero: ");
    num3 = entrada.nextInt();

    suma = num1 + num2 + num3;
    System.out.println("La suma de los tres enteros es: " + suma);

    prod = num1 * num2 * num3;
    System.out.println("El producto de los tres enteros es: " + prod);

    promedio = (num1 + num2 + num3)/3;
    System.out.println("el promedio de los tres numeros es: " + promedio);

    if (num1 > num2 && num1 > num3)
      System.out.println("El primer numero es el mayor " + num1);

    if (num2 > num1 && num2 > num3)
      System.out.println("El segundo numero es el mayor " + num2);

    if (num3 > num1 && num3 > num2)
      System.out.println("El tercer numero es el mayor " + num3);

    if (num1 < num2 && num1 < num3)
      System.out.println("El primer numero es el menor  " + num1);

    if (num2 < num1 && num2 < num3)
      System.out.println("El segundo numero es el menor  " + num2);

    if (num3 < num1 && num3 < num2)
      System.out.println("El tercer numero es el menor " + num3);

  }
}



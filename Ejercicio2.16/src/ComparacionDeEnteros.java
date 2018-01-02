/**
 * Created by marina on 27/12/17.
 */

import java.util.Scanner;

/**
 * Escriba una aplicacion que pida al usuario que escriba dos enteros, que obtenga los numeros del usuario
 * y muestre el mas grando, seguido de las parlabras "es mas grande". Si son iguales, imprima el mensaje
 * "Estos numeros son iguales". Utilice las tecnicas que se muesran en la fig 2.15
 */
public class ComparacionDeEnteros {

  public static void main(String[] args){

    int num1;
    int num2;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el primer numero");
    num1 = entrada.nextInt();

    System.out.println("Ingrese el segundo numero");
    num2 = entrada.nextInt();

    if (num1 == num2)
      System.out.println("Estos numeros son iguales");

    if (num1 > num2)
      System.out.println("El mas grande es: " + num1);

    if (num2 > num1)
      System.out.println(" el segundo numero es mayor: " + num2);

  }
}



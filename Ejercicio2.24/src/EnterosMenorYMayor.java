/**
 * Created by marina on 28/12/17.
 */

import java.util.Scanner;

/**
 * escriba una aplicacion que lea cinco enteros y que determine e imprima los enteros mayor y menor en el grupo
 * use solamente las tecnicas de programacion que aprendio en este capitulo
 */
public class EnterosMenorYMayor {

  public static void main(String[] args){

    int num1;
    int num2;
    int num3;
    int num4;
    int num5;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el primer numero");
    num1 = entrada.nextInt();

    System.out.println("Ingrese el segundo numero");
    num2 = entrada.nextInt();

    System.out.println("Ingrese el tercer numero");
    num3 = entrada.nextInt();

    System.out.println("Ingrese el cuarto numero");
    num4 = entrada.nextInt();

    System.out.println("Ingrese el quinto numero");
    num5 = entrada.nextInt();

    // para verificar cual es el mayor de todos los numeros
    if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
      System.out.println("El mayor es el primer numero ingresado: " + num1);

    if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
      System.out.println("El mayor es el segundo numero ingresado: " + num2);

    if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5)
      System.out.println("El mayor numero ingresado es el tercero: " + num3);

    if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5)
      System.out.println("El mayor numero ingresado es el cuarto: " + num4);

    if (num5 > num1 && num5 > num2 && num5 > num3 && num5 < num4)
      System.out.println("El mayor numero ingresado es el quinto: " + num5);

    //para verificar cual es el menor de todos los numeros
    if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5)
      System.out.println("El menor es el primer numero ingresado: " + num1);

    if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5)
      System.out.println("El menor es el segundo numero ingresado: " + num2);

    if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5)
      System.out.println("El menor numero ingresado es el tercero: " + num3);

    if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5)
      System.out.println("El menor numero ingresado es el cuarto: " + num4);

    if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4)
      System.out.println("El menor numero ingresado es el quinto: " + num5);
  }
}



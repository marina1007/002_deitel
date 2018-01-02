/**
 * Created by marina on 28/12/17.
 */

import java.util.Scanner;

/**
 * Escriba una aplicacion que lea un entero y que determine e imprima si es par o impar. use el operador residuo
 * un numero par es multiplo de 2. cualquier multiplo de 2 deja un residuo de 0 cuando se divide entre 2
 */
public class ParOImpar {

  public static void main(String[] args){

    int num1;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el numero");
    num1 = entrada.nextInt();

    if (num1 %2 == 0){
      System.out.println("El numero ingresado es par: " + num1);
    }else {
      System.out.println("El numero ingresado es impar: " + num1);
    }

  }
}



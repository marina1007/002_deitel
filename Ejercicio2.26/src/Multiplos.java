/**
 * Created by marina on 28/12/17.
 */

import java.util.Scanner;

/**
 * Escriba una aplicacion que lea dos enteros, determine si el primero es multiplo del segundo e imprima
 * el resultado. use el operador residuo
 */
public class Multiplos {

  public static void main(String [] args){

    int num1;
    int num2;
    int resto;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el primer numero");
    num1 = entrada.nextInt();

    System.out.println("Ingrese el segundo numero");
    num2 = entrada.nextInt();

    resto = num1%num2;

    if (resto == 0){
      System.out.println("El primer numero es multiplo del segundo");
    }else {
      System.out.println("Los numeros no son multiplos");
    }



  }
}



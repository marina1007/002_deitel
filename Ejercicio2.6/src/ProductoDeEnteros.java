/**
 * Created by marina on 26/12/17.
 */

import java.util.Scanner;

/**
 * utilice las instrucciones del ejerc 2.5 para escribir un programa ompleto qe imprima el producto de tres enteros
 */
public class ProductoDeEnteros {

  public static void main (String[] args){
    int num1;
    int num2;
    int num3;
    int resultado;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el primer numero");
    num1 = entrada.nextInt();

    System.out.println("Ingrese el segundo numero");
    num2 = entrada.nextInt();

    System.out.println("Ingrese el tercer numero");
    num3 = entrada.nextInt();

    resultado = num1 * num2 * num3;

    System.out.println("El resultado del producto es: " + resultado);

  }


}



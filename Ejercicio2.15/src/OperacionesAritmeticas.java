/**
 * Created by marina on 27/12/17.
 */

import java.util.Scanner;

/**
 * (Aritmetica) escriba una aplicacion que pida al usuario que escriba dos enteros, que obtenga los numeros
 * del usuario e imprima la suma, producto, diferencia y cociente (division) de los numeros.
 * use las tecnicas de la figura 2.7
 */
public class OperacionesAritmeticas {

  public static void main(String [] args){
    int num1;
    int num2;
    int suma;
    int resta;
    int producto;
    double division;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el primer numero");
    num1 = entrada.nextInt();

    System.out.println("Ingrese el segundo numero");
    num2 = entrada.nextInt();

    suma = num1 + num2;
    System.out.println("el resultado de la suma es: " + suma);

    resta = num1 - num2;
    System.out.println("el resultado de la resta es: " + resta);

    producto = num1 * num2;
    System.out.println("El resultado de la multiplicacion es: " + producto);

    division = num1 / num2;
    System.out.println("El resultado de la division es: " + division);

  }
}

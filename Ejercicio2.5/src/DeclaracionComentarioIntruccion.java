/**
 * Created by marina on 22/12/17.
 */

import java.util.Scanner;

/**
 * Escriba declaraciones, instrucciones o comentarios para realizar cada una de las siguientes tareas
 */
public class DeclaracionComentarioIntruccion {

  public static void main(String[] args){
    // a) Indicar que un programaca calculara el producto de tres enteros
    // Rta: va entre comentario porque es lo que a a hacer el programa: //Calculo de tres numeros enteros

    // b) Crear un objeto Scanner llamado entrada que lea los valores de la entrada estandar

    Scanner entrada = new Scanner(System.in);

    // c) Declarar las variables x, y, z y el resultado de tipo int
    int x, y, z, result;

    // d) Pedir al usuario que escriaba el primer entero
    System.out.println("Ingrese el primer numero ");

    // e) leer el primer entero del usuario y alacenarlo en la variable x
    x = entrada.nextInt();

    // f) Pedir al usuario que escriba el segundo entero
    System.out.println("Ingrese el segundo numero");

    // g) leer el segundo entero del usuario y almacenarlo en la variable y
    y = entrada.nextInt();

    // h) Pedir al usuario que ingrese el tercer numero
    System.out.println("Ingrese el tercer numero");

    // i) Leer el tercer entero del usuario y almacenarlo en la variable z
    z = entrada.nextInt();

    // j) Calcular el producto de los tres enteros contenidos en las variables x, y, z y asignar el resultado
    // a la variable resultado.
    result = x * y * z;

    // K) Mostrar el ensaje "El producto es ",  seguido del valor de la variable resultado
    System.out.println("El producto es: " + result);

  }
}



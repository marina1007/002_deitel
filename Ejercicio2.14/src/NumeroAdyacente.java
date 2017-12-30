/**
 * Created by marina on 26/12/17.
 */

/**
 * Escriba una aplicacion que muestre los numeros del 1 al 4 en la misma linea, con cada par de numeros
 * adyacentes separado por un espacio. Use las siguientes tecnicas:
 */
public class NumeroAdyacente {

  public static void main(String[] args){

    int i=0;
    System.out.println("Los numeros son: " + (i + 1) + " " +(i + 2) + " " +(i + 3 ) + " " +(i + 4));

    System.out.print("Los numeros son: " + (i + 1) + " " +(i + 2) + " " +(i + 3 ) + " " +(i + 4));

    System.out.printf("\n %d  %d  %d  %d\n", (i + 1) , (i + 2) , (i + 3 ) , (i + 4));
  }
}

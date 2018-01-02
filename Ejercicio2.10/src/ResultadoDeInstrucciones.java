/**
 * Created by marina on 26/12/17.
 */

/**
 * Suponiendo que x = 2 y y = 3, que muestra cada una de las siguientes instrucciones
 */
public class ResultadoDeInstrucciones {

  public static void main(String[] args){
    int x = 2;
    int y = 3;
    //  a) System.out.printf("x=%d\n , x");
    System.out.printf("x = %d\n " , x); // muestra el valor de x

    // b) System.out.printf("el valor de %d + %d es %d\n" , x, x, (x + x) );
    System.out.printf("el valor de %d + %d es %d\n" , x, x, (x + x) ); // muestra el valor de la suma de x + x

    // c)
    System.out.printf("x = "); // muestra una cadena de texto

    // d)
    System.out.printf("%d = %d\n", (x + y), (y + x)); // muestra el resultado de x + y y luego el de y+x en la seg linea

  }


}

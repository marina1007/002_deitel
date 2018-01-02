/**
 * Created by marina on 22/12/17.
 */

/**
 * Identifique y corrija los errores en cada una de las siguientes instrucciones
 */
public class DeteccionDeErrores {

  public static void main (String[] args){

    int c1 = 0;
    //a)
    //if (c < 7); //el error es que no debe ir ";" y el cuerpo del if va entre {},
    // si es una sola instruccion no hace falta {}
    //System.out.println("c es menor que 7");
    // la instruccion correcta es

    if (c1 < 7) {
      System.out.println("c1 es menor que 7 " + c1);
    }

    //b)
    //if (c1 => 7){  Dentro de la condicion el signo de mayor debe ir antes dque el igual
      //System.out.print("c1 es menor o igual que 7");
    //}

    int c2 = 9;

    if (c2 >= 7){
      System.out.println("c1 es mayor o igual que 7" + c2);
    }

  }

}



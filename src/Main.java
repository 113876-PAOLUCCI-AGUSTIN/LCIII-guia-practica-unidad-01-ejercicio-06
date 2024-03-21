/*
* 6. Ingresar un año e indicar si ese año es bisiesto.
* Un año es bisiesto si es múltiplo de 4 y no es múltiplo de 100 o si es
* múltiplo de 400.
* MEJOR EXPLICACIÓN: los años bisiestos son los que son divisibles por 4 pero no por 100,
* y los que siendo divisibles por 100, son divisibles por 400.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer anioIngresado;

        Scanner input = new Scanner(System.in);
        anioIngresado = input.nextInt();
        if ((anioIngresado % 4 == 0 && anioIngresado % 100 != 0) ||
           (anioIngresado % 100 == 0 && anioIngresado % 400 == 0)) // V o V --> true
        {
            System.out.println(anioIngresado + ": ES bisiesto.");
        }
        else {
            System.out.println(anioIngresado+ ": NO es bisiesto.");
        }
    }
}
package PracticaMetodos;
import java.util.*;
public class Ejercicio12 {
    //Realizar un método llamado calcularIva, que calcule el IVA (22%) dado un número float llamado sueldo,
    // recibido por parámetro. Sugerencia: utilizar variables estáticas.

    public static final float IVA = 22;
    public static void main(String []args){
        float sueldo;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el sueldo");
        sueldo = input.nextFloat();
        float calcularIva = calcularIva(sueldo);
        System.out.println("el monto del IVA es  " + calcularIva);
    }

    // METODO CALCULAR IVA DEL SUELDO
    public static float calcularIva(float sueldo){
        float montoIva = sueldo * (IVA / 100);
        return montoIva;
    }

}

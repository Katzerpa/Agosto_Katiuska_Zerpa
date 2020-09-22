package PracticaArregloMetodo;

import java.util.Scanner;
  //21 Contar el número de elementos positivos, negativos y ceros en un array de 5 enteros.
  //Los numeros deben ser ingresados por el usuario. Luego, mostrar la cantidad de números positivos, negativos y ceros:
  //Ej. “Se ingresaron 2 números positivos, 1 número negativo y 1 cero”

public class Metodo_Arreglo_E21 {

    public static void main(String[] args){
        int[] numeros = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<numeros.length; i++){
            System.out.println("Ingrese numero " + (i + 1));
            numeros[i] = input.nextInt();
        }
        contarPositivosNegativosCeros(numeros);
    }

    //Metodo Contar numeros positivos,negativos y cero.
    public static void contarPositivosNegativosCeros(int[]numero){
        int positivo=0; int negativo =0; int cero = 0;
        for (int i = 0; i <numero.length;i++){

            if(numero[i] == 0){
                cero = cero + 1;
            }
            if (numero[i]>=0){
                positivo =positivo +1;
            }
            if(numero[i]<0){
                negativo = negativo + 1;
            }

        }
        System.out.println("La cantidad de Positivos es " + positivo + " La cantidad de Negativo  es " + negativo +
                " y la cantidad de cero es " + cero);

    }


}

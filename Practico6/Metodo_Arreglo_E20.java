package PracticaArregloMetodo;

public class Metodo_Arreglo_E20 {
    //Crear un método que reciba un arreglo de booleanos y retorne true si y sólo si, todos los
    //elementos son verdaderos.

    public static void main(String[] args){
        boolean[]  laPuertaEstaAbierta = new boolean[5];
        laPuertaEstaAbierta[0]= true;
        laPuertaEstaAbierta[1]= true;
        laPuertaEstaAbierta[2]= true;
        laPuertaEstaAbierta[3]= true;
        laPuertaEstaAbierta[4]= true;

        if(verificarPuertasAbiertas(laPuertaEstaAbierta)){
            System.out.println("Todas las puertas estan abiertas ");
        }

    }

    // Metodo Arreglo Booleano
    public static boolean verificarPuertasAbiertas(boolean[] puertaAbierta){
        boolean flag01 = false;
        for (int i=0;i< puertaAbierta.length; i++){

            if(puertaAbierta[i]){
                flag01= true;
            }
            else {
                flag01 = false;
                break;
            }
        }
        return flag01;
    }

}

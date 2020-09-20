package PracticaArregloMetodo;

public class Metodo_Arreglo_E20 {
    //Crear un método que reciba un arreglo de booleanos y retorne true si y sólo si, todos los
    //elementos son verdaderos.

    public static void main(String[] args){
        boolean[] puertaAbieta = new boolean[5];
        puertaAbieta[0]= true;
        puertaAbieta[1]= true;
        puertaAbieta[2]= true;
        puertaAbieta[3]= true;
        puertaAbieta[4]= true;

        if(arregloTrue(puertaAbieta)){
            System.out.println("Todos son verdaderos ");
        }

    }


    // Metodo Arreglo Booleano
    public static boolean arregloTrue(boolean[] puerta){
        boolean flag01 = false;
        for (int i=0;i<puerta.length; i++){

            if(puerta[i]){
                flag01= true;
            }
            else {
                flag01 = false;
                break;}
        }

        return flag01;
    }

}

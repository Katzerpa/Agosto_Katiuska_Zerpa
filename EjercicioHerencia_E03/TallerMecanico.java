package PracticoHerencia_E03;

import java.util.Scanner;

public class TallerMecanico {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 1 = para Auto  2= Motocicleta 3= Semi Remolque 0= salir");
        int opcionMenu = input.nextInt();
        // Crear Autos
        if(opcionMenu == 1){
            System.out.println("Ingrese la cantidad de Auto a ingresar");
            int num = input.nextInt();
            Vehiculo[] auto = new  Vehiculo[num];
            for (int i = 0 ; i < num ; i ++){
                System.out.println("Ingrese el color del Auto nro " + (i + 1));
                String color = input.next();
                System.out.println("Ingrese la cantidad de rueda del Auto nro " + (i + 1));
                int rueda = input.nextInt();
                System.out.println("Ingrese la Velocidad Maxima del Auto nro " + (i + 1));
                int velocidad=input.nextInt();
                System.out.println("Ingrese la cantidad de Cilindadra del Auto nro " + (i + 1));
                String cilindrada = input.next();
                auto[i] = new Auto(color,rueda,velocidad,cilindrada);

            }
            for (int i = 0 ; i < num ; i ++){
                System.out.println(" Item:" + (i+1) + "  "+ auto[i].toString());
            }

        }
        // Crear Motocicleta
        if(opcionMenu == 2){
            System.out.println("Ingrese la cantidad de Motocicleta a ingresar");
            int num = input.nextInt();
            Vehiculo[] moto = new  Vehiculo[num];
            for (int i = 0 ; i < num ; i ++){
                System.out.println("Ingrese el color de la  Motocicleta nro " + (i + 1));
                String color = input.next();
                System.out.println("Ingrese la cantidad de rueda de la Motocicleta nro " + (i + 1));
                int rueda = input.nextInt();
                System.out.println("Ingrese la Velocidad Maxima de la Motocicleta nro " + (i + 1));
                int velocidad=input.nextInt();
                System.out.println("Ingrese la cantidad de Cilindadra de la Motocicleta nro " + (i + 1));
                String cilindrada = input.next();
                moto[i] = new Motocicleta(color,rueda,velocidad,cilindrada);

            }
            for (int i = 0 ; i < num ; i ++){
                System.out.println(" Item:" + (i+1) + "  "+ moto[i].toString());
            }

        }
        // Crear SemiRemolque
        if(opcionMenu == 3){
            System.out.println("Ingrese la cantidad de Semi Remolque a ingresar");
            int num = input.nextInt();
            Vehiculo[] remolque = new  Vehiculo[num];
            for (int i = 0 ; i < num ; i ++){
                System.out.println("Ingrese el color del Semi Remolque nro " + (i + 1));
                String color = input.next();
                System.out.println("Ingrese la cantidad de rueda del Semi Remolque nro " + (i + 1));
                int rueda = input.nextInt();
                System.out.println("Ingrese la cantidad de Eje del Semi Remolque nro " + (i + 1));
                int canteje=input.nextInt();

                remolque[i] = new SemiRemolque(color,rueda,canteje);

            }
            for (int i = 0 ; i < num ; i ++){
                System.out.println(" Item:" + (i+1) + "  "+ remolque[i].toString());
            }

        }

    }



}

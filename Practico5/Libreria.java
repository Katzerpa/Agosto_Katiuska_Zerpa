
package PracticaClasesyObjetos_E03;

import java.util.Scanner;

public class Libreria {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //Datos primer Libro

        System.out.println("Ingrese el numero ISBN del Libro nro 1");
        int ibsn1 = input.nextInt();
        System.out.println("Ingrese el Titulo del Libro nro 1");
        String titulo1 = input.next();
        System.out.println("¿Conoce el autor del libro nro 1? S/N");
        String r = input.next();
        String autor1;
        if(r.equalsIgnoreCase("S")){
            System.out.println("Ingrese el Autor del Libro nro 1");
            autor1 = input.next();
        }
        else {
            autor1 = null;
        }

        System.out.println("Ingrese el numero de paginas del Libro nro 1");
        int numeroPagina1 = input.nextInt();

        // Datos Segundo libro

        System.out.println("Ingrese el numero ISBN del Libro nro 2");
        int ibsn2 = input.nextInt();
        System.out.println("Ingrese el Titulo del Libro nro 2");
        String titulo2 = input.next();
        System.out.println("¿Conoce el autor del libro nro 2? S/N");
        String r1 = input.next();
        String autor2;
        if(r1.equalsIgnoreCase("S")){
            System.out.println("Ingrese el Autor del Libro nro 2");
            autor2 = input.next();
        }
        else {
            autor2 = null;
        }
        System.out.println("Ingrese el numero de paginas del Libro nro 2");
        int numeroPagina2 = input.nextInt();


        //Actualizacion datos contructor sin parametros

        Libro libro1 = new Libro();
        libro1.setIsbn(ibsn1);
        libro1.setTitulo(titulo1);
        libro1.setAutor(autor1);
        libro1.setNumeroPagina(numeroPagina1);

        //Por parametro libro 2

        Libro libro2 = new Libro(ibsn2,titulo2,autor2,numeroPagina2);

        // impresiones

        System.out.println(libro1);
        System.out.println(libro2);





    }

}

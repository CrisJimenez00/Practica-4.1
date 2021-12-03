/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.cristina;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cristina
 */
public class PruebaLibroElectronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean solicitarDatos = true;
        //Prueba
//        //Objeto prueba
//        LibroElectronico prueba1 = new LibroElectronico();
//        //Pasamos pagina
//        prueba1.pasarPagina();
//        System.out.println("Pasar pagina : " + prueba1.getPagActual());
//        prueba1.retrocederPagina();
//        System.out.println("retroceder pagina : " + prueba1.getPagActual());
//        prueba1.saltar(2000);
//        System.out.println("Saltar adelante pagina : " + prueba1.getPagActual());
//        prueba1.saltar(-200000);
//        System.out.println("Saltar detrás pagina : " + prueba1.getPagActual());

        //Crea dos libros con el constructor por defecto. Muestra por consola los 
        //datos de estos libros usando el método toString. 
        //--------LIBRO 1 CON CONSTRUCTOR POR DEFECTO-----------------
        LibroElectronico libro1 = new LibroElectronico();

        System.out.println("Libro 1 contructor por defecto-------------------\n"
                + libro1.toString());

        //--------LIBRO 2 CON CONSTRUCTOR POR DEFECTO-----------------
        LibroElectronico libro2 = new LibroElectronico();

        System.out.println("Libro 2 contructor por defecto-------------------\n"
                + libro2.toString());

        //Crea dos libros con el constructor parametrizado
        //Usando JOption y toString, muestra los datos estos objetos.
        //------------------LIBRO 1 CON CONSTRUCTOR PARAMETRIZADO---------------------------
        String tituloLibro1 = JOptionPane.showInputDialog("Introduzca el nombre del libro 3");

        int numPaginas1 = 0, tamanio1 = 0;
        do {
            try {

                String numPaginasLibro1 = JOptionPane.showInputDialog("Introduzca el número de páginas del libro 3");

                String tamanioLibro1 = JOptionPane.showInputDialog("Introduzca el tamaño del libro 3");

                numPaginas1 = Integer.parseInt(numPaginasLibro1);

                tamanio1 = Integer.parseInt(tamanioLibro1);
                solicitarDatos = false;
            } catch (NumberFormatException nme) {
                //Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números"
                        + "\nVuelva a introducir los datos");
            }
        } while (solicitarDatos);
        LibroElectronico libro3 = new LibroElectronico(tituloLibro1, numPaginas1, tamanio1);

        System.out.println("Libro 3 parametrizado------------------\n"
                + libro3.toString());

        //-------------------LIBRO 2 CON CONSTRUCTOR PARAMETRIZADO--------------------
        String tituloLibro2 = JOptionPane.showInputDialog("Introduzca el nombre del libro 4");
        solicitarDatos = true;
        int numPaginas2 = 0, tamanio2 = 0;
        do {
            try {

                String numPaginasLibro2 = JOptionPane.showInputDialog("Introduzca el número de páginas del libro 4");

                String tamanioLibro2 = JOptionPane.showInputDialog("Introduzca el tamaño del libro 4");

                numPaginas2 = Integer.parseInt(numPaginasLibro2);

                tamanio2 = Integer.parseInt(tamanioLibro2);
                solicitarDatos = false;
            } catch (NumberFormatException nme) {
                //Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números"
                        + "\nVuelva a introducir los datos");
            }
        } while (solicitarDatos);

        LibroElectronico libro4 = new LibroElectronico(tituloLibro2, numPaginas2, tamanio2);

        System.out.println("Libro 4 parametrizado------------------\n"
                + libro4.toString());

        //Prueba a crear un nuevo libro con 12000 páginas y 12 MB. 
        //Muestra los datos de este objeto usando la consola y toString.
        LibroElectronico libro5 = new LibroElectronico("Yermas", 12000, 12);
        System.out.println("Libro 5 parametrizado------------------\n"
                + libro5.toString());

        //Establece 13000 páginas en el primer libro creado. 
        //Muestra los datos de este objeto usando la consola y toString.
        libro1.setNumPaginas(13000);
        System.out.println("Libro 1 cambiando el num de páginas------------------\n"
                + libro1.toString());

        //Establece como tamaño 15MB en el segundo libro creado. 
        //Muestra los datos de este objeto usando la consola y toString.
        libro2.setEspacioOcupado(15);
        System.out.println("Libro 2 cambiando el espacio ocupado------------------\n"
                + libro2.toString());

        System.out.println("");
        libro3.pasarPagina();
        System.out.println("Pasamos de página en el libro 3: "
                + libro3.getPagActual());
        System.out.println("Así quedaría en toString: \n" + libro3.toString());

        libro4.saltar(450000);
        System.out.println("");
        System.out.println("Saltamos de página en el libro 4: "
                + libro4.getPagActual());
        System.out.println("Así quedaría en toString: \n" + libro4.toString());

        libro4.retrocederPagina();
        System.out.println("");
        System.out.println("Retrocedemos una página en el libro 4: "
                + libro4.getPagActual());
        System.out.println("Así quedaría en toString: \n" + libro4.toString());

        libro4.saltar(-5000000);
        System.out.println("");
        System.out.println("Volvemos al principio del libro 4: "
                + libro4.getPagActual());
        System.out.println("Así quedaría en toString: \n" + libro4.toString());
    }

}

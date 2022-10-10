package test;

import domain.entrenador;
import domain.futbol;
import domain.futbolista;
import domain.masajistas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pruebaFutbol {

    private static int id;
    private static String nombre;
    private static String apellido;
    private static int edad;
    private static int dorsal;
    private static String posicion;

    public static void limpiar() {
        id = 0;
        nombre = "";
        apellido = "";
        edad = 0;
        dorsal = 0;
        posicion = "";
    }

    public static Object captura() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido");
        apellido = sc.nextLine();
        System.out.println("Edad");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("Dorsal");
        dorsal = Integer.parseInt(sc.nextLine());
        System.out.println("Posicion");
        posicion = sc.nextLine();
        
        futbolista fut = new futbolista(id, nombre, apellido, edad, dorsal, posicion);
        return fut;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        futbol sf = new futbol(1, "Patrizia", "Castillo", 19);
        //System.out.println(sf.toString());

        futbolista jugador = new futbolista(2, "Miguel", "Gomez", 28, 7, "Hola");
        //System.out.println(jugador.toString());

        masajistas masajista = new masajistas(3, "Joshua", "Delgado", 22, "Fisioterapia", 1);
        //System.out.println(masajista.toString());

        entrenador entrena = new entrenador(4, "Angel", "Garcia", 19, "Entrenador");
        //System.out.println(entrena.toString());

        List<futbolista> futbolistas = new ArrayList<>();
        
        int respuesta = 1;
        while (respuesta == 1) {
            limpiar();
            Object fut = captura();

            futbolistas.add((futbolista) fut);

            System.out.println("Desea otro elemento \n 1. Si \n 2. Limpiar la lista \n 3. Ver registros");
            respuesta = sc.nextInt();
            
            switch (respuesta) {
                case 1:
                    respuesta = 1;
                    break;
                case 2:
                    futbolistas.clear();
                    break;
                case 3:
                    System.out.println(futbolistas);
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        System.out.println(futbolistas);
    }
}
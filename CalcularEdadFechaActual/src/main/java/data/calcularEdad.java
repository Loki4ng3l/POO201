/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate; 

/**
 *
 * @author pepe
 */
public class calcularEdad {
    static String fechaNac;
    static int edad;
    
    public static void RegistroFechaNac(){
        try {
            System.out.println("Ingrese la fecha de Nacimiento en el formato yyyy/mm/dd :");
            Scanner ff = new Scanner(System.in);
            fechaNac = ff.nextLine();
        } catch (Exception e) {
            System.out.println("Ingresa una fecha de nacimiento valida (yyyy/mm/dd) por favor");
        }
    }
    
    public static void RegistroEdad(){
        try {
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate fechaNacimiento = LocalDate.parse(fechaNac, formatoFecha);

            LocalDate fechaAct = LocalDate.now();

            Period periodo = Period.between(fechaNacimiento, fechaAct);
            System.out.printf("Tu edad es de: " + periodo.getYears());
            edad = periodo.getYears();
            
            System.out.println();
        } catch (Exception e) {
            System.out.println("No se que poner");
        }
        
            

    }
    
    public static void main(String[] args) {
        RegistroFechaNac();
        RegistroEdad();
    }
}

package test;

import domain.Terrestres;

public class pruebaVehiculo {
    public static void main(String[] args) {
         Terrestres auto = new Terrestres(4, 5, 13, "Chevrolet", 5, 2022, "Silao", "Negro");
         
         System.out.println(auto.toString());
    }
}
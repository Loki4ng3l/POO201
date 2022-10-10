package domain;

public class Recursividad {
    //Suma de todos los numeros del 0 hasta k
    
    public static int suma(int k){
        //Caso base
        if (k>1) {
            return k + suma(k-1);
        }else{
            return 0;
        }
    }
    
    public static int sumaIntervalos(int inicio, int fin){
        if (fin >= inicio) {
            return fin + sumaIntervalos(inicio, fin - 1);
        }else{
            return 0;
        }
    }
    
    public static int factorial(int k){
        if (k>1) {
            return k * factorial(k-1);
        } else{
            return 1;
        }
    }
    
    public static void main(String[] args) {
        /*
        int suma = 0, intervalo = 10;
        for (int i = 0; i < intervalo; i++){
        suma = suma + i;
        }
        System.out.println("El valor de la suma es: "+ suma);
        
        int factorial = 1;
        for (int i = 1; i < 5; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial: " + factorial);
        */
        
        System.out.println(suma(5));
        System.out.println(sumaIntervalos(5, 10));
        System.out.println(factorial(10));
    }
}
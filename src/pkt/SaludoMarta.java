package pkt;

import java.util.Scanner;

public class SaludoMarta {

	public static void main(String[] args) {
		int numero=0;
		System.out.println("Buenos días Ceinmark, soy Irene Verdeja");
		Scanner entrada=new Scanner(System.in);
		numero=Integer.parseInt(entrada.nextLine());
		
		System.out.println("Introduce un número para averiguar si es primo o no:");
	       if (esPrimo(numero)) {
	            System.out.println(numero + " es primo");
	        } else {
	            System.out.println(numero + " no es primo");
	        }
	    }
    public static boolean esPrimo(int numero) {
        
        // Si el número es 1, no es primo
        if (numero == 1) {
            return false;
        }
        
        // Comprobamos si el número es divisible por algún otro número menor que él mismo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        // Si no se encontró ningún divisor, el número es primo
        return true;
    }
    

}

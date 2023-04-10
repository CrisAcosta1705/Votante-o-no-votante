package Votante_O_NoVotante;
import java.util.Scanner;
public class Votante_O_NoVotante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        // Pedimos al usuario que ingrese su edad
	        System.out.println("Ingrese su edad:");
	        int edad = sc.nextInt();
	        
	        // Verificamos si la persona es votante o no
	        if (edad >= 16) {
	            System.out.println("Usted es votante.");
	        } else {
	            System.out.println("Usted no es votante.");
	        }
	        
	        // Cerramos el objeto Scanner
	        sc.close();
	    }

	}
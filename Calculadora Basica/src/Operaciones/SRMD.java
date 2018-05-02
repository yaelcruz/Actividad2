package Operaciones;

import java.util.Scanner;

public class SRMD {

	public static void main(String[] args) {
		
		double n1;
		double n2;
		double n3;
		Scanner c1 = new Scanner(System.in);
		Scanner c2 = new Scanner(System.in);
        
		System.out.println("Bienvenido, por favor introdusca la opercion que desea realizar \n A-->Suma \n B-->Resta \n C-->Multiplicacion \n D-->Division");
		Scanner in = new Scanner(System.in);
		String op = in.next();
		switch (op) {
			case "A":
				System.out.println("Introduce la primera cifra:");
				n1 = c1.nextDouble();
				System.out.println("Introduce la segunda cifra:");
				n2 = c2.nextDouble();
				n3 = n1 + n2;
				System.out.println("Resultado: "+n3);
				break;
			case "B":
				System.out.println("Introduce la primera cifra:");
				n1 = c1.nextDouble();
				System.out.println("Introduce la segunda cifra:");
				n2 = c2.nextDouble();
				n3 = n1 - n2;
				System.out.println("Resultado: "+n3);	
				break;
			case "C":
				System.out.println("Introduce la primera cifra:");
				n1 = c1.nextDouble();
				System.out.println("Introduce la segunda cifra:");
				n2 = c2.nextDouble();
				n3 = n1 * n2;
				System.out.println("Resultado: "+n3);
				break;
			case "D":
				System.out.println("Introduce la primera cifra:");
				n1 = c1.nextDouble();
				System.out.println("Introduce la segunda cifra:");
				n2 = c2.nextDouble();
				n3 = n1 / n2;
				System.out.println("Resultado: "+n3);
				break;
			default:
				System.out.println("Valor no valido");
				break;
		
		}
		
	}

}

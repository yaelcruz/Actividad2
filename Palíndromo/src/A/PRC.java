package A;

import java.util.Scanner;
public class PRC {
      
	public void cap(String g, String w) {
		int a;
		for (a = w.length(); a >= 0; a--){
			String temporal;
			if (a != 0){
				temporal =w.substring(a-1, a);
				g = g+temporal;
			}	
		}
		int Numero = Integer.parseInt(w); 
		if (w.equals(g)) {
			System.out.println("El numero "+w+" es polindromo"); 
		}else{   
			double resultado=Math.sqrt(Numero);
			double resultado2=Math.pow(Numero, 3);
			System.out.println("Raiz: "+resultado+ " Exponente cubico: "+resultado2);
		}
	}
	
	public static void main(String[] args) {
		
		int continuar = 1;
		while (continuar == 1) {
			String Valor = "";
			System.out.println("Ingrese valor:");
			Scanner in = new Scanner(System.in);
			String Valor2 = in.next();
			try {
				PRC proceso = new PRC();
				proceso.cap(Valor, Valor2);
			} catch(NumberFormatException ex){
				System.out.println("Error "+ex.getMessage());
			}
			System.out.println("¿Desea continuar?:\n si-->1 \n no-->0 ");
			continuar= in.nextInt();
		}
	  }
	}




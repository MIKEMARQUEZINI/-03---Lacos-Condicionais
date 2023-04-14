package JavaTech;

import java.util.Scanner;

public class execLD3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme seu nome Completo: ");
		nome = leia.next();
		
		System.out.println("\nInforme sua Idade: ");
		idade = leia.nextInt();	
		
		System.out.println("\nJá realizou doação alguma vez");
		boolean doador = leia.nextBoolean();
		
			
		if(idade>=18 && idade<=69) {
			if (idade>=60 && idade<=69 && doador) {
				System.out.println("\n"+nome+" não está apto para doar Sanguee");
			} else 
				System.out.println("\n"+nome+" está apto para doar Sangue");
			}
			else {
				System.out.println("\n"+nome+" não está apto para doar Sangue");
	}
	}
}

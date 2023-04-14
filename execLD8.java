package JavaTech;

import java.util.Scanner;

public class execLD8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int operacao;
		float saldo=1000,saque,att=0,depos;
		
		System.out.println("\n***Selecione a Operação Deseja");
		System.out.println("\n ========================= ");
		System.out.println("(1) || - Saldo     || ");
		System.out.println("(2) || - Saque     || ");
		System.out.println("(3) || - Depósito  || ");
		System.out.println(" ========================= ");
		
		System.out.println("\n Selecione uma operação: ");
		operacao = leia.nextInt();
		
		switch (operacao) {
		case 1:
			System.out.printf("\n O saldo da conta é || R$ %.2f"+saldo);
			break;
		case 2:
			System.out.println("\n Insira o valor para saque: ");
			saque = leia.nextFloat();	
						
			if (saldo<saque) {
				System.out.printf("\n Saldo Insuficiente!");
			}else {				
				att=saldo-saque; 
				System.out.printf("\n Saldo disponivel : R$ %.2f",att);
			}
			break;	
		case 3:
			System.out.println("\n Insira o valor para Deposito: ");
			depos = leia.nextFloat();	
			att=saldo+depos;
			System.out.printf("\n Saldo disponivel : R$ %.2f",att);
			break;	
		default:
			System.out.println("\nOperação Inválida!!");	
		
			}
		

	}

}

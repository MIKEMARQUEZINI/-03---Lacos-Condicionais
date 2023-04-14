package JavaTech;

import java.util.Scanner;

public class execLD6 {

	public static void main(String[] args) {
		String nome,funcao;
		int cargo;
		double salario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme seu nome Completo: ");
		nome = leia.nextLine();
		System.out.println("\nInforme seu Salario: ");
		salario = leia.nextFloat();
		
		System.out.println("\nCodigo ||- Cargo           || Reajuste");
		System.out.println("\n(1)    || - Gerente        || -  10%");
		System.out.println("(2)    || - Vendedor       || -   7%");
		System.out.println("(3)    || - Supervisor     || -   9%");
		System.out.println("(4)    || - Motorista      || -   6%");
		System.out.println("(5)    || - Estoquista     || -   5%");
		System.out.println("(6)    || - Técnico de TI  || -   8%");
		System.out.println("=====================================");
		
		System.out.println("\n Informe seu Cargo: ");
		cargo = leia.nextInt();	
		
		switch (cargo) {
		case 1: 
			funcao = "Gerente";
			salario = salario + (salario* 0.10);
			System.out.println("\n||"+nome+"|| Cargo : "+funcao+" Salario com o Reajuste R$ "+salario);
			break;
		case 2: 
			funcao = "Vendedor";
			salario = salario + (salario*0.07);
			System.out.println("\n||"+nome+"|| Cargo : "+funcao+" Salario com o Reajuste R$ "+salario);
			break;
		case 3: 
			funcao = "Supervisor";
			salario = salario + (salario*0.09 );
			System.out.println("\n||"+nome+"|| Cargo : "+funcao+" Salario com o Reajuste R$ "+salario);
			break;
		case 4: 
			funcao = "Motorista";
			salario = salario + (salario*0.06 );
			System.out.println("\n||"+nome+"|| Cargo : "+funcao+" Salario com o Reajuste R$ "+salario);
			break;
		case 5: 
			funcao = "Estoquista";
			salario = salario + (salario*0.065 );
			System.out.println("\n||"+nome+"|| Cargo : "+funcao+" Salario com o Reajuste R$ "+salario);
			break;
		case 6: 
			funcao = "Técnico de TI";
			salario = salario + (salario*0.068 );
			System.out.println("\n||"+nome+"|| Cargo : "+funcao+" Salario com o Reajuste R$ "+salario);
			break;	
		default:
			System.out.println("\nSelecione o item da lista!!");
			
		
		}
	}

}

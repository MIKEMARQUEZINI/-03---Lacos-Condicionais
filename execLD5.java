package JavaTech;

import java.util.Scanner;

public class execLD5 {

	public static void main(String[] args) {
		
		String produto;
		int codproduto, quantidade;
		double valortotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nSamdubão - Sensacional");
		System.out.println("\n(1) || - Cachorro Quente  || - R$ 10,00");
		System.out.println("\n(2) || - X-Salada         || - R$ 15,00");
		System.out.println("\n(3) || - X-Bacon          || - R$ 18,00");
		System.out.println("\n(4) || - Bauru            || - R$ 12,00");
		System.out.println("\n(5) || - Refrigerante     || - R$  8,00");
		System.out.println("\n(6) || - Suco de laranja  || - R$ 13,00");
		
		System.out.println("\nEscolha seu Produto: ");
		codproduto = leia.nextInt();
		System.out.println("\nEscolha a quantidade desse Produto: ");
		quantidade = leia.nextInt();
		
		
		switch (codproduto) {
		case 1: 
			System.out.println("\nEscolha a quantidade: ");
			produto = "Cachorro Quente";
			valortotal = quantidade*10;
			System.out.println("\nO Produto selecionado foi "+produto+" e o valor total a pagar é: R$ "+valortotal+"");
			break;
		case 2: 
			System.out.println("\nEscolha a quantidade: ");
			produto = "X-Salada";
			valortotal = quantidade*15;
			System.out.println("\nO Produto selecionado foi "+produto+" e o valor total a pagar é: R$ "+valortotal+"");
			break;
		case 3: 
			System.out.println("\nEscolha a quantidade: ");
			produto = "X-Bacon";
			valortotal = quantidade*18;
			System.out.println("\nO Produto selecionado foi "+produto+" e o valor total a pagar é: R$ "+valortotal+"");
			break;
		case 4: 
			System.out.println("\nEscolha a quantidade: ");
			produto = "Bauru";
			valortotal = quantidade*12;
			System.out.println("\nO Produto selecionado foi "+produto+" e o valor total a pagar é: R$ "+valortotal+"");
			break;
		case 5: 
			System.out.println("\nEscolha a quantidade: ");
			produto = "Refrigerante";
			valortotal = quantidade*8;
			System.out.println("\nO Produto selecionado foi "+produto+" e o valor total a pagar é: R$ "+valortotal+"");
			break;
		case 6: 
			System.out.println("\nEscolha a quantidade: ");
			produto = "Suco de Laranja";
			valortotal = quantidade*13;
			System.out.println("\nO Produto selecionado foi "+produto+" e o valor total a pagar é: R$ "+valortotal+"");
			break;
		default:
			System.out.println("\nSelecione o item da lista!!");
			
		
		
		}
		
		
		
		
		

	}

}

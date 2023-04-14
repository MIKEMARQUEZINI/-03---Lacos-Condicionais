package JavaTech;

import java.util.Scanner;

public class execLD {
	
public static void main(String[] args) {
		
		int a,b,c,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		a = leia.nextInt();		
		System.out.println("\nEntre com a segundo número: ");
		b = leia.nextInt();		
		System.out.println("\nEntre com a terceiro número: ");
		c = leia.nextInt();
		
		soma = a+b;
		
		if(soma>c) {
			System.out.println("\nA soma entre o 1o número ("+a+") e o 2o ("+b+") é maior que C ("+c+")");
		}else if (soma<c) {
			System.out.println("\nA soma entre o 1o número ("+a+") e o 2o ("+b+") é menor que C ("+c+")");
		}else {
			System.out.println("\nA soma entre o 1o número ("+a+") e o 2o ("+b+") é igual que C ("+c+")");
		}

	}

}

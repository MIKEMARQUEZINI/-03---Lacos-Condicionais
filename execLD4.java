package JavaTech;

import java.util.Scanner;

public class execLD4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String primeira,segunda,terceira;
		
		System.out.println("Entre com a primeira palvra:");
		primeira = leia.nextLine();
		System.out.println("Entre com a primeira palvra:");
		segunda = leia.nextLine();
		System.out.println("Entre com a primeira palvra:");
		terceira = leia.nextLine();
		
		if(primeira.equalsIgnoreCase("vertebrado")) {
			if(segunda.equalsIgnoreCase("ave")) {
				if(terceira.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nÉ uma Águia");
				}else {
					System.out.println("\nÉ uma Pomba");
				}
			}else {
				if(terceira.equalsIgnoreCase("onivoro")) {
					System.out.println("\nÉ um Ser Humano");
				}else {
					System.out.println("\nÉ uma Vaca");
				}
			}
		}else {
			if(segunda.equalsIgnoreCase("inseto")) {
				if(terceira.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma Pulga");
				}else {
					System.out.println("\nÉ uma Lagarta");
				}
			}else {
				if(terceira.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma Sanguessuga");
				}else {
					System.out.println("\nÉ uma Minhoca");
				}
			}
		}

	}

}

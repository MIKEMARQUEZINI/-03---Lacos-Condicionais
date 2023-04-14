package JavaTech;

import java.util.Scanner;

public class execLD7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float num1,num2,vt;
		int op;
		
		System.out.println("\nInsira o primeiro número :");
		num1 = leia.nextFloat();
		System.out.println("\nInsira o segundo número :");
		num2 = leia.nextFloat();
		
		
		System.out.println("\n***Calculadora - Simples");
		System.out.println("\n ========================= ");
		System.out.println("(1) || - Soma   	|| ");
		System.out.println("(2) || - Subtração      || ");
		System.out.println("(3) || - Multiplicação  || ");
		System.out.println("(4) || - Divisão        || ");
		System.out.println(" ========================= ");
		
		System.out.println("\n Selecione uma operação: ");
		op = leia.nextInt();
		
		switch (op) {
		case 1:
			vt = num1+num2;
			System.out.println("\n Número ("+num1+") (+) Número ("+num2+") = "+vt+"");
			break;
		case 2:
			vt = num1-num2;
			System.out.println("\n Número ("+num1+") (-) Número ("+num2+") = "+vt+"");
			break;
		case 3:
			vt = num1*num2;
			System.out.println("\n Número ("+num1+") (*) Número ("+num2+") = "+vt+"");
			break;
		case 4:
			vt = num1%num2;
			System.out.println("\n Número ("+num1+") (/) Número ("+num2+") = "+vt+"");
			break;	
		default:
			System.out.println("\nSelecione o item da lista!!");	
		
		}
		 
	}

}

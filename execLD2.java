package JavaTech;

import java.util.Scanner;

public class execLD2 {
	public static void main(String[] args) {
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		num = leia.nextInt();	
		
		if(num>0 && num%2==0) {
			System.out.println("\nO número ("+num+") é par e positivo");
		}else if (num<0 && num%2==0) {
			System.out.println("\nO número ("+num+") é par e negativo");
		}else if (num>0 && num%2==1) {
			System.out.println("\nO número ("+num+") é impar e positivo");
		}else {
			System.out.println("\nO número ("+num+") é impar e negativo");
		}
		
	}

}

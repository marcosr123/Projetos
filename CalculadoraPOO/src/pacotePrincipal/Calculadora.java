package pacotePrincipal;

import java.util.Scanner;

public class Calculadora {
	public void calculadora() {
		Scanner scan = new Scanner(System.in);
		Calculo operação = new Calculo();
		int a,b;
		String op;
		System.out.println("Digite o valor 1:");
		a = scan.nextInt();
		System.out.println("Digite o valor 2: ");
		b = scan.nextInt();
		System.out.println("Digite a operação desejada: ");
		op = scan.next();
		switch(op) {
		case "soma":
			System.out.println("O resultado é: "+operação.soma(a, b));
			break;
		case "subtração":
			System.out.println("O resultado é: "+operação.subtração(a, b));
			break;
		case "divisão":
			System.out.println("O resultado é: "+operação.divisão(a, b));
			break;
		case "multiplicação":
			System.out.println("O resultado é: "+operação.multiplicação(a, b));
			break;
		}
		scan.close();
		
	}

}

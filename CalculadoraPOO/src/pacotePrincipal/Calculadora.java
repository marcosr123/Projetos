package pacotePrincipal;

import java.util.Scanner;

public class Calculadora {
	public void calculadora() {
		Scanner scan = new Scanner(System.in);
		Calculo opera��o = new Calculo();
		int a,b;
		String op;
		System.out.println("Digite o valor 1:");
		a = scan.nextInt();
		System.out.println("Digite o valor 2: ");
		b = scan.nextInt();
		System.out.println("Digite a opera��o desejada: ");
		op = scan.next();
		switch(op) {
		case "soma":
			System.out.println("O resultado �: "+opera��o.soma(a, b));
			break;
		case "subtra��o":
			System.out.println("O resultado �: "+opera��o.subtra��o(a, b));
			break;
		case "divis�o":
			System.out.println("O resultado �: "+opera��o.divis�o(a, b));
			break;
		case "multiplica��o":
			System.out.println("O resultado �: "+opera��o.multiplica��o(a, b));
			break;
		}
		scan.close();
		
	}

}

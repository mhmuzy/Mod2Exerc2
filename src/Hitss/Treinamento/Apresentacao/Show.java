package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	
	public static void main(String[] args) {
		try {
			
		System.out.println("");
		System.out.println("        Hitss Treinamento");
		System.out.println("");
		int n1, n2, n3, n4, s;
		double m;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o 1� lado:");
		System.out.println("");
		n1 = teclado.nextInt();
		System.out.println("");
		System.out.println("Digite o 2� lado:");
		System.out.println("");
		n2 = teclado.nextInt();
		System.out.println("");
		System.out.println("Digite o 3� lado:");
		System.out.println("");
		n3 = teclado.nextInt();
		System.out.println("");
		System.out.println("Digite o 4� lado:");
		System.out.println("");
		n4 = teclado.nextInt();
		System.out.println("");
		m = (n1 + n2 + n3 + n4) / 4;
		s = n1 + n2 + n3 + n4;
		System.out.println("    Informa��o dos Dados");
		System.out.println("--------------------------------");
		System.out.println("Soma dos lados: " + s);
		System.out.println("M�dia da Soma dos lados: " + m);
		System.out.println("--------------------------------");
		} catch (Exception e) {
			System.out.println("Erro de Processamento: " + e.getMessage());
		}
	}
	
}

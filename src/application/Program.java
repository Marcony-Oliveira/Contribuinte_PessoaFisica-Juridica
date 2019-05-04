package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Pessoa_Fisica;
import entities.Pessoa_Juridica;

public class Program {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		List<Contribuinte> contribuinte = new ArrayList<Contribuinte>();

		System.out.println("Digite a qt de contribuintes:");
		int qt = read.nextInt();

		System.out.println("Entre com os dados:");
		for (int i = 1; i <= qt; i++) {
			System.out.println("(1)Pessoa física -- (2)Pessoa Jurídica");
			int esc = read.nextInt();
			System.out.print("Nome:");
			String nome = read.next();
			System.out.println("Renda Anual:");
			double renda_Anual = read.nextDouble();

			if (esc == 1) {
				System.out.println("Gastos anuais com saúde:");
				double gastos_Saude = read.nextDouble();
				contribuinte.add(new Pessoa_Fisica(nome, renda_Anual, gastos_Saude));
			} else {
				System.out.println("Número de funcionários:");
				int numero_Funcionarios = read.nextInt();
				contribuinte.add(new Pessoa_Juridica(nome, renda_Anual, numero_Funcionarios));
			}
		}
		
		for(Contribuinte x:contribuinte) {
			System.out.println(x);
		}

		System.out.println("====================================");
		System.out.println("IMPOSTOS TOTAIS DOS CONTRIBUINTES:");
		
		double soma = 0;
		for(Contribuinte x : contribuinte) {
			soma+=x.imposto();
			
		}
		System.out.println(soma);
		
		
		read.close();

	}
}

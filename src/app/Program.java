package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Contributor;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contributor> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers:");
		int amount = sc.nextInt();
		
		for (int i = 0; i < amount; i++) {
			System.out.print("Individual or company (i/c)?");
			char resposta = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();

			if (resposta == 'i') {
				// construir contribuinte individual
				System.out.println("Health expenditures: ");
				Double healthExpenses = sc.nextDouble();
				Individual indiv = new Individual(name, rendaAnual, healthExpenses);
				//addList
				list.add(indiv);
			} else {
				//Construir contribuinte Company
				System.out.println("Number of employees");
				int amountEmployees = sc.nextInt();
				Company comp = new Company(name, rendaAnual, amountEmployees);
				//addList
				list.add(comp);
			}
		}
		System.out.println("tax paid: ");
		Double sum = 0.0;
		for(Contributor contri : list) {
			System.out.println(contri.getNome() + ": $ "+   contri.calculatorTax());
			sum += contri.getRendaFinal();
		}
		
		System.out.println("Total taxes: $" + sum);
	}

}

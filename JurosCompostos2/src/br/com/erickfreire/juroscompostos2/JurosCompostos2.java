package br.com.erickfreire.juroscompostos2;

/**
 * Programa em Java que calcula juros compostos
 * @author Erick Freire
 * @version 1 - Criado em 19-04-2021 as 18:56
 */

public class JurosCompostos2 {
	public static void main(String[] args) {
		double total;
		double principal = 1000.00;
		double taxaDeJuros = 0.05;
		
		System.out.printf("%s%20s %n", "Ano", "Total de Deposito");
		
		for(int ano = 1; ano <= 6; ano++) {
			
			total = principal * Math.pow(1.0 + taxaDeJuros, ano);
			
			System.out.printf("%4d%,20.2f%n", ano, total);
			
			taxaDeJuros += 0.01;
		}
	}

}

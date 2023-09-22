package Carro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a marca do carro: ");
		String Marca = scan.nextLine();
		
		System.out.print("Digite o modelo do carro: ");
		String Modelo = scan.nextLine();
		
		System.out.print("Digite a velocidade atual do carro: ");
		int VeloAtual = scan.nextInt();
		
		System.out.print("Digite a velocidade máxima do carro: ");
		int VeloMax = scan.nextInt();
		
		Carro carro = new Carro(Marca, Modelo, VeloAtual, VeloMax);

		int qtd = 0;
		System.out.println("Digite a velocidade para acelerar o carro: ");
		qtd = scan.nextInt();
		carro.Acelerar(qtd);
		System.out.println("Velocidade atual: " + carro.VeloAtual);
		
		System.out.println("Digite a velocidade para frear o carro: ");
		qtd = scan.nextInt();
		carro.Frear(qtd);
		System.out.println("Velocidade atual: " + carro.VeloAtual);

		System.out.println("--------------------//-----------------------");
		System.out.println("Informações Gerais: ");
		System.out.print(carro.toString());
	}
}
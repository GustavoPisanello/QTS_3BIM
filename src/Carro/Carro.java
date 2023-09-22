package Carro;

public class Carro {
	public String Marca;
	public String Modelo;
	public int VeloAtual;
	public int VeloMax;
	
	public Carro() {}
	
	public Carro(String Marca, String Modelo, int VeloInicial, int VeloMax) {
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.VeloAtual = VeloInicial;
		this.VeloMax = VeloMax;
	}

	public boolean Acelerar(int qtd) {
		if (VeloAtual == VeloMax) {
			return false;
		}
		if (VeloAtual + qtd > VeloMax) {
			VeloAtual = VeloMax;

		}
		else {
			VeloAtual += qtd;

		}
		return true;
	}
	
	public boolean Frear(int qtd) {
		if (VeloAtual == 0) {
			return false;
		}
		if (VeloAtual - qtd < 0) {
			VeloAtual = 0;
			return true;
		}
		else {
			VeloAtual -= qtd;
			return true;
		}
	}
	
	public void Desligar() {
		VeloAtual = 0;
	}
	
	@Override
	public String toString() {
		return " Modelo: " + Modelo + ";\n Marca: " + Marca + ";\n Velocidade Atual: " + VeloAtual + ".";
	}
}

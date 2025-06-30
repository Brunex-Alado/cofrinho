package colecao;

import java.util.Objects;

public abstract class Moeda {
	protected double valor;
	protected String tipo;
	
	//Construtor da classe Moeda definindo os valores p/ os atributos :
	protected Moeda(double valor, String tipo) {
		this.valor = valor;
		this.tipo = tipo;
	}
	
	//Encapsulamento usando os métodos Getter e Setter:
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//Conversão de Valores:
	abstract double converter();
	
	public void info() {
		System.out.print("----------------------------------------------------");
		System.out.print("\n Moeda: " + tipo);
		System.out.print("\n Valor: " + getValor());
		System.out.print("\n ");
	}
	
	public static void menuMoeda() {
		System.out.println("Digite a moeda escolhida: ");
		System.out.print("1 - Dólar");
		System.out.print("\n2 - Euro");
		System.out.print("\n3 - Real\n");		
	}
	
	//Método sobrescrevendo outro da superclasse:
	public int hashCode() {
		return Objects.hash(tipo, valor);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Objects.equals(tipo, other.tipo)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(valor);
	}

}

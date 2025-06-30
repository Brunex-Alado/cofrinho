package colecao;

//Herança:
public class Dolar extends Moeda {
	
	//Acessar métodos e construtores:
	public Dolar(double valor, String tipo) {
		super(valor, tipo);
	}
	
	@Override
	double converter() {
		return getValor() * 5.76;
	}
	
	@Override
	public String toString() {
		return "Valor em Dolar [converter()=" + converter() + ", valor()" + getValor() + ", getClass()" + getClass() + ", hashCode()" + hashCode() + ", to String()" + super.toString() + "]";
	}
	
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!super.equals(obj))
			return false;
		if(getClass() != obj.getClass())
			return false;
		return true;
	}
}

package colecao;

//Herança:
public class Real extends Moeda {
	
	//Acessar métodos e construtores:
	public Real(double valor, String tipo) {
		super(valor, tipo);
	}
	
	@Override
	double converter() {
		return getValor();
	}
	
	@Override
	public String toString() {
		return "Valor em Real [converter()=" + converter() + ", valor()" + getValor() + ", getClass()" + getClass() + ", hashCode()" + hashCode() + ", to String()" + super.toString() + "]";
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

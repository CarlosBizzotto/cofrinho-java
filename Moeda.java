package projeto;

public abstract class Moeda {
	private double valor;
	
	public Moeda(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public abstract String info();
	
	public abstract double converter();
}

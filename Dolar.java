package projeto;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public String info() {
		return "Moeda: Dolar, " + "Valor: " + super.getValor();
	}
	
	@Override
	public double converter() {
		return super.getValor() * 0.21;
	}
}

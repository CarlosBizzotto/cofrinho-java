package projeto;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
	}

	@Override
	public String info() {
		return "Moeda: Real, " + "Valor: " + super.getValor();
	}
	
	@Override
	public double converter() {
		return super.getValor();
	}
}

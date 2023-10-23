package projeto;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public String info() {
		return "Moeda: Euro, " + "Valor: " + super.getValor();
	}
	
	@Override
	public double converter() {
		return super.getValor() * 0.19;
	}
}

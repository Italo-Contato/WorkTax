package entities;

public class Individual extends Contributor {
	private Double healthExpenses;

	public Individual() {
		super();
	}

	public Individual(String nome, Double rendaAnual, Double healthExpenses) {
		super(nome, rendaAnual);
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double calculatorTax() {
		if (rendaAnual < 20000.00) {
			rendaFinal = (rendaAnual * 15) / 100;
			return rendaFinal;
		} else {
			rendaAnual = (rendaAnual * 25 / 100);
			if (healthExpenses > 0) {

				rendaFinal = rendaAnual - (healthExpenses * 50) / 100;
				return rendaFinal;
			}
		}
		rendaFinal = rendaAnual;
		return rendaFinal;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

}

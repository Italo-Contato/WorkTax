package entities;

public class Company extends Contributor {
	private int employeesAmount;
	
	public Company() {
		super();
	}

	public Company(String nome, Double rendaAnual, int employeesAmount) {
		super(nome, rendaAnual);
		this.employeesAmount = employeesAmount;
	}

	@Override
	public Double calculatorTax() {
		if (employeesAmount <= 10) {
			rendaFinal = (rendaAnual * 16) / 100;
			return rendaFinal;
		} else {
			 rendaFinal = (rendaAnual * 14) / 100;
			 return rendaFinal;
		}

	}

	public int getEmployeesAmount() {
		return employeesAmount;
	}

	public void setEmployeesAmount(int employeesAmount) {
		this.employeesAmount = employeesAmount;
	}

}

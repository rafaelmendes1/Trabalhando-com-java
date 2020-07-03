package entities;

public class PersonC extends Person {
	
	private Double DeHealth;
	
	public PersonC(String name, Double anIncome, Double deHealth) {
		super(name, anIncome);
		DeHealth = deHealth;
	}

	public Double getDeHealth() {
		return DeHealth;
	}

	public void setDeHealth(Double DeHealth) {
		this.DeHealth = DeHealth;
	}

	@Override
	public Double tax() {
		if(getAnIncome() >= 20000) {
			return getAnIncome() * 25/100 - getDeHealth() * 0.5;
		}else {
			return getAnIncome() * 0.14 - getDeHealth() * 0.5;
		}
	}
	
}

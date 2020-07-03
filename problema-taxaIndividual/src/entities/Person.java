package entities;

public abstract class Person {
	private String name;
	private Double anIncome;
	
	public Person(String name, Double anIncome) {
		this.name = name;
		this.anIncome = anIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnIncome() {
		return anIncome;
	}

	public void setAnIncome(Double anIncome) {
		this.anIncome = anIncome;
	}
	
	public abstract Double tax();
	
}

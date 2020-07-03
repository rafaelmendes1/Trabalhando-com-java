package entities;

public class PersonL extends Person {

	private Integer employees;
	
	public PersonL(String name, Double anIncome, Integer employees) {
		super(name, anIncome);
		this.employees = employees;
	}


	public Integer getEmployees() {
		return employees;
	}


	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	
	@Override
	public Double tax() {
		if(employees > 10) {
			return getAnIncome() * 0.14;
		}else {
			return getAnIncome() * 0.16;
		}
	}

	
}

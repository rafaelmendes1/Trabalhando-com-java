package entities;

public class Medianotas {
	public String name;
	public double a, b,c;
	
	public double mediacalc() {
		return a + b + c;
	}
	
	public String result() {
		if(mediacalc() < 60) {
			double rest = 60 - mediacalc();
			return String.format("FAILED %n")
					+ ("MISSING ")
					+ rest
					+ (" POINTS");
		}else{
			return ("PASS");
		}
	}
	
	public String toString() {
		return name
				+ String.format("%n")
				+ ("FINAL GRADE = ")
				+ mediacalc()
				+ String.format("%n")
				+ result();
	}
	
}

package ifpb.testesw;

public class Raizes {

	private double x1;
	private double x2;
	
	
	public Raizes(double x1, double x2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
	}

	public Raizes() {
		
	}

	public double getX1() {
		return x1;
	}


	public void setX1(double x1) {
		this.x1 = x1;
	}


	public double getX2() {
		return x2;
	}


	public void setX2(double x2) {
		this.x2 = x2;
	}

	@Override
	public String toString() {
		return "x'= " + x1 + "  e  x''= " + x2;
	}
	
	
}
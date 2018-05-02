public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	private double x;
	private double y;
	
	LinearEquation(double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		if(IsSolvable()) {
		x = (e*d - b*f)/(a*d - b*c);
		y = (a*f - e*c)/(a*d - b*c);
		}
		else
			System.out.printf("the equation has no solution");
	}
	public boolean IsSolvable() {
		return a*d - b*c == 0 ? false : true;
	}
	
	public double GetX() {
		return x;
	}
	
	public double GetY() {
		return y;
	}
	public double GetA() {
		return a;
	}
	
	public double GetB() {
		return b;
	}
	public double GetC() {
		return c;
	}
	public double GetD() {
		return d;
	}
	public double GetE() {
		return e;
	}
	public double GetF() {
		return f;
	}
	
	public void GetData() {
		System.out.printf("(%fx) + (%fy) = %f\n", a, b, e);
		System.out.printf("(%fx) + (%fy) = %f\n", c, d, f);
		System.out.printf("x = %f\ny = %f\n",  x, y);
	}
}

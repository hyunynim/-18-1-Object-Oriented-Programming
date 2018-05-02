
public class TwoPoint {
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	
	TwoPoint(double x1, double y1, double x2, double y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public double GetA() {
		return (y1-y2);
	}
	
	public double GetB() {
		return (x2-x1);
	}
	
	public double GetC() {
		return -x1*(y2-y1) + y1*(x2-x1);
	}
}

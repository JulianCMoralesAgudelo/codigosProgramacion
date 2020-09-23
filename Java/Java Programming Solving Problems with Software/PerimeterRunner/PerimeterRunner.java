

public class PerimeterRunner {
	public double getPerimeter(shape s){
		// Start with totalPerim =0.
		double totalPerim = 0.0;
		// Start with prevPt = the last point.
		Point prevPt = s.getLastPoin();
		// For each point currPt in the shape.
		for(Point currPt:s.getPoints()){
			// Find distance from prevPt to currPt , name it currDist.
			double currDist = prevPt.distance(currPt);
			// Update totalPerim to be totalPerim + currPt.
			totalPerim = totalPerim + currDist
			// Update prevPt to be currPt.
			prevPt = currPt;	
		}
		// totalPerim is the answer
		return totalPerim;
	}

	public void testPerimeter(){
		FileResource fr = new FileResource();
		Shape s = new Shape(fr);
		double length = getPerimeter(s);
		System.out.println("Perimeter = " + length);
	}
	
	public static void main(String[] args){
		PerimeterRunner pr = new PerimeterRunner();
		pr.testPerimeter();
	}

}

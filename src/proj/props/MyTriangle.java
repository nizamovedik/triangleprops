package proj.props;

public class MyTriangle {

	public boolean isCorrectTriangle(int a, int b, int c) {
		// TODO Auto-generated method stub
		if ( a > 0 && b > 0 && c > 0 &&
				a + b > c && b + c > a && a + c > b)
			return true;
		return false;
	}
	
	public int trianglePerimeter (int a, int b, int c) {
		return a + b + c;
	}
	
	public double triangleSquare (int a, int b, int c) {
		int p = trianglePerimeter(a, b, c); 
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}

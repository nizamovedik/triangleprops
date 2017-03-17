package proj.props;

import java.text.DecimalFormat;

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
	
	public String triangleSquare (int a, int b, int c) {
		DecimalFormat df = new DecimalFormat("#.##");
		int p = trianglePerimeter(a, b, c); 
		return df.format( Math.sqrt(p * (p - a) * (p - b) * (p - c)) );
	}

	public boolean isRectTriangle(int a, int b, int c) {
		
		if ( Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || 
				Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) || 
				Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2))
			return true;
		return false;
	}

	public String isEquilateral(int a, int b, int c) {
		
		if ( a == b && b == c)
			return "Треугольник равносторонний";
		else if ( a == b || b == c || a == c)
			return "Треугольник равнобедренный";
		else
			return "Треугольник разносторонний";
	}

}

package proj.tests;

import junit.framework.Assert;
import proj.props.*;
import org.junit.Test;

public class TestMethods {
	
	@Test
	public void isCorrectTriangleTest() {
		
		MyTriangle testTriangleProps = new MyTriangle();
		
		boolean isTrue = testTriangleProps.isCorrectTriangle(3, 4, 6);
		if (!isTrue) Assert.fail();
		
	}
	
	@Test
	public void isRectTriangleTest() {
		
		MyTriangle testTriangleProps = new MyTriangle();
		
		boolean isTrue2 = testTriangleProps.isRectTriangle(3, 4, 5);
		if (!isTrue2) Assert.fail();
		
	}
	
	@Test
	public void isEquilateralTest() {
		
		MyTriangle testTriangleProps = new MyTriangle();
		
		String s = testTriangleProps.isEquilateral(6, 4, 6);
		Assert.assertEquals(s, "Треугольник равнобедренный");
		
	}
	
	@Test
	public void trianglePerimeterTest() {
		
		MyTriangle testTriangleProps = new MyTriangle();
		
		int perimeter = testTriangleProps.trianglePerimeter(6, 4, 6);
		Assert.assertEquals(perimeter, 16);
		
	}
	
	@Test
	public void triangleSquareTest() {
		
		MyTriangle testTriangleProps = new MyTriangle();
		
		String square = testTriangleProps.triangleSquare(7, 9, 12);
		Assert.assertEquals(square, "422,79");
		
	}

}

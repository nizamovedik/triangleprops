package proj.start;

import java.util.Scanner;

import proj.props.MyTriangle;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Введите целые числа");
		
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int	a = sc.nextInt();
			int	b = sc.nextInt();
			int	c = sc.nextInt();
			
			MyTriangle tr = new MyTriangle();
			
			if (tr.isCorrectTriangle(a, b, c)) {
				System.out.println("Треугольник со сторонами: " + a + ", " + b + ", " + c);
				
				int p = tr.trianglePerimeter(a, b, c);
				System.out.println("Периметр треугольника = " + p);
				
				String s = tr.triangleSquare(a, b, c);
				System.out.println("Площадь треугольника = " + s);
				
				if (tr.isRectTriangle(a, b, c) == true) 
					System.out.println("Треугольник прямоугольный");
				else 
					System.out.println("Треугольник не прямоугольный");
				
				System.out.println(tr.isEquilateral(a, b, c));
				
			}
				
			else
				System.out.println("Такого треугольника не существует");
		}
		catch (Exception e) {
			System.out.println("Вводить только целые числа");
		}

	}

}

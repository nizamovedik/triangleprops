package proj.start;

import java.util.Scanner;

import proj.props.MyTriangle;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Введите целые числа");
		
		try {
			Scanner sc = new Scanner(System.in);
			int	a = sc.nextInt();
			int	b = sc.nextInt();
			int	c = sc.nextInt();
			
			MyTriangle tr = new MyTriangle();
			if (tr.isCorrectTriangle(a, b, c))
				System.out.println("" + a + b + c);
			else
				System.out.println("Такого треугольника не существует");
		}
		catch (Exception e) {
			System.out.println("Вводить только целые числа");
		}

	}

}

package Session3;

import java.util.Scanner;

public class SquareRootCubeRooot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		double result_square=0,result_cube=0;
		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		result_square = Math.sqrt(num);
		System.out.println("Square root is" +result_square);
		
		result_cube = Math.cbrt(num);
		System.out.println("The cube root is" +result_cube);

	}

}

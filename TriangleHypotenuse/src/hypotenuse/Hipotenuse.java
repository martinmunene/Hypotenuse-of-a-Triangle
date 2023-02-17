package hypotenuse;

import java.util.Scanner;

public class Hipotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		double x;
		double y;
		double z;
		
		System.out.println("Enter the lenth of the height");
		x = scanner.nextDouble();
		
		System.out.println("Enter the lenth of the width");
		y = scanner.nextDouble();
		
		
		z = Math.sqrt((x * x) + (y * y));  
			System.out.println("The length of hypotenuse is:" + z + " cm");
			
			
			scanner.close();
		
	}

}

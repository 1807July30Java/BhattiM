import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Calculator {


	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		
		Int var1 = sc.nextInt("Whats the 1st #");
		Int var2 = sc.nextInt("Whats the 2nd #");

		System.out.println("What operation do you wanna do? ");
		String operator = sc.next();

		try {
			switch (operator) {
				case "+":
					result = add(var1, var2);
					break;
				case "-":
					result = subtract(var, var2);
					break;
				case "*":
					result = multiply(var, var2);
					break;
				case "/":
					result = divide(var, var2);
					break;	
				default:
					System.out.println("Invalid entry. Shame on you");
			}
			System.out.println("The result is: " + result);
		} catch (exception e) {
			System.out.println("Try Again.");
			e.printStackTrace();
		}
	}


	static String divide(String var1, String var2) {
		String one = Integer.toString(var1);
		String two = Integer.toString(var2);
		return one / two;
	}
	static String multiply(String var1, String var2) {
		String one = Integer.toString(var1);
		String two = Integer.toString(var2);
		return one * two;
	}
	static String add(String var1, String var2) {
		String one = Integer.toString(var1);
		String two = Integer.toString(var2);
		return one + two;
	}
	static String subtract(String var1, String var2) {
		String one = Integer.toString(var1);
		String two = Integer.toString(var2);
		return one - two;
	}


}



public class Driver {


}
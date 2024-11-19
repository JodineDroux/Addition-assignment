package mathprogram;

public class Calculator {

	public static void main(String[] args) {
		
		
	}
		static int result;
		static int number1;
		static int number2;

		
		public static String addNumbers() {
			String a = null;
			result = number1 + number2;
			a = (number1 + " + " + number2 + " = " + result);
			return a;
		}
		
		public static String subNumbers(){
			String s = null;
			result = number1 - number2;
			{s = (number1 + " - " + number2 + " = " + result);
			}
			return s; 
		}
		
		public static String multNumbers(){
			String m = null;
			result =  number1 * number2;
			{m = (number1 + " * " + number2 + " = " + result);
			}
			return m; 
		}
}



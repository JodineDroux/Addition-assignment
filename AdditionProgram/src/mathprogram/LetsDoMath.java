package mathprogram;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Integer.*;

public class LetsDoMath {
	
		private static int oper;
		private static String n1;
		private static String n2;
		public static void main(String[] args) {
						
			Scanner sc = new Scanner(System.in);
			
	        		out.print("Enter your first positive number: ");
					n1 = sc.next();
					Calculator.number1 = parseInt(n1);
					
					out.print("Enter your second postive number: ");
					n2 = sc.next();
					Calculator.number2 = Integer.parseInt(n2);
					
								
	 			     
	        System.out.print("Choose your operation" + '\n' + "1 for addition" + '\n' + "2 for subtraction" + '\n' + "3 for multiplaction" + '\n');
					oper = sc.nextInt();		
		
			sc.close();	
				
				if(oper == 1) {
					String add = Calculator.addNumbers();
					System.out.println(add);
				}
				else if(oper == 2) {
					String subt = Calculator.subNumbers();
					System.out.println(subt);
				}
				else if (oper == 3) {
					String mul = Calculator.multNumbers();
					System.out.println(mul);
				}
				}
		}
	 
				
							



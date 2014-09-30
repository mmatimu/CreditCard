package MainPackage;

import java.util.Scanner;

public class CheckDigit {
	
	public static void main(String[] args) {
		
		/* Prompt User to enter a 
		 * Credit Card Number.
		 */
		String LongInt;
		@SuppressWarnings("resource")
		Scanner User_Input = new Scanner(System.in);
		
		System.out.println("Enter Your Credit Card Number: ");
		LongInt = User_Input.nextLine();
			
	long Sum_1=0;
	int Sum_2=0;
	    
		/* Loop over LongInt String 
		 * check for validation. 
		 */
	  
	for (int x = LongInt.length()-2; x >= 0; x -= 2  ){
	    	int product = 2* Character.getNumericValue(LongInt.charAt(x));
		    	String Sum_Doubled = Integer.toString(product);
			    for (int i=0; i<Sum_Doubled.length(); i++  ){
		    	int get_second2 = Character.getNumericValue(Sum_Doubled.charAt(i));
		    	Sum_1 += get_second2;
			    }
		    }
	    for (int x = LongInt.length()-1;x >= 0;x -= 2){
	    	Sum_2 = Sum_2 + Character.getNumericValue(LongInt.charAt(x));
	    }
	    int total = (int) (Sum_1 + Sum_2);

	    if (total %10 == 0){
	    System.out.println(LongInt + " is valid");
	    }   	  
		
	else{
	    System.out.println(LongInt + " is not valid");
	}
	
  }

	public Object CheckDigit(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

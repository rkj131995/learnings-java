package com.solidprinciples;

public class OCP {
	
	class Calc{
		
		void calculate(int a, int b , String op)
		{
			switch(op)
			{
			case "+" : System.out.println(a + b );
				break;
			case "-" : System.out.println(a - b);
				break;
				
			}
			
		// new operation comes we need to modify above , but it should be 
			// closed for modification
		}
	}
	
	interface Calculator 
	{
		void calculate(int a, int b);
	}
	
	class AddOp implements Calculator
	{

		@Override
		public void calculate(int a, int b) {
			System.out.println(a + b );
			
		}
		
	}
	
	class SubOp implements Calculator
	{

		@Override
		public void calculate(int a, int b) {
			System.out.println(a - b );
			
		}
		
	}

}

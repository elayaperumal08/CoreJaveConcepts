package com.elaya.basics;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int a = 10, b = 20, c = 30, d = 50, x;
		int m = 0b1010101;
		
		
		System.out.println("m value is :" +m);
		
		int f = a>>3; 
		System.out.println("value of f : " +f);
		
		int g = a<<3;
		System.out.println("value of g : " +g);
		
		
		 x=(a==5)?20:30; 
		 {
		 System.out.println ("Variable X: "+x);
		
		 }
		 
		 
		 
		if (a<b) {
				
				System.out.println ("Condition A is true : " +"true");
			}			
		else { System.out.println ("Condition B is true : " +"true");
		}
		
		if ((a<b) && (c>d)) {
			
			System.out.println ("Both are true : " + "Java Jags");}
		else
				{System.out.println ("Any one true : " + "Verum Jags");
		}
		
		if ((a>b) || (d<c)) {
		
			System.out.println ("One or both Conditions are true : " + "Perumal" );}
		else
				{System.out.println ("both the Conditions are true : " + "Elaya");
				
						}
	}
}

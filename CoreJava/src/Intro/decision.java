package Intro;


public class decision {
	public static void main(String[] args) {
//		int a = -1;
//		
//		if(a>=5) {
//			System.out.println("Yes");
//		}`
//		else if(a >= 2) {
//			System.out.println("greater than 2 but no greater than 5");
//		}
//		else {
//			System.out.println("no");
//		}

//		nested if 

//		int marks = 50;
//		
//		if(marks >= 33) {
//			if(marks >= 90) {
//				System.out.println("Above 90");
//			}
//			else {
//				System.out.println("above 33 and below 90");
//			}
//			
//		}
//		else {
//			System.out.println("Fail");
//		}

//		ternary operator -> 
//		int n = 10;

//		if (n % 2 == 0) {
//			System.out.println("Even");
//		} else {
//			System.out.println("Odd");
//		}

		// variable = condition? true: false;

//		String Result = n % 2 == 0 ? "Even" : "Odd";
//		System.out.println(Result);
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		
		if(a>b && a>c) {
			System.out.println("A is greatest");
		}
		else if(b>a && b>c) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c is greatest");
		}
		
		String result = a>b && a>c? "A" : b>a && b>c? "B" : "C" ;
		System.out.println(result);
	}
}

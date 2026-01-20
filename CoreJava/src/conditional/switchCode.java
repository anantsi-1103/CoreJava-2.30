package conditional;

import java.util.Scanner;

public class switchCode {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

//		System.out.println("Enter your Color for Traffic Light");
//		String choice = s.next();
//
//		switch (choice) { /// green
//		case "red":
//			System.out.println("STOP");
//			break;
//
//		case "yellow":
//			System.out.println("HOLD");
//			break;
//
//		case "green":
//			System.out.println("GO");
//			break;
//
//		default:
//			System.out.println("Invalid Choice");
//			break;
//		}
		
		System.out.println("Enter your Number");
		int n = s.nextInt();
		
		switch(n) {
		case 1:{
			System.out.println("This is one");
			break;
		}
		
		case 2:{
			System.out.println("This is two");
			break;
		}
		
		case 3:{
			System.out.println("This is three");
			break;
		}
		
		case 4:{
			System.out.println("This is four");
			break;
		}
		
		case 5:{
			System.out.println("This is five");
			break;
		}
		
		default:{
			System.out.println("this is invalid");
			break;
		}
			
		
		}
		
	}
}

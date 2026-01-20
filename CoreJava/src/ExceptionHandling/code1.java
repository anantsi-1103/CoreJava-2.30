package ExceptionHandling;

public class code1 {
	public static void main(String[] args) {
//		Arithmetic -> n/0 -> 
		System.out.println("Start");
//		try {
//			int a = 10 / 5;
//			System.out.println(a);
//			
//			String name = null;
//			System.out.println(name.length());

//			int arr[] = { 1, 2, 3, 4 };
//			System.out.println(arr[100]);

//		} catch (Exception e) {
//			System.out.println(e);
//		} finally {
//			System.out.println("Always Executed");
//		}

		try {
			int arr[] = { 1, 2, 3, 5/0, 5 };
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index zada hai");
		}

		catch (ArithmeticException e) {
			System.out.println("Array Arithmetic");
		} catch (Exception e) {
			System.out.println("General Exception");
		}

		System.out.println("Rest of the Services ");
	}
}

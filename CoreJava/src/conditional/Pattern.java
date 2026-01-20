package conditional;

public class Pattern {

	public static void RightAngleTriangle(int n) {
		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void RightAngleTriangle_num(int n) {
		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void ZeroOnePattern(int n) {
		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}

	public static void FloydTriangle(int n) {
		int c = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}

	public static void FloydTriangle_letter(int n) {
		char c = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}

	public static void invertedTriangle(int n) {
		for (int i = 1; i <= n; i++) { // 1 2 3
			// space
			for (int j = 1; j <= n - i; j++) { // 2
				System.out.print(" " + " ");
			}

			// star
			for (int j = 1; j <= i; j++) { // 3
				System.out.print("*" + " ");
			}

			System.out.println(); // NEXT LINE
		}
	}

	public static void OppoTriangle(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*" + " ");

			}
			System.out.println();
		}
	}

	public static void Square(int n, int m) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print("*" + " ");
			}

			System.out.println();
		}
	}

	public static void SquareHollow(int n, int m) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == 1 || i == n || j == 1 || j == m) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}

	public static void Rohmbus(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}
	}

	public static void Rohmbus_hollow(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= n; j++) {
				// hollow - boundary
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();

		}
	}

	public static void Star(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void Diamond(int n) {
		// upper
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		// lower
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void butterfly(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		RightAngleTriangle(5);
		System.out.println("-----------");
		RightAngleTriangle_num(5);
		System.out.println("-----------");
		ZeroOnePattern(5);
		System.out.println("-----------");
		FloydTriangle(5);
		System.out.println("-----------");
		FloydTriangle_letter(5);
		System.out.println("-----------");
		invertedTriangle(5);
		System.out.println("-----------");
		OppoTriangle(5);
		System.out.println("-----------");
		Square(5, 5);
		System.out.println("-----------");
		SquareHollow(6, 10);
		System.out.println("-----------");
		Rohmbus(5);
		System.out.println("-----------");
		Rohmbus_hollow(5);
		System.out.println("-----------");
		Star(5);
		System.out.println("-----------");
		Diamond(5);
		System.out.println("-----------");
		butterfly(5);
	}

}

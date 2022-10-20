package sep_29;

public class mat_mul {
	static int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	static int b[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

	public mat_mul(int a[][], int b[][]) {
		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public mat_mul() {
		this(a, b);
	}

	public static void main(String args[]) {
		mat_mul ob = new mat_mul();

	}

}

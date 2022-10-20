package Oct_3;

import java.util.Arrays;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {

		int[] a = { 3, 4, 8 };
		int[] b = { 5, 8, 4 };
		int[] c = { 9, 4, 7 };
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					for (int k = 0; k < c.length; k++) {
						if (a[i] == c[k]) {
							System.out.println(c[k]);
						}
					}
				}
			}
		}

	}

}

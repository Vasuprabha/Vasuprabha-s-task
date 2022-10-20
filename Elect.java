package sep_27;

import java.util.Scanner;

public class Elect {

	class Inner_class {
		public void selection() {
			int unit;
			double bill = 0;
			Scanner s = new Scanner(System.in);
			unit = s.nextInt();
			if (unit < 100) {
				bill = 100 * 1.25;
			} else if (unit < 300) {
				bill = 100 * 1.25 + (unit - 100) * 2;
			} else if (unit < 400) {
				bill = 100 * 1.25 + 200 * 2 + (unit - 100) * 3;

			} else if (unit > 400) {
				bill = 100 * 1.25 + 200 * 2 + 300 * 3 + (unit - 100) * 4;

			}

		}
		public static void main(String[] args) {
			Elect e= new Elect();
			Elect.Inner_class in =e.new Inner_class();
			in.selection();
			}

	}
}

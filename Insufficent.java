package Oct_05;
import java.util.Scanner;

import Oct_05.BankAtm;
public class Insufficent extends Exception {
	public static void amount()throws Insufficent{
	int amount =50000;
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the amount");
	int amountwant = s1.nextInt();
	if ( amountwant>amount) {
		throw new Insufficent ();
	}
	else if (amountwant<=amount) {
		System.out.println("Collect your cash");
	}

	}
}

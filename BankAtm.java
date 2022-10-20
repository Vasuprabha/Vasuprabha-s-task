package Oct_05;

import Oct_05.Insufficent;

public class BankAtm extends Pin {
	public static void main(String[] args) throws BankAtm {
		BankAtm ss = new BankAtm();

		try {
			Pin.atm();

			try {
				Insufficent.amount();
			} catch (Exception ee) {
				System.out.println("Insufficent");
			}
			try {
				CashNotAvalible.cash();
			} catch (CashNotAvalible e) {
				System.out.println("No amount");
			}
			try {
				Denomination.denominationAtm();
			}
			catch ( Denomination e) {
				System.out.println("Money not avalible");
			}
	} catch (Pin e) {
			System.out.println("miss matched");
		}

	}
}

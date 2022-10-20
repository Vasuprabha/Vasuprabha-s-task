package Oct_05;

import java.util.Scanner;

public class CashNotAvalible extends Exception{
	
	static void cash()throws CashNotAvalible {
		
		int amountatm=10000;
		Scanner s2= new Scanner(System.in);
		int Useramount = s2.nextInt();
		if(Useramount > amountatm) {
			throw new CashNotAvalible();
		}
		else if (Useramount<=80000) {
			System.out.println("ok");			
		}
	}	
}

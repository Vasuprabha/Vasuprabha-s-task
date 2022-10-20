package oct_17;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument.Iterator;

public class ebanking_miniproject {
	static ArrayList al = new ArrayList();
	static Scanner s = new Scanner(System.in);
	static float bal = 0;
	static String user1_name = "XXXX", user2_name = "YYYY", user3_name = "ZZZZ";
	static int user1_ac_no = 122345, user2_ac_no = 122556, user3_ac_no = 896745;
	static float user1_bal = 25000,user2_bal = 30000, user3_bal = 40000;
	static int user1_pin = 1234,user2_pin = 1274,user3_pin = 1223;
	
	public static void main(String[] args) {
		
		System.out.println("****Welcome to ABC Bank of India****");
		System.out.println("Please enter which type of sevice you want!");
		System.out.println(
				"1.See the customer details \n2.View Account Details \n3.ATM transaction \n4.Send money via UPI \n5.Balance inquiry via UPI");
		while(true) {
		int option = s.nextInt();
		switch (option) {
		case 1:
			bank_db();
			break;
		case 2:
			login();
			break;
		case 3:
			atm_transaction();
			break;
		case 4:
			upi_send_money();
			break;
		case 5: 
			upi_balance_inquiry();
			break;
		default:
			System.out.println("Please enter the valid option");
		}
		}
	}

	public static void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ABC Bank Account Number: ");
		int ac = scanner.nextInt();
		if (ac == user1_ac_no) {
			user1_details();
		} else if (ac == user2_ac_no) {
			user2_details();
		} else if (ac == user3_ac_no) {
			user3_details();
		} else {
			System.out.println("Please enter the valid account number");
		}
	}

	public static void user1_details() {
		System.out.println("Welcome! " + user1_name);
		System.out.println("Your account number is :" + user1_ac_no);
		System.out.println("Your balance amount is :" + user1_bal);
		System.out.println("Thank You");
	}

	public static void user2_details() {
		System.out.println("Welcome! " + user2_name);
		System.out.println("Your account number is :" + user2_ac_no);
		System.out.println("Your balance amount is :" + user2_bal);
		System.out.println("Thank You");
	}

	public static void user3_details() {
		System.out.println("Welcome! " + user3_name);
		System.out.println("Your account number is :" + user3_ac_no);
		System.out.println("Your balance amount is :" + user3_bal);
		System.out.println("Thank You");
	}

	public static void atm_transaction() {
		System.out.println("********Insert your Card********");
		System.out.println(" Select type of transaction you want");
		System.out.println("1.Withdraw \n2.Fastcash");
		int option1 = s.nextInt();
		switch (option1) {
		case 1: {
			withdraw();
			break;
		}
		case 2: {
			fastcash();
			break;
		}
		}
		System.out.println("THANK YOU");
	}

	public static void withdraw() {
		System.out.println("Enter your Pin : ");
		Scanner s1 = new Scanner(System.in);
		int p = s1.nextInt();
		if (p == user1_pin) {
			System.out.println("Enter amount here: ");
			float amount = s1.nextFloat();
			if (amount <= user1_bal) {
				System.out.println("Collect your cash:" + amount);
				bal = user1_bal - amount;
				System.out.println("Your account balance is:" + bal);
			} else {
				System.out.println("Insufficent Amount");
				System.out.println("Your account balance is:" + user1_bal);
			}
		} else if (p == user2_pin) {
			System.out.println("Enter amount here: ");
			float amount = s1.nextFloat();
			if (amount <= user2_bal) {
				System.out.println("Collect your cash:" + amount);
				bal = user2_bal - amount;
				System.out.println("Your account balance is:" + bal);
			} else {
				System.out.println("Insufficent Amount");
				System.out.println("Your account balance is:" + user2_bal);
			}
		} else if (p == user3_pin) {
			System.out.println("Enter amount here: ");
			float amount = s1.nextFloat();
			if (amount <= user2_bal) {
				System.out.println("Collect your cash:" + amount);
				bal = user2_bal - amount;
				System.out.println("Your account balance is:" + bal);
			} else {
				System.out.println("Insufficent Amount");
				System.out.println("Your account balance is:" + user2_bal);
			}
		} else {
			System.out.println("Incorrect Pin");
		}
	}

	public static void fastcash() {
		System.out.println("Enter your Pin : ");
		Scanner s1 = new Scanner(System.in);
		int p = s1.nextInt();
		if (p == user1_pin) {
			System.out.println("Choose your amount \n1.$2000 \n2.$5000 \n3.$10000");
			Scanner s = new Scanner(System.in);
			int option = s.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Collect your amount : $2000");
				bal = user1_bal - 2000;
				System.out.println("Your account balance is:" + bal);
				break;
			}
			case 2: {
				System.out.println("Collect your amount : $5000");
				bal = user1_bal - 5000;
				System.out.println("Your account balance is:" + bal);
				break;
			}
			case 3: {
				System.out.println("Collect your amount : $10000");
				bal = user1_bal - 10000;
				System.out.println("Your account balance is:" + bal);
				break;
			}
			default:
				System.out.println("Please Choose vaild amount");
			}
		} else if (p == user2_pin) {
			System.out.println("Choose your amount \n1.$2000 \n2.$5000 \n3.$10000");
			Scanner s = new Scanner(System.in);
			int option = s.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Collect your amount : $2000");
				bal = user2_bal - 2000;
				System.out.println("Your account balance is:" + bal);
				break;
			}
			case 2: {
				System.out.println("Collect your amount : $5000");
				bal = user2_bal - 5000;
				System.out.println("Your account balance is:" + bal);
				break;
			}
			case 3: {
				System.out.println("Collect your amount : $10000");
				bal = user2_bal - 10000;
				System.out.println("Your account balance is:" + bal);
				break;
			}
			default:
				System.out.println("Please Choose vaild amount");
			}
		} else if (p == user3_pin) {
			System.out.println("Choose your amount \n1.$2000 \n2.$5000 \n3.$10000");
			Scanner s = new Scanner(System.in);
			int option = s.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Collect your amount : $2000");
				bal = user3_bal - 2000;
				System.out.println("Your account balance is:" + bal);
				break;
			}
			case 2: {
				System.out.println("Collect your amount : $5000");
				bal = user3_bal - 5000;
				System.out.println("Your account balance is:" + bal);
				break;
			}
			case 3: {
				System.out.println("Collect your amount : $10000");
				bal = user3_bal - 10000;
				System.out.println("Your account balance is:" + bal);
				break;
			}
			default:
				System.out.println("Please Choose vaild amount");
			}
		} else {
			System.out.println("Incorrect Pin");
		}
	}

	public static void upi_send_money() {
		System.out.println("Enter the account number you want to send money:");
		Scanner s1 = new Scanner(System.in);
		int send = s1.nextInt();
		System.out.println("Enter your UPI Pin : ");
		int p = s1.nextInt();
		if (p == user1_pin) {
			System.out.println("Enter amount here: ");
			float amount = s1.nextFloat();
			if (amount <= user1_bal) {
				System.out.println("Paid :Rs." + amount);
				bal = user1_bal - amount;
				user2_bal = user2_bal + amount;
				System.out.println("Your balance amount is : " + bal);
			} else {
				System.out.println("Insufficent Amount");
			}
		} else if (p == user2_pin) {
			System.out.println("Enter amount here: ");
			float amount = s1.nextFloat();
			if (amount <= user2_bal) {
				System.out.println("Paid :Rs." + amount);
				bal = user2_bal - amount;
				user1_bal = user1_bal + amount;
				System.out.println("Your balance amount is : " + bal);
			} else {
				System.out.println("Insufficent Amount");
			}
		} else if (p == user3_pin) {
			System.out.println("Enter amount here: ");
			float amount = s1.nextFloat();
			if (amount <= user3_bal) {
				System.out.println("Paid :Rs." + amount);
				bal = user3_bal - amount;
				user3_bal = user3_bal + amount;
				System.out.println("Your balance amount is : " + bal);
			} else {
				System.out.println("Insufficent Amount");
			}
		} else {
			System.out.println("Incorrect Pin");
		}
	}

	public static void upi_balance_inquiry() {
		System.out.println("Enter your Pin : ");
		Scanner s1 = new Scanner(System.in);
		int p = s1.nextInt();
		if (p == user1_pin) {
			System.out.println("Balance is : " + user1_bal);
		} else if (p == user2_pin) {
			System.out.println("Balance is : " + user2_bal);
		} else if (p == user3_pin) {
			System.out.println("Balance is : " + user3_bal);
		} else {
			System.out.println("Incorrect Pin");
		}
	}

	public static void bank_db() {
		al.add("Account_holder_name :" + "  " + user1_name + "  " + "Account_no :" + user1_ac_no + "  "
				+ "Branch : Chennai");
		al.add("Account_holder_name :" + "  " + user2_name + "  " + "Account_no :" + user2_ac_no + "  "
				+ "Branch : Chennai");
		al.add("Account_holder_name :" + "  " + user3_name + "  " + "Account_no :" + user3_ac_no + "  "
				+ "Branch : Chennai");
		java.util.Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}// class

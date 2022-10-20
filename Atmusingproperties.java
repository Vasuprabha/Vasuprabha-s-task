package Oct_19;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Atmusingproperties {
	static int bal;
	static int d;
	static int amount;
	static int pin;
	static Scanner s=new Scanner(System.in);
	static int fg;
	static Properties p=new Properties();
	static FileReader f;
	static int pass;
	public static void main(String[] args) throws IOException {
	f=new FileReader("C:\\Users\\Admin\\Downloads\\dbase.properties");

	p.load(f);
	System.out.println("*********WELCOME TO ATM**********");
	System.out.println("*********************************");
	System.out.println("Insert Your Card");
	d=s.nextInt();
	bal=Integer.parseInt(p.getProperty(String.valueOf(d)));
	System.out.println("Processing..............");
	    System.out.println(" ");
	    System.out.println("Enter the pin number");
	    pin=s.nextInt();
	    try {
	    pin=Integer.parseInt(p.getProperty(String.valueOf(pin)));
	} catch (Exception e) {
	}
	   
	    System.out.println("Validating............");
	    menu();  
	  
	}
	  
	    public static void menu() throws IOException {
	    if (pin==d) {
	System.out.println("1.fast cash \n2.Withdraw \n3.Balance Enquiry");
	pass=s.nextInt();
	switch (pass) {
	case 1:
	    fastcash();
	break;
	           
	case 2:
	    withdraw();
	break;
	case 3:
	    Balance();
	break;
	default:
	break;

	}


	}
	    else if (d!=pin) {
	System.out.println("Wrong pin");
	} else {

	}
	}
	public static void Balance() {
	    
	     System.out.println("Your Balance is:"+bal);

	}
	public static void withdraw() throws IOException {
	System.out.println("enter your amount");
	amount=s.nextInt();
	bal=bal-amount;
	System.out.println("Take Your cash: "+amount);
	System.out.println("Your balance is "+bal);
	    p.setProperty(String.valueOf(d), String.valueOf(bal));
	    p.store(new FileWriter("C:\\Users\\User\\Documents\\dbase.properties"), "");
	}
	public static void fastcash() {
	   
	System.out.println("1.1000 \n2.2000 \n3.5000 \n4.10000");
	System.out.println("Enter your choice....");
	d=s.nextInt();
	if (d==1) {
	bal=bal-1000;
	System.out.println("take your amount :"+1000);
	} else if(d==2){
	             bal=bal-2000;
	             System.out.println("take your amount :"+2000);
	}else if(d==3) {
	bal=bal-5000;
	System.out.println("take your amount :"+5000);
	}
	else if(d==4){
	bal=bal-10000;
	System.out.println("take your amount :"+10000);
	}
	else {
	System.out.println("Invalid choice...");
	}

	}

	}



package Oct_10;
import java.util.Scanner;

public class synchro extends Thread  {


	
	
	static String sc, sc1, sc2, sc3;
	static synchro v;
	static synchro v1;
	//static String a[];
	synchronized static public void purchase() {
	System.out.println(Thread.currentThread().getName());
	}

	public void run() {
	purchase();
	}

	public static void main(String[] args) {
	String ar[] = { "tea", "coffee", "dairy", "milk" };
	for (int i = 0; i < ar.length; i++) {
	System.out.println(ar[i]);
	}
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Product : ");
	sc = s.next();
	sc1 = s.next();
	sc2 = s.next();
	sc3 = s.next();
	     // String  a[]= {sc,sc1,sc2,sc3};
	synchro v = new synchro();
	synchro v1 = new synchro();
	synchro v2 = new synchro();
	synchro v3 = new synchro();
	v.setName(sc);

	v1.setName(sc1);
	v2.setName(sc2);
	     v3.setName(sc3);

	v.start();

	v1.start();
	v2.start();
	v3.start();

	}
	} 
	


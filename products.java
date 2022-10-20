package Oct_10;

import java.util.Scanner;

public class products {
	
	public static void main(String[]args)
	{
		String diary_pro[]= {"Milk","Curd","Butter"};
		for (int i = 0; i <diary_pro.length; i++) {
			System.out.println( diary_pro[i]);
			}
		System.out.println("\n");
		String Previligues[]= {"Tea","Coffee","Black-coffee"};
		for (int i = 0; i <Previligues.length; i++) {
			System.out.println(Previligues[i]);
			}
		System.out.println("\n");
		String Sauce[]= {"Soya-sauce","chilly-sauce","tomato-sauce"};
		for (int i = 0; i <Sauce.length; i++) {
			System.out.println(Sauce[i]);
			}
		System.out.println("\n");
		System.out.println("Enter your product:");
		Scanner s = new Scanner(System.in);
	String	sc = s.next();
	String	sc1 = s.next();
	String	sc2 = s.next();
	String	sc3 = s.next();
	String all[]= {sc,sc1,sc2,sc3};
	for (int i = 0; i < all.length-1; i++) 
	{
		if (all[i]== diary_pro[i] || all[i]==Previligues[i] || all[i]== Sauce[i])
		{
			System.out.println(all[i]);
			
		}else
		{
			System.out.println("no");
		}
	}	
	}

}

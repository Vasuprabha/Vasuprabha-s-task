package Oct_06;

 class addition extends Thread {
	@Override
	public void run() {
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("Addition value is: "+c);		
	}	
}
class subtraction extends Thread {
	@Override
	public void run() {
		int a=10;
		int b=20;
		int c= a-b;
		System.out.println("subtraction value is: "+c);		
	}	
}

class multiplication extends Thread {
	@Override
	public void run() {
		int a=10;
		int b=20;
		int c= a*b;
		System.out.println("multiplication value is: "+c);
		
	}	
}

 class division extends Thread {
	@Override
	public void run() {
		int a=10;
		int b=20;
		int c= a/b;
		System.out.println("division value is: "+c);		
	}	
}


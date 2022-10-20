package Oct_06;
import Oct_06.addition;
import Oct_06.subtraction;
import Oct_06.multiplication;
import Oct_06.division;

public class thread_example {

	public static void main(String[] args) {

		addition a = new addition();
		subtraction s = new subtraction();
		multiplication m = new multiplication();
		division d = new division();

		a.setPriority(2);
		d.setPriority(6);
		s.setPriority(3);
		m.setPriority(7);
     
		System.out.println("get priority of addition:" + m.getPriority() + "\n" + "get priority of subtraction:"
				+ a.getPriority());
		System.out.println("get priority of multiplication:" + s.getPriority() + "\n" + "get priority of division:"
				+ d.getPriority());
		
		m.start();
		a.start();
		s.start();
		d.start();
	}
}

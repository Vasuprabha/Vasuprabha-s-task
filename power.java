package Oct_05;

public class power {

	public static void main(String[] args) {
		String s = "123";
		int sum = 0;
		int v = Integer.parseInt(s);

		for (int i = 3; i > 0; i--) {

			int a = v % 10;
			int c = (int) Math.pow(a, i);
			sum = sum + c;
			v = v / 10;
			System.out.println("before= " + sum);
		}
		int d = 0;
		while (String.valueOf(sum).length() > 1) {

			while (sum > 0) {
				d =d+ sum % 10;
				sum=sum/ 10;
			}
		}
		System.out.println("Remaining numbers = " + d);
	}

}

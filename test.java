package sep_29;

public class test extends leap_year {
	void find_leap()
	{
		for(int i=2000;i<=2022;i++)
		{
			if(i%4==0)
			{
				System.out.println(i + "Leap year");
			}
			else
			{
				System.out.println(i + "Not a Leap year");
			}
		}
	}

	public static void main(String[] args) {

		test obj1=new test();
	
		obj1.find_leap();
	}

}

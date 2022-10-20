package Sep_15;

public class square {

	public static void main(String[] args) {
		int n=5,k=n-1;
	    for(int i=0;i<n;i++)
	    { 
	     for(int j=0;j<n;j++)
	     {
	    	if(i== 0||j==0 || i==k || j==k)
	    	{ System.out.print("* " );}
	    	else
	    		{System.out.print(" ");}
	}
	     System.out.println();
}
}
}
package Oct_12;

import java.io.FileOutputStream;

public class outputstream {

	public static void main(String[] args) {
       byte[] n=new byte[100];
       try {
    	   FileOutputStream op=new FileOutputStream("C:\\Users\\Admin\\Downloads\\sample.txt");
    	  
    	   op.write(78);
    	   op.close();
    	   System.out.println(" Sample program for FILE-OUTPUT-STREAM");
       }catch(Exception e)
       {
    	 System.out.println(e);  
       }
	}

}

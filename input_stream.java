package Oct_11;

import java.io.FileInputStream;

public class input_stream {
	
	public static void main(String[] args) {
		 // byte[]a1=new byte[100];
      try {
    	
          FileInputStream in=new FileInputStream("C:\\Users\\Admin\\Downloads\\PRABHA.txt");
          
          System.out.println("Bytes in a given file is: "+in.available());
          in.read();
          System.out.println("Contents in a given text file is: ");
      
		String s=new String();
        //System.out.println(s);
        int b=0;
        while (((b=in.read())!=-1)) {
      	  System.out.println((char) b);
		}
          in.close();

      }catch(Exception e)
      {
    	System.out.println(e);  
      }

	}

}

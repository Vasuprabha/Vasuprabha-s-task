package sep_30;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class str_occurance {

	static void Duplicates(char s1[],int len) {
		int index=0;
		//int j;
		for (int i = 0; i < len; i++) {
			
			for (int j = 0; j < i; j++) {
				if (s1[i]==s1[j]) {
					break;
				} 
				
			}
		//	if (j==i) {
				s1	[index++]=s1[i];
					
					}
			System.out.println(String.valueOf(Arrays.copyOf(s1, len)));
		}

	//}
	
	public static void main(String[] args) {
		
		String s= "abcbcdsscdfr";
		char[] s1= s.toCharArray();
		
		int len = s1.length;
		
		Duplicates(s1,len);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

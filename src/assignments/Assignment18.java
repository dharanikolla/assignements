package assignments;

import java.io.IOException;
import java.io.StringReader;

public class Assignment18 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//String pal = "A man, a plan, a canal: Panama";
		String pal ="race a car";
		pal = pal.replace(" ", "");
		pal = pal.replaceAll("[^0-9a-zA-Z]","");
		pal = pal.toLowerCase();
		int len = pal.length();
		StringReader reader = new StringReader(pal);
		String forward = "";
		for(int i = 0;i<len;i++)
		{
			int red = reader.read();
			//System.out.println((char)(red));	
			forward += (char) red;
		}   
		System.out.println(forward);
		reader.close();
		
		String backward = "";
		char[] buffer = pal.toCharArray();
	    for(int d = len-1;d>=0;d--)
		{
	    	backward += buffer[d];
		}	
	    System.out.println(backward);
	    
	    if (forward.equals(backward))
	    {
	    	System.out.println("Given string is palindrome");
	    }
		else
	   {
		System.out.println("Given string is not palindrome");
	   }
}
}
	    



	
import java.io.*;
public class StringProgram {
	public static void main(String args[]) {
	String str = "Java Program";
	int num = 50;
	String s1=String.valueOf(num);
	System.out.println(String.format("%-15s",str) +num);
	if(s1.length()==2) {
		System.out.print(String.format("%-15s",str) +String.format("%03d",num));
	}
		String str1 = String.format("%03d", num);
	}
	  
}


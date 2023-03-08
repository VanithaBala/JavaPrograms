import java.io.*;
import java.util.*;
public class OddEven {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        int output;
	        output = N % 2 ;
	        if(output==0 && (N==2 || N<=5))
	        System.out.println("Not Weird");
	        else if (output==0 && (N==6 || N<=20))
	        System.out.println("Weird and less than 20");
	        else if(output==0 && N > 20)
	        System.out.println("Not Weird and greater than 20");
	        else
	        System.out.println("Weird");
	        

	        scanner.close();
	    }

}

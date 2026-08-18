package arrayQuestion;

import java.util.Scanner;
import java.util.*;
public class Perfect_number {
	public static void main(String args[]) {
//		   Scanner sc = new Scanner(System.in);
//	       int num = sc.nextInt();
		   int num =6;
	       int sum =0;
	       for(int i =1; i< num; i++) {
	    	   if(num%i == 0) {
	    		   sum+=i;
	    	   }
	    	 
	       }
	       System.out.println(sum);
	       if(num == sum) {
	    		System.out.print("True");
	    		
	    	} else {
	    		System.out.print("false");
	    	}
	       
}
}
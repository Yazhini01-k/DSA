package arrayQuestion;
import java.util.*;
public class strongNumber {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int sum =0;
       
        
       while(num!=0){
           int fact =1;
           int digit = num%10;
           for(int j =1; j<=digit;j++){
           fact =fact*j;
       }
       num= num/10;
       sum +=fact;
       System.out.println("Sum"+ sum);
       
}
}
}
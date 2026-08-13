package arrayQuestion;
import java.util.Arrays;

public class moveZeroToEnd {
	public static void main(String[] args) {
		int arr[] = {5,0,1,4,0,7};
		int arr1[] = new int[arr.length];
		int j =0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arr1[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr1));
		
			
	}
}

package arrayQuestion;

public class containsDuplicate {
	public static void main(String arg[]) {
		int nums[] = {1,2,3};
		 boolean duplicate = false;
	        for(int i =0; i<nums.length; i++){
	            for(int  j =i+1; j<nums.length;j++){
	                if(nums[i] == nums[j]){
	                    duplicate = true;
	                }

	            }
	            if(duplicate == false ) {
		        	System.out.println(nums[i]);	      
		        	}
	           
	        }
	       
	        
	}

}

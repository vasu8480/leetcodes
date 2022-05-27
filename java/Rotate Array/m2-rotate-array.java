import java.io.*;
import java.util.*;
class m2-rotate-array {
    public static void main(String args[])
    {
    	int[] nums={1,2,3,4,5,6,7};
    	int k=3; 
    	if(k > nums.length)
    		k=k%nums.length;
    		int[] result = new int[nums.length];
    		for(int i=0; i < k; i++){
    		result[i] = nums[nums.length-k+i];
    		}
    		int j=0;
    		for(int i=k; i<nums.length; i++){
    		result[i] = nums[j];
    		j++;
    		}
    		System.arraycopy( result, 0, nums, 0, nums.length );
    		List <Integer> values = new ArrayList<>();         
		    for(int q :result)
	   		{
			    	//System.out.println(i);
			    	values.add(q);
			}
	    System.out.println(values);
}
    
}

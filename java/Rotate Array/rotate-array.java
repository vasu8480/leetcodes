import java.io.*;
import java.util.*;
class rotate-array {
    public static void main(String args[])
    {	
	    int[] arr={1,2,3,4,5,6,7};int order=3;
	    order = order % arr.length;
	    if (arr == null || order < 0)
	     {
	    	throw new IllegalArgumentException("Illegal argument!");
	     }
	    //length of first part
	    int a = arr.length - order;
	    reverse(arr, 0, a-1);
	    reverse(arr, a, arr.length-1);
	    reverse(arr, 0, arr.length-1);
	    List <Integer> values = new ArrayList<>();         
	      
	    for(int i :arr)
   		{
		    	//System.out.println(i);
		    	values.add(i);
		}
	    System.out.println(values);
    }
    public static void reverse(int[] arr, int left, int right){
    if(arr == null || arr.length == 1)
    return;
    while(left < right){
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    left++;
    right--;
   }
}
}

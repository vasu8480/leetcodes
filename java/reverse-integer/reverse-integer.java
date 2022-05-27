import java.util.*;


class rough {
	   public static void main(String[] args)
{			int x=-2147483412;
	    long rev = 0;
	    
	    while(x != 0)
	        {
	            rev = rev*10 + x%10;
	            x = x/10;
	        } 
	        if(rev > Integer.MAX_VALUE || rev< Integer.MIN_VALUE) System.out.println(0);
	        else System.out.println((int)rev);
	}
}

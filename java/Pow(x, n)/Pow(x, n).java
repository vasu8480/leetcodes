import java.util.*;
import java.io.*;
import java.util.*;
class Pow(x, n){
	public static double myPow(double x, int n) {
        if(n == 0) 
            return 1;
        else if(n == 1)  
            return x;
        else if(n%2 == 0) 
            return myPow(x*x, n/2);
        else if(n%2 == 1)
            return x * myPow(x, n-1);
       else
            return 1/myPow(x, -n);
    }
	public static  void main(String[] args) {
		{
			
			System.out.println(myPow(2,-2));
		}
	}
}

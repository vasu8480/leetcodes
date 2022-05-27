import java.util.*;

class len_last {
  public static void main(String args[]) {
	  
	  String s =  "   fly me   to   the moon  ";
	  s =s.trim();
	  if(s.length()==1)
	  {
		  System.out.print(s.length());
	  }
	  int len=0;
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  if(s.charAt(i)==' ')
		  {
			  System.out.print(len);
			  break;
		  }
		  else if(i==0)
		  {
			  System.out.print(len+1);;
			  break;
		  }
		  else
		  len++;
	  }
	  }
  }


  

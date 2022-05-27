import java.util.*;


class Srting_matches {
	  public static void main(String[] args)
	  {
        String str = "PPALLP";
        boolean arrOfStr1= !str.matches(".*LLL.*|.*A.*A.*");
        System.out.println(arrOfStr1);
     
	  }
}

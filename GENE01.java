import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		char c1=in.next().charAt(0);
		char c2=in.next().charAt(0);
		if(c1 == 'R' || c2 == 'R'){
		    System.out.println("R");
		}else if(c1 == 'B' || c2 == 'B'){
		    System.out.println("B");
		}else{
		    System.out.println("G");
		}
	}
}

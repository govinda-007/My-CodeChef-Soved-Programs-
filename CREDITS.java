import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t;
		t= in.nextInt();
		while(t-- > 0){
		    int n=in.nextInt();
		    if(n>65){
		        System.out.println("Overload");
		    }else if(n<35){
		        System.out.println("Underload");
		    }else{
		        System.out.println("Normal");
		    }
		}
	}
}

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
		    int a=in.nextInt();
		    int b=in.nextInt();
		    if(a==0){
		        System.out.println("Liquid");
		    }else if(b==0){
		        System.out.println("Solid");
		    }else{
		        System.out.println("Solution");
		    }
		}
	}
}

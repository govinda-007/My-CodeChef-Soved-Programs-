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
		    //n/a * x
		    //n/b * y
		    Double n=in.nextDouble();
		    Double x=in.nextDouble();
		    Double y=in.nextDouble();
		    Double a=in.nextDouble();
		    Double b=in.nextDouble();
		    if((n/a) * x < (n/b) * y ){
		        System.out.println("PETROL");
		    }else if((n/a) * x == (n/b) * y ){
		        System.out.println("ANY");
		    }else{
		        System.out.println("DIESEL");
		    }
		}
	}
}

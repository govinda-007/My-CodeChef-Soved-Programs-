import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int area=a*b;
		int peri=2*(a+b);
		if(area>peri){
		    System.out.println("Area");
		    System.out.println(area);
		}else if(peri>area){
		    System.out.println("Peri");
		    System.out.println(peri);
		}else{
		    System.out.println("Eq");
		    System.out.println(Math.max(area,peri));
		}
	}
}

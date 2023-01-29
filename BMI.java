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
		    int h=in.nextInt();
		    int m=in.nextInt();
		    double divide=h/Math.pow(m,2);
		    if(divide<=18){
		        System.out.println(1);
		    }else if(divide>18 && divide<=24){
		        System.out.println(2);
		    }else if(divide>24 && divide<=29){
		        System.out.println(3);
		    }else{
		        System.out.println(4);
		    }
		}
	}
}

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
		    double salary=in.nextInt();
		    double ans=0.00;
		    if(salary<1500){
		        ans=salary*2;
		    }else{
		        ans= salary + (( salary * 98) / 100) + 500;
		    }
		    System.out.println(ans);
		}
	}
}

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
		    int c=in.nextInt();
		    int sum=a+b+c;
		    if(sum>=100 && (a>=10 && b>=10 && c>=10)){
		        System.out.println("PASS");
		    }else{
		        System.out.println("FAIL");
		    }
		}
	}
}

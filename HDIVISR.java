import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int i=10;i>0;i--){
		    if(n%i == 0){
		        System.out.println(i);
		        break;
		    }
		}
	}
}

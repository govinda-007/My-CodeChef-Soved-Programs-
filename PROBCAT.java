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
		    if(n>=1 && n<100){
		        System.out.println("Easy");
		    }else if(n>=100 && n<200){
		        System.out.println("Medium");
		    }else{
		        System.out.println("Hard");
		    }
		}
	}
}

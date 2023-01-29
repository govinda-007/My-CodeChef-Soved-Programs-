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
		    int min=Math.min(a,b);
		    int max=Math.max(a,b);
		    int flag=0;
		    while(min<=max){
		        if(min==max){
		            flag=1;
		            break;
		        }
		        min*=2;
		    }
		    if(flag==0){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		}
	}
}

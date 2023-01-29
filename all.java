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
		    int add=a+b;
		    if(add<3){
		        System.out.println(1);
		    }else if(add>=3 && add<=10){
		        System.out.println(2);
		    }else if(add>10 && add<=60){
		        System.out.println(3);
		    }else {
		        System.out.println(4);
		    }
		}
	}
}

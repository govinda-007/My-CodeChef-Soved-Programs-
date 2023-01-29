import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int loop=0;
		while(loop==0){
		    int n=in.nextInt();
		    if(n==0) break;
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=in.nextInt();
		    }
		    int inverse[] = new int[n];
		    for(int i=0;i<n;i++){
		        inverse[arr[i]-1]=i+1;
		    }
		    int flag=0;
		    for(int i=0;i<n;i++){
		        if(arr[i] != inverse[i]){
		            flag=1;
		        }
		    }
		    if(flag==0){
		        System.out.println("ambiguous");
		    }else{
		        System.out.println("not ambiguous");
		    }
		}
	}
}

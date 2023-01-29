import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		char t;
		t= in.next().charAt(0);
		if(t=='A' || t=='E' || t=='I' || t=='O' || t=='U'){
		    System.out.println("Vowel");
		}else{
		    System.out.println("Consonant");
		}
	}
}

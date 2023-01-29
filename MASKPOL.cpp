#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t, i;
	cin>>t;
	for(i=1; i<=t; i++)
	{
	    int n, a, in;
	    cin>>n>>a;
	    in=n-a;
	    if(in<a)
	        {
	            cout<<in;
	            cout<<"\n";
	        }
	   else{
	            cout<<a;
	            cout<<"\n";
	        }
	}
	return 0;
}

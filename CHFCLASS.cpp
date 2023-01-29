#include <iostream>
using namespace std;

int main() {
	int t,n;
	cin>>t;
	while(t--){
	    int c=0;
	    cin>>n;
	    c=n/7;
	    if(n%7 >=6){
	        c++;
	    }
	   printf("%d\n",c);
	}
	return 0;
}

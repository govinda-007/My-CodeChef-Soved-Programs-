#include <iostream>
#include <cstdlib>

using namespace std;
#define ll long long int

int main() {
	ll t;
	cin>>t;
	while(t--){
	    ll A,B,C,n,x;
	    cin >>n>>x;
	    if(x>n*3){
	        cout<<"NO"<<endl;
	    }else{
	        if(x%3 == 0){
	            A=x/3;
	        }else{
	            A=(x/3)+1;
	        }
	        B=(A*3)-x;
	        C=n-(A+B);
	        if(C<0){
	            C=C*-1;
	        }
	    }
	    if((A+B+C) == n){
	        cout<<"YES"<<endl;
	        cout<<A<<" "<<B<<" "<<C<<endl;
	    }else{
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}

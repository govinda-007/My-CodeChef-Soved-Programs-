#include <iostream>
using namespace std;
#define ll long long int
int main() {
	ll t;
	cin>>t;
	while(t--){
	    ll x,ten;
	    cin>>x;
	    if(x%5 == 0){
	        if(x%10 != 0) {
	            ten=(x-5)/10;
	            cout<<ten+1<<endl;
	        }else{
	            ten= x/10;
	            cout<<ten<<endl;
	        }
	    }else{
	        cout<<"-1"<<endl;
	    }
	}
	return 0;
}

#include <iostream>
using namespace std;
#define ll long long int
int main() {
	ll t;
	cin>>t;
	while(t--){
	    ll n,x,k;
	    cin>>n>>x>>k;
	    if(x>k){
	        cout<<"0"<<endl;
	    }else if(n>(k/x)){
	        cout<<(k/x)<<endl;
	    }else{
	        cout<<n<<endl;
	    }
	}
	return 0;
}

#include <iostream>
#include <bits/stdc++.h>
#define ll long long int
using namespace std;

int main() {
	ll t;
	cin>>t;
	while(t--){
	    ll x,b;
	    cin>>x;
	    if((x-5)%4 == 0){
	        b=x;
	    }else if(x%4 == 0){
	        b=x+3;
	    }else{
	        b=3;
	    }
	    cout<<b<<endl;
	}
	return 0;
}

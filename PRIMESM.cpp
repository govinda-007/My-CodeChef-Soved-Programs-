#include <iostream>
#include <bits/stdc++.h>
#define ll long long int
using namespace std;

int main() {
	ll t;
	cin>>t;
	while(t--){
	    ll x,y;
	    cin>>x>>y;
	    if(x==1 || y==1){
	        cout<<-1<<endl;
	    }else if(__gcd(x,y) == 1){
	        cout<<1<<endl;
	    }else{
	        cout<<0<<endl;
	    }
	}
	return 0;
}

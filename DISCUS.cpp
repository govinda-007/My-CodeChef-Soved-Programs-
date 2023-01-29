#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define ll long long int

int main() {
	ll t,a,b,c,largest;
	cin>>t;
	while(t--){
	    cin>>a>>b>>c;
	    largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	    cout<<largest<<endl;
	}
	return 0;
}

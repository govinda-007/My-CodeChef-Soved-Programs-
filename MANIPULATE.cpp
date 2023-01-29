#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int x,y;
	    cin>>x>>y;
	    string r=(x>=y)? "YES" : "NO" ;
	    cout<<r<<endl;
	}
	return 0;
}

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int x,y,m;
	    cin>>x>>y>>m;
	    string result = ((x*m) < y)? "YES" : "NO";
	    cout<<result<<endl;
	}
	return 0;
}

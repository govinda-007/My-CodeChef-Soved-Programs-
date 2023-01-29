#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    string s;
	    int n,ans=0;
	    cin>>n>>s;
	    for(int i=0;i<n;i++){
	        if(s[i] == '1' && s[i+1]=='1'){
	            ans=2;
	            break;
	        }else if(s[i] == '1'){
	            ans=1;
	        }
	    }
	    cout<<ans<<endl;
	}
	return 0;
}

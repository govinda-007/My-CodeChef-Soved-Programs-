#include <iostream>
#include <bits/stdc++.h>
#define int long long
using namespace std;
void solve(){
    int n,e=0,o=0;
	    cin>>n;
	    vector<int> arr(n);
	    for(int i=0;i<n;cin>>arr[i++]);
	    for(int i:arr){
	        (i&1)? o++ : e++;
	    }
	    int ans=0;
	    if(o&1) ans=e;
	    else ans= min(e,o/2);
	    cout<<ans<<endl;
}
int32_t main() {
	int t;
	cin>>t;
	while(t--){
	    solve();
	}
	return 0;
}

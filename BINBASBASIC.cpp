#include <iostream>
using namespace std;

int main(void) {
	int n,k,t;
	string c;
	cin>>t;
	while(t--){
	    int count=0;
	    cin>>n>>k;
	    cin>>c;
	    for(int i=0;i<n/2;i++){
	        if(c[i] != c[n-i-1]){
	            count++;
	        }
	    }
	    if(k>=count){
	        if((k-count)%2 == 0){
	            cout<<"YES\n";
	        }else if(n%2 != 0){
	            cout<<"YES\n";
	        }else{
	            cout<<"NO\n";
	        }
	    }else{
	        cout<<"NO\n";
	    }
	}
	
	
	return 0;
}
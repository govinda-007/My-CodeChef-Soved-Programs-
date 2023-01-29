#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n,mod,result;
	    cin>>n;
	    mod=n%4;
	    result= (mod == 0)? n/4 : (n/4)+1;
	    cout<<result<<endl;
	}
	return 0;
}

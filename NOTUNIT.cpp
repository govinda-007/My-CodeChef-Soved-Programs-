#include <iostream>
#include <bits/stdc++.h>
#define ll long long int
using namespace std;
int main() {
	ll t;
	cin>>t;
    while(t--){
        ll a,b;
        int flag=0;
        cin>>a>>b;
        for(int i=0;i<2;i++){
            if(b-a>1){
                if(a%2 == 0){
                    cout<<a<<" "<<a+2<<endl;
                    flag=1;
                    break;
                }else if(b-a>2){
                    if(a%3 == 0){
                        cout<<a<<" "<<a+3<<endl;
                        flag=1;
                        break;
                    }else{
                        ++a;
                        continue;
                    }
                }
            }
        }
        if(flag ==0) cout<<-1<<endl;
    }
	return 0;
}
#include <bits/stdc++.h>
#define ll long long int
#define mod ll(1e9+7)
using namespace std;
void Luffy()
{
    int A,B,mn,mx,flag=0;
    cin>>A>>B;
    mn=min(A,B);
    mx=max(A,B);
    while(mx>=mn){
        if(mx==mn){
            flag=1;
            break;
        }else{
            mn=(mn<<1);
        }
    }
    (flag==1)? cout<<"YES"<<endl : cout<<"NO"<<endl;
    
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    ll t; cin>>t;
    while(t--)
        Luffy();
}
#include <bits/stdc++.h>
#define ll long long int
#define mod ll(1e9+7)
using namespace std;
void Luffy()
{
    ll x,ans; cin>>x;
    if(x>5000){
        ans=x-500;
    }else if(x<=5000 && x>1000){
        ans=x-100;
    }else if(x<=1000 && x>100){
        ans=x-25;
    }else{
        ans=x;
    }
    cout<<ans<<endl;
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
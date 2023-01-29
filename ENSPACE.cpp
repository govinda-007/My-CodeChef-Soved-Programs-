#include <bits/stdc++.h>
#define ll long long int
#define mod ll(1e9+7)
using namespace std;
void Luffy()
{
    int n,x,y;
    cin>>n>>x>>y;
    (n >= (x*1) + (y*2))? cout<<"YES"<<endl : cout<<"NO"<<endl;
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
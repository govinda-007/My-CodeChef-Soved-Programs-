#include <bits/stdc++.h>
#define ll long long int
#define mod ll(1e9+7)
using namespace std;
void Luffy()
{
    int x,y;
    cin>>x>>y;
    (x*2 == y*5)? cout<<"Either"<<endl : (x*2 < y*5)? cout<<"Candy"<<endl : cout<<"Chocolate"<<endl;
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
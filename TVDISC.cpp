#include <iostream>
#include <bits/stdc++.h>
#define ll long long int
#define mod ll(1e9+7)
using namespace std;
void Luffy()
{
    int a,b,c,d;
    cin>>a>>b>>c>>d;
    if((a-c) == (b-d)){
        cout<<"Any"<<endl;
    }else if((a-c) > (b-d)){
        cout<<"Second"<<endl;
    }else if((a-c) < (b-d)){
        cout<<"First"<<endl;
    }
    
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
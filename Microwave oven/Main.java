#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
        float n,h;
        cin>>n>>h;
        if(n<=1)
            cout<<fixed<<setprecision(2)<<h;
        else if(n==2)
        {           h=h+(h/2);
            cout<<fixed<<setprecision(2)<<h;
        }
        else if(n==3)
        {
             h=(h*2);
            cout<<fixed<<setprecision(2)<<h;
        }
        else
            cout<<"Number of items is more";
}

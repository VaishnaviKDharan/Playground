#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rif,vsen,asen,arm,leg,cost;
  cin>>rif>>vsen>>asen>>arm>>leg;
  cost=((rif*350.34)+(vsen*230.90)+(asen*190.55)+(arm*125.30)+(leg*180.90));
  //cout<<cost;
  if(cost<=15000)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}
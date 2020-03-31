#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float x,y;
  cin>>x>>y;
  float sell,loss;
  sell=(y*12);
  if(sell<x)
  {
    loss=x-sell;
    cout<<"Loss : Rs."<<loss;
  }
  else if(sell>x)
  {
    loss=sell-x;
    cout<<"Profit : Rs."<<loss;
  }
  else
    cout<<"No profit nor loss";
}
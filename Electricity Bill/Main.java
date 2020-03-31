#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit,bill;
  cin>>unit;
  if(unit<=200)
  {
    bill=(0.5*unit);
    cout<<"Rs."<<bill;
  }
  else if(unit<=400)
  {
    bill=(0.65*unit)+100;
    cout<<"Rs."<<bill;
  }
  else if(unit<=600)
  {
    bill=(0.80*unit)+200;
    cout<<"Rs."<<bill;
  }
  else if(unit>600)
  {
    bill=(1.25*unit)+425;
    cout<<"Rs."<<bill;
  }
}
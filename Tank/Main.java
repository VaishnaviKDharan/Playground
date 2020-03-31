#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,h,c,hr;
  cin>>r>>h>>c>>hr;
  int cap=3.14*r*r*h;
  int water=c*hr;
  if(cap<=water)
    cout<<"The tank can be filled within "<<(float)hr<<" hours";
  else
    cout<<"The tank cannot be filled within "<<(float)hr<<" hours";
  
}
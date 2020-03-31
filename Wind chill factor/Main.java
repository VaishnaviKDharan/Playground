#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.el
  int temp,vel;
  float fact;
  cin>>temp>>vel;
  fact= 35.74+ (0.6215*temp)+((0.4275*temp)-35.75)*pow(vel,0.16);
  cout<<fact;
}
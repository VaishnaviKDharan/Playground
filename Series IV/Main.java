#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  float a;
  int n;
  cin>>n;
  a=0.5;
  cout<<a<<" ";
  for(int i=1;i<n;i++)
  {
   a=a*3;
    printf("%.1f ",a);
  }
}

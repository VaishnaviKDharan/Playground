#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,sum=0,first,last;
  cin>>num;
  last=num%10;
  first=num/1000;
  
  sum=first+last;
  cout<<sum;
  
  
}
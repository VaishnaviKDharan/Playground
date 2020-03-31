#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0,temp,t;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  t=n;
  while(n!=0)
  {
    temp=n%10;
    n=n/10;
    count++;
}
  cout<<"The number of digits in "<<t<<" is "<<count;
}

#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,sum=0,copy;
  cin>>num;
  copy=num;
  while(num>0)
  {
    sum=sum+(num%10);
    num=num/10;
  }
  if(copy%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  
}
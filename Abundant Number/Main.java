#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,sum=0,copy;
  cin>>num;
  copy=num;
  for(int i=1;i<num;i++)
  {
    if(num%i==0)
      sum=sum+i;
    //num=num/10;
  }
  //cout<<sum;
  if(sum>copy)
    cout<<"Abundant Number";
  else
    cout<<"Not Abundant Number";
}
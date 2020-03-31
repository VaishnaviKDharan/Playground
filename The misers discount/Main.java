#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float item1,item2,discount,ta,dp,as;
  cin>>item1>>item2>>discount;
  ta=item1+item2;
  cout<<ta<<"\n";
  dp=ta-((discount*item1/100)+(discount*item2/100));
  cout<<dp<<"\n";
  as=ta-dp;
  cout<<as;
  
}
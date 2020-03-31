#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int ta,ben,black,bensum,blacksum,other,remain;
  cin>>ta>>ben>>black;
  bensum=(ta*ben)/100;
  cout<<bensum<<"\n";
  remain=ta-bensum;
  blacksum=(remain*black)/100;
  cout<<blacksum<<"\n";
  other=(remain-blacksum)/3;
  cout<<other;
  
}
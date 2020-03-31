#include<iostream>
using namespace std;
int add(int num);
int main()
{
  //Type your code here.
  int n,sum;
  cin>>n;
  sum=add(n);
  cout<<sum;
  return 0;
}
int add(int num)
{
  int s=0;
  for(int i=0;i<=num;i++)
  {
    s+=i;
  }
  return s;
}

#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,sum=0;
  cin>>num;
  int a[num];
  for(int i=0;i<num;i++)
  {
    cin>>a[i];
    sum+=a[i];
  }
  cout<<sum;
}

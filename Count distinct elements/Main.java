#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0,i,j;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(a[i]==a[j])
      break;
    }
    if(i==j)
      count++;
  }
  cout<<"There are "<<count<<" distinct element in the array.";
}

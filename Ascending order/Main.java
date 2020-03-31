#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
 
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
    if(a[i]<a[j])
    {
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }
    }
  }
  cout<<"Sorted array is:\n";
  for(int i=0;i<n;i++)
  {
    cout<<a[i]<<"\n";
  }
}
#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,flag=0;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(j>i&&a[i][j]!=0)
        flag=1;
    }
  }
  if(flag==0)
    cout<<"Lower Triangular Matrix";
  else
    cout<<"Not a Lower Triangular Matrix";
}

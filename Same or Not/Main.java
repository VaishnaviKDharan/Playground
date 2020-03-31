#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,flag=0,i;
 cin>>n>>m;
  int a[n], b[m];
  for(i=0;i<n;i++)
  {
   cin>>a[i];
  }
  for(i=0;i<m;i++)
  {
   cin>>b[i];
  }
  for(i=0;i<n;i++)
  {
   if(a[i]==b[i])
     flag=1;
    else
      flag=0;
  }
  if(flag==1)
    cout<<"Same";
  else
    cout<<"Not Same";
}

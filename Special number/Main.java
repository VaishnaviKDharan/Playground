#include<iostream>
using namespace std;
int main()
{
  int n,m,sum=1,num;
  cin>>n>>m;
for(int i=n;i<=m;i++)
  {
   num=i;
     int res= (num%10)+((num/10));
   sum= (num%10)*(num/10);
  if ((res+ sum) == i)
  {
    cout<<i<<endl;
  }

  }
  
}

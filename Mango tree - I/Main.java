#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,row,col,num,flag=0,count=0;
  cin>>row>>col>>num;
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      count++;
      if((i==0) || (j==0) || (j==col-1))
         {
        if(count==num)
           flag=1;
         }
    }
  }
  if(flag==1)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}
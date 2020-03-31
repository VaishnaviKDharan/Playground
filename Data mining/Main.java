#include<iostream>
using namespace std;
int main()
{
  int num,i=1,sum1=0,sum=0,rem;
  cin>>num;
  
 while(num)
 {
   if (i%2==1)
   {
     rem=num%10;
     sum=sum+rem;
     num/=10;
     i++;
   }
   else
   {
       rem=num%10;
     sum1=sum1+rem;
     num/=10;
     i++;
   }
 }
  
  if(sum1==sum)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}

#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i=0;
  cin>>n;
  cout<<n<<endl;
 while(n)
 {
  if(n==1)
  {
    cout<<i;
    break;
  }   
  else if(n%2==0)
  {
    n=n/2;
    cout<<n<<endl;
    i++;
  }
  else
  { 
    i++;
      n=(3*n)+1;
      cout<<n<<endl;
  }
 }
}

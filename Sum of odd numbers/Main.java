#include<iostream>
using namespace std;
/*struct s
{
  int sum=0;
  sum=sum+a[i];
};*/
int main()
{
  //Type your code here.
 // struct s;
  int i,num,a[num],sum=0;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>num;
  cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<num;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<num;i++)
  {
    if(a[i]%2==1)
    {
    sum=sum+a[i];
    }
  }
  cout<<"The sum of the odd elements in the array is "<<sum;
}
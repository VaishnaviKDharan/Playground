#include<iostream>
using namespace std;
int main()
{
int num,odd=0,ev=0;
  cin>>num;
  int arr[num],arr1[num];
  for (int i=0;i<num;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<num;i++)
  {
    cin>>arr1[i];
  }
  for(int i=0;i<num;i++)
  {

      if(arr[i]%2==0)
      {
        ev++;
      }
    else
    {
      odd++;
    }

  }
   cout<< "Enter the number of elements in the array\nEnter the elements in the array"<<endl;
if (odd==0)
{
  cout<<"The array is Even";
}
  else if (ev==0)
  {
    cout<<"The array is Odd";
  }
  else
    cout<<"The array is Mixed";  
}

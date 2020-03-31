#include<iostream>
using namespace std;
int main()
{
int num,lo,val;
  cin>>num;
  int arr[num];
  cout<<"Enter the number of elements in the array\nEnter the elements in the array"<<endl;
  for (int i=0;i<num;i++)
  {
    cin>>arr[i];
  }
 cout<<"Enter the location where you wish to insert an element"<<endl;
    cin>>lo;
        if((lo)>num)
    {
      cout<<"Invalid Input";
   
    }
    else{
 cout<<"Enter the value to insert"<<endl;
  cout<<"Array after insertion is"<<endl;

  cin>>val;
  for(int i=0;i<num;i++)
  {
    if (i==(lo-1))
    {
      cout<<val<<endl;
    }
        cout<<arr[i]<<endl;
  }
}
}

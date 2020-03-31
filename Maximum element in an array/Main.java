#include<iostream>
using namespace std;
int max(int arr[], int num) 
{ 
    int i; 
	 int max = arr[0]; 
	 for (i = 1; i < num; i++) 
        if (arr[i] > max) 
            max = arr[i]; 
  
    return max; 
} 
  
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the size of the array "<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter "<<n<<" elements of an array "<<endl;
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"Maximum element in the array is "<<max(a,n);
  
}

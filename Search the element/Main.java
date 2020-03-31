#include <iostream>
using namespace std;

int main()
{
	int count, i, num, first, last, middle;
	cin>>count;
	int arr[count];
	for (i=0; i<count; i++)
		cin>>arr[i];
	 
     cin>>num;
	first = 0;
	last = count-1;
	middle = (first+last)/2;
	while (first <= last)
	{
	   if(arr[middle] < num)
	   {
		first = middle + 1;

	   }
	   else if(arr[middle] == num)
	   {
		cout<<num; 
                break; 
           } 
           else { 
                last = middle - 1; 
           } 
           middle = (first + last)/2; 
        } 
        if(first > last)
	{
	   cout<<"The number is not present in the list";
	}
	return 0;
}

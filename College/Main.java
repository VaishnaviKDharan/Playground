#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
 struct College 
 { 
   char name[100]; 
   char city[100]; 
   int establishmentYear;
   float passPercentage; 
 };
int main()
{
  
  cout<<"Enter the number of colleges";
  int n;
  cin>>n;
  College obj[n];
  for(int i=0;i<n;i++)
  {
    
cout<<"\nEnter the details of college "<<i+1;
cout<<"\nEnter name";
    scanf("%s",obj[i].name);
cout<<"\nEnter city";
    scanf("%s",obj[i].city);
cout<<"\nEnter year of establishment";
    cin>>obj[i].establishmentYear;
cout<<"\nEnter pass percentage";
    cin>>obj[i].passPercentage;
  }
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1;
cout<<"\nName:"<<obj[i].name;
cout<<"\nCity:"<<obj[i].city;
cout<<"\nYear of establishment:"<<obj[i].establishmentYear;

cout<<"\nPass percentage:"<<obj[i].passPercentage;
 
  }
  
}

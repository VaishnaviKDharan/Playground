#include<iostream>
#include<string.h>
#include<stdio.h>

using namespace std;
int main()

{
  char a[100],temp;
  int k,i,j;
  gets(a);
  int n=strlen(a);
  for(int i=0;i<n-1;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(a[i]>a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
  for( i=0;i<n;i++)
  { 
    k=1;
    if(a[i])
   {
     for(j=i+1;j<n;j++)
    {
      if(a[i]==a[j])
      {
        k++;
        a[j]='\0';
      }
    }
    cout<<a[i]<<" "<<k<<endl;
  }
 }
   return 0; 
}

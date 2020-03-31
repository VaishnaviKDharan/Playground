#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[100];
  int k;
  cin>>a;
  int n=strlen(a);
  int c=n;
  for(int i=0; i<n;)
  {
    switch(a[i])
    {case 'a':
     case 'A':
     case 'e':
     case'E':
     case 'i':
     case 'I':
     case 'o':
     case'O' :
     case 'u':
     case 'U':for( k=i;k<c;k++)
    			 {
                   a[k]=a[k+1];
     			 }k--;
     break;
     default :i++;
    }
    }a[c]='\0';
    cout<<"The output string is "<<a;
}

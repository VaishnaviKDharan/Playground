#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
int main()
{
  char Q[200];
  int k=0,j=0,space=0,dig=0,sym=0;
 gets(Q);
  for (int i=0;Q[i]!='\0';i++)
  {
    if(Q[i]=='a'||Q[i]=='A'||Q[i]=='e'||Q[i]=='E'||Q[i]=='i'||Q[i]=='I'||Q[i]=='o'||Q[i]=='O'||Q[i]=='u'||Q[i]=='U')
     k++;
    else if (Q[i]==32)
      space++;
      else if(Q[i]>=33 && Q[i]<= 47)
        sym++;
        else if(Q[i]>='0'&& Q[i]<='9' )
          dig++;
    else j++;
      
  }
  cout<<"Vowels:"<<k<<endl;
  cout<<"Consonants:"<<j<<endl;
  cout<<"White Spaces:"<<space<<endl;
  cout<<"Digits:"<<dig<<endl;
  cout<<"Symbols:"<<sym;

}

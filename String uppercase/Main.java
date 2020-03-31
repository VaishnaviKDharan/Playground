#include <iostream>
#include <cstring>
using namespace std;
int main()
{
   char s[20];
   int i;
   cin>>s;
   for(i=0;i<=strlen(s);i++) 
   { 
 		if(s[i]>=93 && s[i]<=120)
			s[i]=s[i]-32;
	 }
   cout<<"String in uppercase is "<<s;
   return 0;
}

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
 		if(s[i]>=65 && s[i]<=92)
			s[i]=s[i]+32;
	 }
   cout<<"The output string is "<<s;
   return 0;
}

// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  char str[1000];
  gets(str);
  char stat[26];
  for(int i=0;i<26;i++)
  {
    stat[i]=0;
  }
  for(int i=0;i<strlen(str);i++){
   if(str[i]>='a' && str[i]<='z')
   {
     int offset=str[i]-'a';
     stat[offset]++;
   }
     else if(str[i]>='A' && str[i]<='Z')
   {
     int offset=str[i]-'A';
     stat[offset]++;
   }
    
  }
  
  for(int i=0;i<26;i++)
  {
    if(stat[i]==0){
    char offset=i+'a';
      printf("%c ",offset);
    }
  }
  
   return 0;
}
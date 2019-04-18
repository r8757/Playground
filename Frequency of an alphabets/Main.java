// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<string.h>
// Main function
int main()
{
  // Enter your code here 
   char str[100];
   gets(str);
  int stat[26];
  for(int i=0;i<26;i++){
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
      if(stat[i]!=0)
      {
      int offset=i+'a';
      printf("%c%d ",offset,stat[i]);
         }
      }
  
   return 0;
}
#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  int f_digit=a%10;
  f_digit=f_digit+(a/10);
  printf("%d",f_digit);
  return 0;
}
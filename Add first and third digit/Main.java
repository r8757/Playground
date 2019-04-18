#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  int f_digit=num%10;
  num=num/100;
  printf("%d",(num+f_digit));
  return 0;
}
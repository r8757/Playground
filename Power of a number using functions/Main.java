#include<stdio.h>
int power(int b,int e)
{
  int pow=1;
  for(int i=1;i<=e;i++)
  {
    pow=pow*b;
  }
  return pow;
}
int main(){
    // Type your code here
  int base,exp;
  scanf("%d %d",&base,&exp);
  printf("%d",power(base,exp));
  	return 0;
}
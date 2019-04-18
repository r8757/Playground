#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int temp=n;
  int count=0;
  int sum=0;
  while(temp!=0)
  {
    temp=temp/10;
    ++count;
  }
  temp=n;
  while(temp!=0)
  {
    int digit=temp%10;
    sum=sum+pow(digit,count);
    temp=temp/10;
  }
  if(sum==n)
  printf("Armstrong Number");
  else
     printf("Not an Armstrong Number");
	return 0;
}
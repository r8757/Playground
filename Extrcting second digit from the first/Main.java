#include <stdio.h>
int main() {
	//Type your code
  int n;
  int temp=0;
  scanf("%d",&n);
  while(n>10)
  {
    temp=n%10;
    n=n/10;
  }
  printf("%d",temp);
	return 0;
}
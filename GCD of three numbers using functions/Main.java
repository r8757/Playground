#include <stdio.h>
int gcd(int n1,int n2)
{
  int min,g;
  if(n1<n2)
    min=n1;
  else
    min=n2;
  while(min>=1)
  {
    if((n1%min==0)&&(n2%min==0))
    {
      g=min;
      break;
    }
    min--;
  }
  return g;
}
int main() {
	//Type your code here
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
   int g=gcd(n1,n2);
   printf("%d",gcd(g,n3));
	return 0;
}
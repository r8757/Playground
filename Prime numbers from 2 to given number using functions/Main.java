#include<stdio.h>
void prime(int n)
{
  int count;
   for(int Number = 1; Number <=n; Number++)
  {
    count = 0;
    for (int i = 2; i <= Number/2; i++)
    {
  	if(Number%i == 0)
  	{
     	  count++;
  	  break;
	}
    }
    if(count == 0 && Number != 1 )
    {
	printf("%d\n", Number);
    }  
  }
}
int main(){
    // Type your code here
  int n;
  scanf("%d",&n);
  prime(n);
    return 0;
}
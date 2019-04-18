/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  int sum1=0,sum2=0;
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(int i=0;i<n/2;i++)
    sum1=sum1+arr[i];
  for(int i=n/2;i<n;i++)
    sum2=sum2+arr[i];
  if(sum2==sum1)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  return 0;
}
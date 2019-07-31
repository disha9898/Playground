#include<stdio.h>
int main()
{
	 long i,n,f;
  scanf("%ld",&n);
  f=1;
  for(i=2;i<=n;i++)
  {
    f=f*i;
  }
  printf("%ld",f);
  return 0;
}
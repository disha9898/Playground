#include <stdio.h>
int main() {
	int n,t,d,s=0,f=1,i;
  scanf("%d",&n);
  t=n;
  while(t!=0)
  {
    d=t%10;
    f=1;
    for(i=1;i<=d;i++)
    {
      f=f*i;
    }
    s=s+f;
    t=t/10;
  }
  if(s==n)
    printf("Yes");
  else
    printf("No");
  
	return 0;
}
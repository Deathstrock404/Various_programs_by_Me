// stack push operation
#include <stdio.h>
#include <stdlib.h>

void main()
{
    int a[10],i,item,top=0,n;
    printf("Enter the size of the stack \n");
    scanf("%d",&n);
    printf("enter the elements of the stack");
    for(i=n;i=0;i--)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter the elements to be put in the stack\n");
    scanf("%d",&item);
    if(n==10)
    {
        printf("overflow");
    }
    else
    {
        a[n+1]=item;
        printf("stack after insertion");
        for(i=1;i<=n;i++)
        {
            scanf("%d",a[i]);
        }
    }
}

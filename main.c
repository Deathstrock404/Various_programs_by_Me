//program to perform linear search
#include<stdio.h>

int main()
{
    int data[20],k=0,loc=0,n,i,item;
    printf("enter the no of element\n");
    scanf("%d",&n);
    printf("enter the array element\n");
    //creating the array
    for(i=0;i<n;i++)
    {
        scanf("%d",&data[i]);
    }
    printf("enter the value to be searched\n");
    scanf("%d",&item);
    //comparing the elements which entered to the element in the array
    while (k<n&&loc==0)
    {
        if (item == data[k])
        {
            loc=k;
        }
        k=k+1;
    }
    //in case the element is not found
    if (loc==0)
    {
        printf("item not found");
    }
    //in the case when the element is found
    else
    {
        printf("loc=%d",loc);
    }
}

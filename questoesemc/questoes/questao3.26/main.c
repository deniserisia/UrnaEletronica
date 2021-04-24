#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i ;
    for ( i = 1 ; i <= 5 ; i++){
        printf("%d\t%d\t%d\t%d\n", 3*i, (3*i) + 2 ,(3*i) + 4, (3*i) + 6);
    }
    return 0;
}

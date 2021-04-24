#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i ;
    for ( i = 1 ; i <= 10 ; i++){
        printf("%d\t%d\t%d\t%d\n", i, i*10, i*100, i*1000);
    }
    return 0;
}

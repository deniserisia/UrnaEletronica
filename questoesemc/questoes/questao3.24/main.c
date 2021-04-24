#include <stdio.h>
#include <stdlib.h>

int main()
{
    int contador, numero, maior ;
    maior = - 1000;

    for ( contador = 1 ; contador <= 10 ; contador++)
        scanf("%d", &numero);
        if ( numero > maior ){
            maior = numero ;
        }
    printf(" O maior numero eh: %d", maior);

    return 0;
}

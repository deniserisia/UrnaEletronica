#include <stdio.h>
#include <stdlib.h>

int main()
{
    int contador, maior, maior1 ;
    int numero[10];
    maior = - 1000;
    maior1 = - 1001;

    for ( contador = 0 ; contador < 10 ; contador++){
        scanf("%d", &numero[contador]);
    }
    for ( contador = 0 ; contador < 10 ; contador++){
        if(numero[contador] > maior)
            maior = numero[contador];
    }
    for ( contador = 0 ; contador < 10 ; contador++){
        if(numero[contador] > maior1 && numero[contador] < maior)
            maior1 = numero[contador];
    }
    printf("O primeiro numero eh: %d\n", maior);
    printf(" O segundo numero eh: %d\n", maior1);
    return 0;
}

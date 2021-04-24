#include <stdio.h>
#include <stdlib.h>

int main()
{
    float x,y,z,i,d,n;

    printf("\n Informe o numero da sua conta: ");
    scanf("%f", &x);
    printf("\n Informe o saldo inicial: ");
    scanf("%f", &y);
    printf("\n Informe o total de encargos: ");
    scanf("%f", &z);
    printf("\n Informe o total de creditos: ");
    scanf("%f", &i);
    printf("\n Informe o limite de credito: ");
    scanf("%f", &d);

    n = y + z - i ;
    if ( n <= d ) {
        printf("\n Limite ok", n);
    } else {
    printf("\n Sua conta eh: %.2f", x);
    printf("\n Seu limite de saldo eh: %.2f", d);
    printf("\n Limite de credito ultrapassado", n);

    }







    return 0;
}

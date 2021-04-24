#include <stdio.h>
#include <stdlib.h>

int main()
{
    float x, z;

    printf("\n Informe a venda realizada em reais: ");
    scanf("%f", &x);

    z = 200 + ( 99,91 * x );

    printf(" O seu pagamento eh de: %.3f", z);


    return 0;
}

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float juros, principal, taxa, dias;

    printf("\n Informe o valor principal do emprestimo: ");
    scanf("%f", &principal);
    printf("\n Informe a taxa de juros: ");
    scanf("%f", &taxa);
    printf("\n Informe o prazo do emprestimo em dias: ");
    scanf("%f", &dias);

    juros = principal * taxa * dias / 365 ;

    printf("\n O valor dos juros eh: %.3f", juros);


    return 0;
}

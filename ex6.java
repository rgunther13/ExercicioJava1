class ex6{
public static void main(String[] args) {
        
    int r = 0, n = 1000;

    for (int i = n - 1; i >= 0 ; i--)
        if (i % 3 == 0 || i % 5 == 0 )
            r += i;           
        
    System.out.printf("O resultado da soma dos múltiplos de 3 e 5 menores que %d é: %d ",n, r);

    }
}
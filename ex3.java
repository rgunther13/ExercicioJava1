import java.util.Scanner;

class ex3{
public static void main(String[] args) {
    
    var input = new Scanner(System.in);
    int r = 0;
    System.out.println("Digite um numero decimal: ");
    int n = input.nextInt();
    input.nextLine();
    input.close();
    
    
       for (int i = n - 1; i >=0 ; i--)
            if (i % 2 == 0)
                r += i;           
        
    System.out.printf("O resultado da soma dos números pares menores que %d é: %d ",n, r);

    }
}
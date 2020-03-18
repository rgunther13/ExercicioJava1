import java.util.Scanner;

class ex5{
public static void main(String[] args) {
    
    int mdc = 0;
    int menor = 0;

    var input = new Scanner(System.in);
    
    System.out.println("Digite um numero decimal: ");
    int a = input.nextInt();
    input.nextLine();
    System.out.println("Digite outro numero decimal: ");
    int b = input.nextInt();
    input.nextLine();
    input.close();
    if (a < b)
        menor = a;
    else
        menor = b;
    
       for (int i = 2 ; i <= menor ; i++)
            if (a % i == 0 & b % i == 0)
                mdc = i;           
        
    System.out.printf("O MDC entre %d e %d é: %d ",a, b, mdc);

    }
}
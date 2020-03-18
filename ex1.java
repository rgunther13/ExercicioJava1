import java.util.Scanner;

class ex1{
public static void main(String[] args) {
    
    var input = new Scanner(System.in);
    int r = 1;
    System.out.println("Digite um numero decimal: ");
    int n = input.nextInt();
    input.nextLine();
    System.out.println("Digite a potência: ");
    int p = input.nextInt();
    input.nextLine();
    input.close();
    
       for (int i = 1; i <= p; i++)
            r = (n * r);           
        
    System.out.printf("O resultado da potenciação é: %d ", r);

    }
}
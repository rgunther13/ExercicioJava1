import java.util.Scanner;

class TesteScanner{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um inteiro: ");
        int a = input.nextInt();
        System.out.println("Valor a " + a);
        
        System.out.println("Digite um double: ");
        double b = input.nextDouble();
        System.out.printf("%f \n", b);

        input.nextLine();
        
        System.out.println("Digite um nome: ");
        String nome = input.nextLine();
        System.out.print(nome);
    }
    
}
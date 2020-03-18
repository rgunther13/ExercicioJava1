import java.util.Scanner;

class ex2{

    public static int fatorial(int n){
        if (n < 1)       //base da recursão
            return 1;
        else
            return n * fatorial(n-1);   //chamada recursiva
    }

        public static void main(String[] args) {
            
            var input = new Scanner(System.in);
            
            System.out.println("Digite um numero decimal para calcular o Fatorial !N: ");
            int n = input.nextInt();
               
            System.out.printf("O Fatorial de %d é: %d ", n, (fatorial(n)));

            }
}
import java.util.Scanner;

class mediaehmaior{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero de ponto flutuante: ");
        float a = input.nextFloat();
        input.nextLine();
                
        System.out.println("Digite outro numero de ponto flutuante: ");
        float b = input.nextFloat();
        input.nextLine();

        System.out.println("Digite um numero de ponto flutuante: ");
        float c = input.nextFloat();
        input.nextLine();
     
                
        System.out.println("A soma dos dois numeros eh: " + (a+b+c));
        System.out.println("A media dos 3 numeros eh: " + ((a+b+c)/3);
        System.out.println("A multiplicacao dos 3 numeros eh: " + (a*b*c));
        int maior;
        if (a > b && a >c)
            maior = a;
        else if (b > a && b > c)
            maior = b;
        else 
            maior = c;

            
            System.out.println("Os numeros sao IGUAIS!!!");
        else if (a > b)
            System.out.println("O numero" + a + " eh MAIOR!!");
        else 
            System.out.println("O numero" + b + " eh MAIOR!!");

        
    }
    
}
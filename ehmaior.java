import java.util.Scanner;

class ehmaior{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int a = input.nextInt();
        input.nextLine();
                
        System.out.println("Digite outro numero inteiro: ");
        int b = input.nextInt();
        input.nextLine();
        input.close();

        if (a == b)
            System.out.println("Os numeros sao IGUAIS!!!");
        else if (a > b)
            System.out.println("O numero" + a + " eh MAIOR!!");
        else 
            System.out.println("O numero" + b + " eh MAIOR!!");


              

        
    }
    
}
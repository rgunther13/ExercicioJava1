import java.util.Scanner;

class ssmdr{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero de ponto flutuante: ");
        float a = input.nextFloat();
        input.nextLine();
                
        System.out.println("Digite outro numero de ponto flutuante: ");
        float b = input.nextFloat();
        input.nextLine();
        input.close();
                
        System.out.println("A soma dos dois numeros eh: " + (a+b));
        System.out.println("A subtracao dos dois numeros eh: " + (a-b));
        System.out.println("A multiplicacao dos dois numeros eh: " + (a*b));
        System.out.println("A divisao dos dois numeros eh: " + (a/b));
        System.out.println("O resto da divisao  dos dois numeros eh: " + (a%b));

        
    }
    
}
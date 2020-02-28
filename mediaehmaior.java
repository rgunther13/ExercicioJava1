import java.util.Scanner;

class mediaehmaior{
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero de ponto flutuante: ");
        final float a = input.nextFloat();
        input.nextLine();

        System.out.println("Digite outro numero de ponto flutuante: ");
        final float b = input.nextFloat();
        input.nextLine();

        System.out.println("Digite um numero de ponto flutuante: ");
        final float c = input.nextFloat();
        input.nextLine();
     
                
        System.out.println("A soma dos dois numeros eh: " + (a+b+c));
        System.out.println("A media dos 3 numeros eh: " + ((a+b+c)/3));
        System.out.println("A multiplicacao dos 3 numeros eh: " + (a*b*c));
        float maior;
        float menor;
        if (a > b && a >c){
            maior = a;
            if (b < c){
                menor = b;
            }
            else{
                menor = c;
            }

        }
        else if (b > a && b > c){
            maior = b;
            if (a < c){
                menor = a;
            }
            else{
                menor = c;
            }
            
        }
        else {
            maior = c;
            if (a < b){
                menor = a;
            }
            else{
                menor = b;
            }

        }    
        System.out.println("O numero " + maior + " eh MAIOR!!");
        System.out.println("O numero " + menor + " eh MENOR!!");
      

        
    }
    
}
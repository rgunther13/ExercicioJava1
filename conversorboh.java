import java.util.Scanner;

class coversorboh{

    public static void binario(int a){
        int resto;
        String result = "";
        String aux = "";
           
        do{
            resto = a%2;
            a = (int)a/2;
            result =  Integer.toString(resto) + aux;
            aux = result;
        }while (a > 0);
        System.out.printf("O número Convertido para Binário é: 0b%s", result); 
    }

    public static void octal(int a){
        int resto;
        String result = "";
        String aux = "";
           
        do{
            resto = a%8;
            a = (int)a/8;
            result =  Integer.toString(resto) + aux;
            aux = result;
        }while (a > 0);
        System.out.printf("O número Convertido para Octal é: 0o%s", result); 
    }

    public static void hexa(int a){
        int resto;
        String result = "", letra="";
        String aux = "";
           
        do{
            resto = a%16;
            a = (int)a/16;
            if (resto >9){
                if (resto == 10)
                letra = "A";
                if (resto == 11)
                letra = "B";
                if (resto == 12)
                letra = "C";
                if (resto == 13)
                letra = "D";
                if (resto == 14)
                letra = "E";
                if (resto == 15)
                letra = "F";
                result =  letra + aux;
            }else
                result =  Integer.toString(resto) + aux;
            aux = result;
        }while (a > 0);
        System.out.printf("O número Convertido para Hexadecimal é: 0x%s", result); 
    }
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero decimal a ser convertido: ");
        int a = input.nextInt();
        input.nextLine();
        binario(a);
        System.out.printf("\n");
        octal(a);
        System.out.printf("\n");
        hexa(a);
    }
}
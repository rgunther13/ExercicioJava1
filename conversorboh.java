import java.util.Scanner;

class coversorboh{

    public static String binario(int a, int resto,String result, String aux){
           
        if (a <= 0)
            return result;
        else{
            resto = a%2;
            a = (int)a/2;
            result =  Integer.toString(resto) + aux;
            aux = result;
            return binario(a, resto, result, aux);
        }
      
    }

    public static String octal(int a, int resto,String result, String aux){
        if (a <= 0)
            return result;          
        else{
            resto = a%8;
            a = (int)a/8;
            result =  Integer.toString(resto) + aux;
            aux = result;
            return octal(a, resto, result, aux);
        }
         
    }

    public static String hexa(int a, int resto,String result, String aux){
        String letra="";
        if (a <= 0)
        return result;          
        else{ 
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
            }else{
                result =  Integer.toString(resto) + aux;
                aux = result;
            }
            return hexa(a, resto, result, aux);
        }
       
    }
    public static void main(final String[] args) {
        final int resto = 0;
        final String result = "", aux = "";
        final Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero decimal a ser convertido: ");
        final int a = input.nextInt();
        input.nextLine();
        System.out.printf("O número Convertido para Binário é: 0b%s", (binario(a, resto, result, aux)));
        System.out.printf("\n");
        System.out.printf("O número Convertido para Octal é: 0o%s", (octal(a, resto, result, aux)));
        System.out.printf("\n");
        System.out.printf("O número Convertido para Hexadecimal é: 0x%s", (hexa(a, resto, result, aux)));
    }
}
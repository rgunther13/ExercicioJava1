import java.util.Scanner;

class coversorboh{

    public static String binario(int a, int resto,String result){
           
        if (a <= 0)
            return result;
        else{
            resto = a%2;
            a = (int)a/2;
            result =  Integer.toString(resto) + result;
            return binario(a, resto, result);
        }
      
    }

    public static String octal(int a, int resto,String result){
        if (a <= 0)
            return result;          
        else{
            resto = a%8;
            a = (int)a/8;
            result =  Integer.toString(resto) + result;
            return octal(a, resto, result);
        }
         
    }

    public static String hexa(int a, int resto,String result){
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
                result =  letra + result;
                
            }else{
                result =  Integer.toString(resto) + result;
            }
            return hexa(a, resto, result);
        }
       
    }
    public static void main(final String[] args) {
        int resto = 0;
        int opt = 1;
        final String result = "";
        var input = new Scanner(System.in);
        System.out.println("Digite um numero decimal a ser convertido: ");
        final int a = input.nextInt();
        input.nextLine();
        while (opt !=0){
            System.out.println();
            System.out.println("######Coversão para:######");
            System.out.println("#     (1) - Binário      #");
            System.out.println("#     (2) - Octal        #");
            System.out.println("#     (3) - Hexadecimal  #");
            System.out.println("#     (0) - Sair         #");
            System.out.println("##########################");
            opt = input.nextInt();
            input.nextLine();
            
                switch (opt){
                    case 1:
                        System.out.printf("O número Convertido para Binário é: 0b%s", (binario(a, resto, result)));
                        System.out.println();
                        break;
                    case 2:
                        System.out.printf("O número Convertido para Octal é: 0o%s", (octal(a, resto, result)));
                        System.out.println();
                        break;
                    case 3:
                        System.out.printf("O número Convertido para Hexadecimal é: 0x%s", (hexa(a, resto, result)));
                        System.out.println();
                        break;
                    default:
                        break;
                }
            }
        System.out.println("Conversão terminada, até logo!!!");
        
    }
}
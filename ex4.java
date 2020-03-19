import java.util.Scanner;

class ex4{
public static void main(String[] args) {
    
    double delta, raiz1, raiz2; 
    
    //entrada de dados
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o termo A da equação: ");
    float a = input.nextFloat();
    input.nextLine();   
    System.out.println("Digite o termo B da equação: ");
    float b = input.nextFloat();
    input.nextLine();
    System.out.println("Digite o termo C da equação: ");
    float c = input.nextFloat();
    input.nextLine();
    input.close();
       
    //cálculo do delta
    delta = (b*b) - (4*a*c);
    System.out.printf("Delta: %.2f", delta);
    System.out.println();

    //condicionais para execução do cálculo e saída de dados
    
    if ((int)delta >= 0){
            if (delta == 0 ){
                    raiz1 = (-b) / (a*2);
                    System.out.printf("A raiz desta equação é %.2f",raiz1);
                    System.out.println();
            }
            else {
                    raiz1 = ((-b + (Math.sqrt(delta) )) / (2 * a));
                    raiz2 = ((-b - (Math.sqrt(delta) )) / (2 * a));
                    System.out.printf("As raízes da equação são %.2f, %.2f",raiz1,raiz2);
            }
        }
    else
        System.out.println("Esta equação não possui raízes reais");
    }
}

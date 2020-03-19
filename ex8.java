import java.util.Random;
import java.util.Scanner;

class ex8{

    //Cria Vetor com valores Randômicos de 0 a t
    public static int[] criavetor(int t){
        
        int[] vetor = new int[t];
        Random rand = new Random();
        
        for (int linha = 0; linha < vetor.length; linha++){
            int rand_int1 = rand.nextInt(t);
            vetor[linha] = rand_int1;
            }
        return vetor;

    }

    //Exibe Vetor
    public static void exibevetor(int vetor[]){
        
        System.out.printf("Vetor em ordem progressiva:\n"); 
        for (int linha = 0; linha < vetor.length; linha++){
            System.out.printf("%d[%d] ",linha, vetor[linha]); 
            }
    }

     //Exibe Vetor em ordem Inversa
     public static void exibevetoriverso(int vetor[]){
        
        System.out.printf("\nVetor em ordem inversa:\n"); 
        for (int p = vetor.length -1 ; p >= 0; p--){
            System.out.printf("%d[%d] ",p, vetor[p]); 
            }
    }
public static void main(String[] args) {
    
    var input = new Scanner(System.in);
    
    System.out.println("Digite o tamanho do vetor: ");
    int t = input.nextInt();
    input.nextLine();
    input.close();
    
    int[] vetor = criavetor(t);
    exibevetor(vetor);
    exibevetoriverso(vetor);
        
        }
    }

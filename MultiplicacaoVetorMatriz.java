import java.util.Random;

class MultiplicacaoVetorMatriz{
    
    public static void main(String[] args){
        int[][] matriz = new int[3][3];
        int[] vetor = {3, 4, 5};
        int[] vetor2 = new int[3];
        
        
        Random rand = new Random();
        
        //Cria Matriz com valores Randômicos de 0 a 10
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                int rand_int1 = rand.nextInt(10);
                matriz[linha][coluna] = rand_int1;
            }
        }
        //Multiplica Vetor pela Matriz
        for (int linha = 0; linha < matriz.length; linha++){
            int soma = 0;
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                soma += (matriz[linha][coluna] * vetor[coluna]);
             
            }
            vetor2[linha] = soma;
        }

        //Exibe Matriz
        System.out.println("Exibe Matriz");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.printf("%-6d ", matriz[linha][coluna]);
                
            }
            System.out.println();
        }

         //Exibe Vetor
         System.out.println("Exibe Vetor");
         
            for (int coluna = 0; coluna < vetor.length; coluna++){
                 System.out.printf("%-6d ", vetor[coluna]);
                 
             }
        System.out.println();       
        
        //Exibe Vetor
        System.out.println("Exibe Vetor Multiplicado Resultante");
         
        for (int coluna = 0; coluna < vetor2.length; coluna++){
             System.out.printf("%-6d ", vetor2[coluna]);
             
         }
         System.out.println();        
      
       
        }
           
    }
        

   

import java.util.Scanner;

class MultiplicacaoDeMatrizes{
    public static void main(String[] args){

        int m, n, p, q, c, d, k, sum = 0;
        
        int[][] matriz1 = new int[10][10];
        int[][] matriz2 = new int[10][10];
        int[][] multiplicada = new int[10][10];
        Scanner input = new Scanner(System.in);

        System.out.printf("Entre com o numero de linhas da  matriz1:\n");
        m = input.nextInt();
        System.out.printf("Entre com o numero de colunas da  matriz1:\n");
        n = input.nextInt();
        
        System.out.printf("Entre com os elementos da matriz1:\n");
      
        for (  c = 0 ; c < m ; c++ )
          for ( d = 0 ; d < n ; d++ )
            matriz1[c][d] = input.nextInt();
      
            System.out.printf("Entre com o numero de linhas da  matriz2:\n");
            p = input.nextInt();
            System.out.printf("Entre com o numero de colunas da  matriz2:\n");
            q = input.nextInt();
      
        if ( n != p )//Condição para verificar se as matrizes são multiplicáveis
          System.out.printf("As Matrizes de ordem informadas nao podem ser multiplicadas.\n");
        else
        {
          System.out.printf("Entre com os elementos da matriz2:\n");
      
          for ( c = 0 ; c < p ; c++ )
            for ( d = 0 ; d < q ; d++ )
                matriz2[c][d] = input.nextInt();
      
        //Multiplicação das Matrizes
          for ( c = 0 ; c < m ; c++ )
          {
            for ( d = 0 ; d < q ; d++ )
            {
              for ( k = 0 ; k < p ; k++ )
              {
                sum = sum + matriz1[c][k]*matriz2[k][d];
              }
      
              multiplicada[c][d] = sum;
              sum = 0;
            }
          }
      
          System.out.printf("Multiplicacao das Matrizes informadas :\n");
      
          for ( c = 0 ; c < m ; c++ )
          {
            for ( d = 0 ; d < q ; d++ )
              System.out.printf("%d\t", multiplicada[c][d]);
      
            System.out.printf("\n");
          }
        }
       
    }

}
class MenorMaiorValorMatriz{
    public static void main(String[] args){
        int[][] matriz = new int[10][10];
        int valor = 0;
        int maior = 0;
        int menor = 1000;

        //Preenchimento da Matriz
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = valor++;
            }
        }

        //Comparação de Maior valor da Matriz//

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                if (matriz[linha][coluna] > maior)
                    maior = matriz[linha][coluna];
                
                
            }
            
        }
        System.out.printf("O Maior número da Matriz é %-6d ", maior);
        System.out.println();


        //Comparação de Menor valor da Matriz//

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                if (matriz[linha][coluna] < menor)
                    menor = matriz[linha][coluna];
                
                
            }
            
        }
        System.out.printf("O Menor número da Matriz é %-6d ", menor);
        System.out.println();

        //Impressão da Matriz de Saída//
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.printf("%-6d ", matriz[linha][coluna]);
                
            }
            System.out.println();
        }


    }
}
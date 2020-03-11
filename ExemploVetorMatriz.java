class ExemploVetorMatriz{
    public static void main(String[] args){
        int[][] matriz = new int[10][10];
        int valor = 0;

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = valor++;
            }
        }

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.printf("%-6d ", matriz[linha][coluna]);
                
            }
            System.out.println();
        }


    }
}
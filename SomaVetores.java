class SomaVetores{
    public static void main(String[] args){
        int[][] matriz = new int[5][5];
        int[][] matriz2 = new int[5][5];
        int valor = 0;

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = valor++;
            }
        }

        valor = 0;
        for (int linha = 0; linha < matriz2.length; linha++){
            for (int coluna = 0; coluna < matriz2[linha].length; coluna++){
                matriz2[linha][coluna] = valor++;
            }
        }

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = matriz[linha][coluna] + matriz2[linha][coluna];
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
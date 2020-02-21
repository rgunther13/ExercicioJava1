class exercicio4{
    public static void main(String[] args){
    long fat = 1;
       for(int n = 1;n <= 40; n++){

          while (n >= 2){
                    fat = fat * n;
                    break;
                }
        System.out.println("Fatorial de " + n +" eh = " + fat);
        }
        
    }
   
    
}   
 
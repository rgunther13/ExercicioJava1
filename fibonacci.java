class fibinacci{
    public static void main(String[] args){

    int a = 0;
    int b = 1;
    int soma = 0;
    
    for (int i = 0; a < 100; i++){
        System.out.println("A soma é :"+ a);
        soma = a + b;
        a = b;
        b = soma;
        // b = b + a;
        // a = b - a; sem usar o auxiliar 
        
    }
 }
}
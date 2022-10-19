public class OperadoresRelacional {
    
    public static void main(String[] args) {
    
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        if(numero1 < numero2){
            System.out.println("A NOSSA CONDIÇÃO É VERDADEIRA");
        }
        System.out.println("numeroUm é igual a numeroDois?" + simNao);
        simNao = numero1 != numero2;
        System.out.println("numeroUm é Diferente a numeroDois?" + simNao);
        simNao = numero1 > numero2;
        System.out.println("numeroUm é Maior a numeroDois?" + simNao);
    }   

}

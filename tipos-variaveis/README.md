ARITMÉTICOS

soma , subtração, multiplicação, divisao

double soma = 10.5 + 15.7;

int subtração = 113 -25 ;

int muliplicação = 20*7;

int divisão = 15 / 3;

int modulo = 18 % 3;

double resultado =(10 * 7 ) + (20/4);

*OPERADOR DE ADIÇÃO QUANDO STRING ELE JUNTA AS PALAVRAS



UNÁRIOS:

ele faz a incrementação, decrementar, inverter valores numeros e booleanos

(+) unario positivo

(-) unario neativo

(++) unario invremento de valor

(--) unario decremento de valor



public class Operadores {

    public static void main(String[] args) {

	int numero = 5;



	System.out.println( ++ numero);

	System.out.println(numero);

    }

}

exemplo para encrementar valor, nesse caso o resultado seria 6

se decrementer com (--) valor, nesse caso o resultado seria 4

public class Operadores {

    public static void main(String[] args) {

	boolean variavel = true;



	variavel = !variavel;

	System.out.println(variavel);

    }

}

resultado é false , com isso conseguimos transformar uma variavel verdadeira,do tipo boolean para falso



OPERADOR TERNARIO

FORMA RESUMIDA PARA DEFINIR UMA CONDIÇÃO E ESCOLHER POR UM DENTRO DE DOI US VALORES.

de forma que todas estrutura é escrita em uma unica linha de codigo

representados pelo simbolo ? e :

public class Operadores {

    public static void main(String[] args) {

	int a, b;

	a = 5;

	b= 6;

	String resultado = a==b? "verdadeiro" : "false";

	System.out.println(resultado);

    }

}

resultado falso , pois A não é igual B.



OPERADOR RELACIONAIS

RELACIONAIS AVALIAM A RELAÇÃO ENTRE DUAS VARIAVEIS OU EXPRESSOES, RETORNANDO UM VALOR BOOLEANO COMO RESULTADO



== verificar se é igual , 

, !- verificar se é diferente

, > verificar se é maior

, >= verificar se é maior ou igual a outra

, < verificar se é menor

, <= verificar se é menor ou igual a outra



public class Operadores {

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

resposta:

A NOSSA CONDIÇÃO É VERDADEIRA

numeroUm é igual a numeroDois?false

numeroUm é Diferente a numeroDois?true

numeroUm é Maior a numeroDois?false



OPERADOR LOGICO

REPRESENTA O RECURSO DE CRIAR EXPRESSÕES , APARTIR DE JUNÇÃO DE DUAS OU MAIS EXPRESSÕES , PARA SABER SE É VERDADEIRA



&& valida se as duas condiçoes são verdadeiras

|| verifica se as duas condiçoes são verdadeiras

exemplo1:

public class OperadoresLogico {

    public static void main(String[] args) {

        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2){

            System.out.println("as duas condições são verdadeiras");

        }

        if(condicao1 || condicao2){

            System.out.println("Uma duas condições são é verdadeiras");

        }

        System.out.println("fim");

    }

}

resultado :

Uma duas condições são é verdadeiras

fim

exemplo2:

public class OperadoresLogico {

    public static void main(String[] args) {

        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2){

            System.out.println("as duas condições são verdadeiras");

        }

        if(condicao1 || condicao2){

            System.out.println("Uma duas condições são é verdadeiras");

        }

        System.out.println("fim");

    }

}

resultado :

as duas condições são verdadeiras

Uma duas condições são é verdadeiras

fim

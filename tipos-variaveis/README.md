Tudo em Java é orientada em objeto



ANATOMIA DA CLASSE:  basicamente consolida o aspecto estrutural 

99% COMEÇA COM

public class MinhaClass{

// CODIGO AQUI

}

Por padrão as todas as classes, as primeiras letras tem que ser MAIUSCULA

O METODO MAIN: uma caracteristica única PADRAO,

public class MinhaClass{

public static void main (String [] args) {

	System.out.print ("mensagem");

}

}

System: Classe que tem funçao de input (in) e Print (out)

Toda classe precisa exister dentro do src no diretorio com As primeiras letras MAIUSCULA

sempre .java

Denner.java, DennerHenrique.java



NOME DE VARIAVEL:

Toda variavel de ser escrito com letra minuscula, as palavras composta a segunda é MAIUSCULA exemplo: dennerHenrique

o nome dessa pratica para nomear as variaveis dessa forma se chama "camelCase".

para declarar uma variável não podemos utilizar caracteres,números e simbolos, porem devemos seguir algumas regras  de linguagem.

pode conter apenas :

letras,

_ (underline),

$

ou os numeros de 0 a 9

deve obrigatoriamente se iniciar por uma letra (preferencialmente),

_ (underline),

ou

$





JAMAIS COM NUMERO

NAO PODE CONTER ESPAÇOS

Não podemos usar palavas-chave da linguagem

O nome deve ser único dentro de um esboço

exemplo 

int numero$um = 1;

int numero1 = 1;

int numeroum = 1;



para declarar uma Variavel

Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)



public class MinhaClasse {



public static void main (String [ ] args ) {

	String meuNome = "Denner";	

	int anoFabricacao = 2022;

	boolean verdadeira = false;

	anoFabricacao = 2018;

}

}

string (tipo)

meuNome (NomeBemDefinido)

int (tipo inteiro)

boolean (tipo para valores logicos) sim/não verdadeiro/falso



Declarando METODOS

TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)



int somar (int numeroUm,  int numero2 )

String formatarCep (long cep)

para realizar uma soma no minino dos parametros, todos os metodos em java, precisa ser aplicado no infinitivo , (somar, fomatar, arquivar, incluir)



public class MinhaClasse {

public static void main (String [] args) {

    String primeiroNome = "Denner";

    String segundoNome = "Henrique";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

    System.out.println(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String segundoNome) {

    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

} 

    

}



return paralavra reservada

concat metodo concatenar

todo metrodo tem sem parametro





INDENTAÇÃO

termo para escrever o codigo do programa de forma hierarquica



public class BoletimEstudantil {

    public static void main(String [] args) {

        int mediaFinal = 10;

        if(mediaFinal<6)

            System.out.println("REPROVADO");

        else if (mediaFinal==6)

            System.out.println("PROVA MINERVA");

        else

            System.out.println("APROVADO");

        

    }

}

JAVA BENS

atraves de conveçoes, formas de escritas com clareza e definição nos arquivos, variaveis e metodos.



Tipos Primitivos em Java

int, byte, short, long, float, double e char

esses tipos não são considerados objetos, e portanto represente valores brutos , armazanado na pila de memoria 

int, byte, short, long , para NUMEROS , 

float, double , para partes FRACIONAIS ,



CONSTANTES

são valores que nao pode ser modificada, sempre em CAIXA ALTA

para garantir sempre colocar um 

tipo final



OPERADORES

ARITMÉTICOS

UNÁRIOS

RELACIONAIS

LÓGICO

TERNÁRIO





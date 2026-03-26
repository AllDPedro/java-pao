public class Aula5 {

    public static void main(String[] args){
        // variaveis são bons para definir informações ou chamadas especificas.
        // var login = "admin";
        // var password = "00000";
        // var number1 = false;

        // variaveis -> tipo: Textos (Strings)
        // variaveis -> tipo: Numeros (Int)
        // variaveis -> tipo: Numeros fracionados (Double)
        // variaveis -> tipo: booleanas (verdadeiro | falso)

        // TIPOS DE DADOS
        // utilizado em versões antigas de java teria que declarar a referencia "String + nome"
        // tipo nomeDaReferencia = conteudoDaReferencia;
        String login = "Ola"; // Representação de Texto (ASCII)
        int number1 = 10; // Representação de numeros inteiros
        double percent = 24.30; // Representação de numeros fracionados
        boolean IsDrive = true ; // Representação booleana (estado verdadeiro | falso)
        boolean eMotorista = false; // Representação booleana (estado verdadeiro | falso)

        // definindo nome e tipo
        int number; // DECALRANDO VARIAVEL
        number = 55;
        System.out.println(number + 10);

        System.out.println(number1);
        number1 = 30;

        System.out.println(login);
        System.out.println(number1);
        System.out.println(percent);
        System.out.println(IsDrive);
        System.out.println(eMotorista);

        // variaveis
        // SAO ESPAÇOS DE MEMORIA ALOCADO (REPRESENTADO POR TIPOS)

        // TESTES PESSOAIS :

        String nome;
        nome = "Allan Delon.";
        int idade;
        idade = 26;
        boolean estuda;
        estuda = true;
        boolean trabalho;
        trabalho = false;
        double dinheiro;
        dinheiro = 0.1;
        System.out.println("Qual o seu nome?" + " " + nome +  " " + "Qual sua idade?" + " " + idade + " " +
                "Você estuda?" + " " + estuda + " " + "Já tem algum emprego?" + " " + trabalho
                + " " + "Tem dinheiro?" + " " + dinheiro);
        
    }

}

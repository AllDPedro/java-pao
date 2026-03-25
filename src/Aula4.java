public class Aula4 {

    public static void main(String[] args){
        // chamando variavel minhaInstrucaoDeImprimir
        // armazenar propriedades e variaveis
        minhaInstrucaoDeImprimir();
        System.out.println(2 + 2);
        System.out.println("Texto");
        System.out.println(20 / 10);
    }
    // aqui defini variavel com static void
    static void minhaInstrucaoDeImprimir() {
        System.out.println("Ola mundo estamos na aula 4");
         //colocar antes no public static void 'minhaInstrucaoDeImprimir" +
         //"e depois definir" "'static void 'minhaInstrucaoDeImprimir' cria a variavel");
    }
    // comentarios // -> são uteis para indicar comentarios/notas nos projetos
    // ponto de entrada - entry-point -> é o ponto onde todos os sistemas procuram no seu projeto
    // para começar a iniciar o projeto
    // metodos: sao instruções que define para o programa executar . Exemplo:
    // instrucao chamada System.out.println("")
    // propriedades/variaveis -> será onde iremos armazenar dados para o futuro
}

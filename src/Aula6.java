public class Aula6 {

    public static void main(String[] args){
        // 2 TIPOS DE ERROS
        // ERRO DE COMPILAÇÃO =  procurar variavel que não foi adicionada.
        // PARA COMPILAR BASTA DAR javac "nome-do-arquivo".java

        // .java -> .class
        double number1 = 10.45;
        System.out.println(number1);

        // ERRO DE EXECUÇÃO
        // ONDE ELE TENTA DIVIDIR POR ZERO
        int x = 10;
        int y = 0;
        System.out.println(x / y);
    }

}

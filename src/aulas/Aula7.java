import java.util.Random;
public class Aula7 {

    public static void main(String[] args){
        calc(10, 15);
    }

    // static void "função" -> declaraão padrão
    // calc -> NOME DA FUNÇÃO (poderia ser qualquer coisa)
    // () -> PARENTESES USAMOS PARA DEFINIR O QUE CHEGARA NAQUELA FUNÇÃO
    // (tipo nomeDaVariavel)
    // {} -> bloco do código que será executada

    static void calc(int x, int y){
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

    }

}

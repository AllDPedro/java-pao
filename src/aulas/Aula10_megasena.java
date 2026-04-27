import java.util.Random;


        // Gerador de números da mega sena.
public class Aula10_megasena {

    public static void main(String[] args){
        // criar um numero aleatorio no windows
        Random generate = new Random();

        // o while é para usar um numero especifico ou infinito
//        int i = 0;
//        // while (true) -> infinito usando i para por  um limite menor < ou maior > que o numero desejado
//        while(i < 6) {
//            int number = generate.nextInt(60);
//            System.out.println(number);
//            // i++ para fazer até o numero selecionado no  while
//            i++;
//          }

        // o for é para iniciar e declarar as condições desejadas.
        for(int i = 0; i < 6; i++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}

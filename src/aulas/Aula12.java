import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        String name = scanner.nextLine();
        System.out.println("Olá, " + name);
// A aula foi até essa parte em cima.

        System.out.println("Me diga sua idade:");
        String idade = scanner.nextLine();
        System.out.println("Você tem " + idade + " anos");


        System.out.println("Me diga onde você mora:");
        String local = scanner.nextLine();
        System.out.println("Você é de, " + local);
    }


}

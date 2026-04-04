public class Aula9 {

    public static void main( String[] args){
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        // no public static  void main defini como chamar a função.

        if(args[0].equals("somar")){
            sum(x, y);
        }
        else if(args[0].equals("subtrair")){
            minus(x, y);
        }
        else if(args[0].equals("dividir")){
            div(x, y);
        }
        else if(args[0].equals("multiplicar")){
            mult(x,y);
        }
        else {
            System.out.println("Nenhuma instrucao definida, use somar/subtrair/dividir/multiplicar.");
        }
    }
    // no static void define os nomes das variaveis e, o que cada 1 delas fazem.

    static void sum(int x, int y){
        System.out.println(x + y);
    }

    static void minus(int x, int y){
        System.out.println(x - y);
    }

    static void div(int x, int y){
        System.out.println(x / y);
    }

    static void mult(int x, int y){
        System.out.println(x * y);
    }
}

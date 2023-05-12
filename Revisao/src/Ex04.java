import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int numero = entrada.nextInt();

        inverteNumero(numero);
    }

    public static void inverteNumero(int numero){
        String auxiliar = Integer.toString(numero);

        for(int i = auxiliar.length() - 1; i >= 0; i--){
            System.out.print(auxiliar.charAt(i));
        }
    }
}

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int numero = entrada.nextInt();

        if(numero%5 == 0 && numero%7 == 0){
            System.out.println("O numero e multiplo de 5 e 7.");
        } else System.out.println("O numero nao e multiplo de 5 e 7");
    }
}

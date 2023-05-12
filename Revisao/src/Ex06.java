import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Integer> listaNumeros = new ArrayList<>();

        int soma = 0;

        for(int i = 0; i < 20; i++){
            System.out.println("Digite o  " + (i+1) + " numero:");
            listaNumeros.add(entrada.nextInt());
            soma = soma + listaNumeros.get(i);
        }

        System.out.println("\nA soma total dos numeros lidos e " + soma);
    }
}

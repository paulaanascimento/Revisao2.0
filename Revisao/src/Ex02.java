import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Double> salarios = new ArrayList<>();

        System.out.println("Quantos salarios deseja adicionar a lista?");
        int quantidade = entrada.nextInt();

        double media = 0;

        for(int i = 0; i < quantidade; i++){
            System.out.println("Digite o " + (i+1) + " salario: ");
            salarios.add(entrada.nextDouble());
            media = media + salarios.get(i);
        }

        media = media/salarios.size();

        System.out.printf("\nA media salarial e R$%.2f\n", media);
    }
}

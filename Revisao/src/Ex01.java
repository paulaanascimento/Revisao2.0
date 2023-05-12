import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ex01 {
    public static void main(String[] args) {

        List<String> genero = new ArrayList<>();
        List<Double> altura = new ArrayList<>();

        genero.add("feminino");
        genero.add("masculino");
        genero.add("masculino");
        genero.add("feminino");
        genero.add("feminino");
        genero.add("feminino");
        genero.add("masculino");
        genero.add("feminino");
        genero.add("masculino");
        genero.add("feminino");

        altura.add(1.70);
        altura.add(1.82);
        altura.add(1.77);
        altura.add(1.60);
        altura.add(1.41);
        altura.add(1.65);
        altura.add(1.70);
        altura.add(1.80);
        altura.add(1.90);
        altura.add(1.56);

        double maiorAltura = altura.get(0);
        double menorAltura = altura.get(0);

        for(int i = 0; i < altura.size(); i++){
            if(altura.get(i) < menorAltura){
                menorAltura = altura.get(i);
            }
            if(altura.get(i) > maiorAltura){
                maiorAltura = altura.get(i);
            }
        }

        double mediaAlturaHomens = 0;
        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;

        for(int i = 0; i < genero.size(); i++){
            if(Objects.equals(genero.get(i), "masculino")){
                quantidadeHomens++;
                mediaAlturaHomens = mediaAlturaHomens + altura.get(i);
            }

            if(Objects.equals(genero.get(i), "feminino")){
                quantidadeMulheres++;
            }
        }

        mediaAlturaHomens = mediaAlturaHomens/quantidadeHomens;

        System.out.printf("Maior altura: %.2f\n", maiorAltura);
        System.out.printf("Menor altura: %.2f\n", menorAltura);
        System.out.printf("Altura media dos homens: %.2f\n", mediaAlturaHomens);
        System.out.println("Quantidade de mulheres: " + quantidadeMulheres);

    }
}

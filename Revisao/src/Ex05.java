import java.util.ArrayList;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {

        for(int i = 100; i <=150; i++){
            if(somarDigitos(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean somarDigitos(int numero){
        String auxiliar = Integer.toString(numero);
        List<Integer> numerosLista = new ArrayList<>();

        int soma = 0;

        for(int i = 0; i < auxiliar.length(); i++){
            numerosLista.add((int) auxiliar.charAt(i) - '0');
            soma = soma + numerosLista.get(i);
        }

        return soma % 2 == 0;
    }
}

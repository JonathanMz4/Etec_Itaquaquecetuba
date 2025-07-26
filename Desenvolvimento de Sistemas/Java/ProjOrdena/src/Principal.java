
import java.util.Arrays;


public class Principal {

    
    public static void main(String[] args) {
        int[] numeros = {7,2,5,1};
        String[] nomes = {"Fernando", "João", "Gustavo"};
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(nomes));
        //Ordenação pelo método sort
        Arrays.sort(numeros);
        Arrays.sort(nomes);
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(nomes));
    }
    
}

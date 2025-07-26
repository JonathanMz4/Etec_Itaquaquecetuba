
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Principal {

    
    public static void main(String[] args) {
        // Criação da lista dinâmica
        List<String> nomes = new ArrayList<>();
        // Como inserir elementos na lista
        nomes.add("Felipe");
        nomes.add("Ana");
        nomes.add("Eduardo");
        // Exibir a lista
        System.out.println(nomes);
        String nm="Eduardo";
        // Percorrer A lista
        for(int i=0;i<nomes.size();i++){
            if (nomes.get(i).equals(nm)){
                nomes.remove(i);
            }
        }
        // Ordenar a Lista
        //Collections.sort(nomes);
        System.out.println(nomes);
        
    }
    
}

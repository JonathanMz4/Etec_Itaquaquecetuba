
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        // Trabalhando com vetores estáticos: Array
        String[] nome = new String[10];
        for(int i=0;i<10;i++){
            nome[i]=JOptionPane.showInputDialog("Digite o "+(i+1)+" nome");
        }
        for(int i=0;i<10;i++){
            System.out.println((i+1)+" nome : "+nome[i]);
        }
        // trabalhando com vetores dinâmicos:
        List<String> lista = new ArrayList<>();
        lista.add("Joao");
        lista.add("Felipe");
        lista.add("Gabriel");
        lista.add("Mateus");
        // Exibir a lista
        System.out.println(lista);
        // Exibir a lista pelos índices
        for(int j=0;j<lista.size();j++){
            System.out.println(lista.get(j));
        }
        // Excluindo um registro
        String nm="Gabriel";
        for(int a=0;a<lista.size();a++){
            if(lista.get(a).equals(nm)){
                lista.remove(a);
            }
        }
        System.out.println(lista);
        // Ordenando a lista
        Collections.sort(lista);
        System.out.println(lista);
    }
    
}


import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
        String nome_pes;
        int ano_nas;
        int idade;
        nome_pes=JOptionPane.showInputDialog("Nome da pessoa: ");
        ano_nas=Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento: "));
        idade=2023-ano_nas;
        System.out.println(nome_pes+" sua idade e de: "+idade);
        
    }
    
}

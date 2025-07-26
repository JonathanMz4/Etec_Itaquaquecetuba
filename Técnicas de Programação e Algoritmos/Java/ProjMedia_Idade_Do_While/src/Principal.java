
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int idade, soma_idade = 0, contador = 0, op;
        double media_idade;
        
        do{
            contador++;
            idade=Integer.parseInt(JOptionPane.showInputDialog("Idade do "+contador+" Aluno"));
            soma_idade+=idade;
            op=Integer.parseInt(JOptionPane.showInputDialog("Outro Aluno? 1-Sim, 2-Não"));
        }while(op==1);
        media_idade=soma_idade/contador;
        JOptionPane.showMessageDialog(null, "Número de Alunos: "+contador+", média de idades "+media_idade);
    }
    
}

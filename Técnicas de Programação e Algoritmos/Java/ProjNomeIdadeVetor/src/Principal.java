
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int i;
        String[] nome = new String[10];
        int[] idade = new int[10];
        for(i=0;i<10;i++){
            nome[i] = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+" aluno");
            idade[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do "+(i+1)+" aluno"));
        }
        for(i=0;i<10;i++){
            System.out.println("Aluno: "+nome[i]+", idade: "+idade[i]);
        }
    }
    
}

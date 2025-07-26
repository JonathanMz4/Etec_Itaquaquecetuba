
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        double n1,n2,media;
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua primeira nota:"));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua segunda nota:"));
        media = (n1+n2)/2;
        if (media<3) {
            JOptionPane.showMessageDialog(null, "Aluno está Reprovado com média de: "+media);
        }
        else{
            if (media<7) {
                JOptionPane.showMessageDialog(null,"Aluno precisa de Exame com média de: "+media);
            }
            else {
                JOptionPane.showMessageDialog(null, "Aluno está aprovado com média de: "+media);
            }
        }
    }
    
}


import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        double not1;
        double not2;
        double media;
        not1=Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
        not2=Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
        media=(not1+not2)/2;
        if (media>=7){
            JOptionPane.showMessageDialog(null, "Aluno está aprovado com média de: "+media);
        }
        else {
            JOptionPane.showMessageDialog(null, "Aluno está reprovado com média de: "+media);
        }
    }
    
}

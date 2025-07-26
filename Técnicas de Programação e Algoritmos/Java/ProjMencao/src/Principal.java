
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        String mencao;
        double aulas, faltas, porcen;
        mencao=JOptionPane.showInputDialog("Digite a sua mencao (I, R, B, MB): ");
        aulas=Double.parseDouble(JOptionPane.showInputDialog("Digite quantas aulas voce teve: "));
        faltas=Double.parseDouble(JOptionPane.showInputDialog("Digite quantas faltas voce teve: "));
        porcen = Math.round((faltas/100)/aulas*10000);
        if (mencao.equals("I")||(porcen>75)) {
            JOptionPane.showMessageDialog(null,"O aluno esta Reprovado com média de "+mencao+" e porcentagem de falta de "+porcen);
        }
        else {
            JOptionPane.showMessageDialog(null, "O aluno esta Aprovado com média de "+mencao+" e porcentagem de falta de "+porcen);
        }
        
    }
    
}

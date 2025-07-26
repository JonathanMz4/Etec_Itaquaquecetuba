
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
       // Criação de Variáveis
       double not1;
       double not2;
       double not3;
       double not4;
       double medianot;
       // Entrada de Dados
       not1=Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
       not2=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
       not3=Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
       not4=Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));
       // Cálculo da média das notas a partir da entrada de dados
       medianot = (not1+not2+not3+not4)/4;
       // Exibir a média das notas
       JOptionPane.showMessageDialog(null, "A média das notas é: "+medianot);
    }
    
}

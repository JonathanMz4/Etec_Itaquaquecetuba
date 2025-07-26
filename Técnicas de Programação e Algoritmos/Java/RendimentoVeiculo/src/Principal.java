
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        // Criação de Variáveis
        double precomb;
        double valabast;
        double kmper;
        double litabast;
        double kmporl;
        // Entrada de Dados
        precomb=Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Combustível"));
        valabast=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor abastecido"));
        kmper=Double.parseDouble(JOptionPane.showInputDialog("Digite a kilometragem percorrida"));
        // Cálculo da kilometragem percorrida por litro a partir da entrada dos dados
        litabast=valabast/precomb;
        kmporl=kmper/litabast;
        // Exibição de Dados
        JOptionPane.showMessageDialog(null,"O seu veiculo tem um redimento de "+kmporl+" km por litro");
    }
    
}


import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        // Definição de Variáveis
        String nomefunc;
        double salfunc;
        double tempfunc;
        double novosalfunc;
        // Entrada dos Dados
        nomefunc=JOptionPane.showInputDialog("Digite o seu nome");
        salfunc=Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
        tempfunc=Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de serviço"));
        // Decisão Condicional e Cálculo dos Dados
        if (tempfunc>=20){
            novosalfunc=salfunc*0.10+salfunc;
            JOptionPane.showMessageDialog(null, nomefunc+" ,o seu salário de "+salfunc+" foi reajustado para: "+novosalfunc);
        }
        else {
            novosalfunc=salfunc*0.05+salfunc;
            JOptionPane.showMessageDialog(null, nomefunc+" ,o seu salário de "+salfunc+" foi reajustado para: "+novosalfunc);
        }
        
    }
    
}

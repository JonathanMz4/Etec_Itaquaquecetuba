
import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
        // Criação de Variáveis
        String nomefunc;
        double salbase;
        double valhoraext;
        double horasext;
        double desconto;
        double horaextra;
        double sal;
        // Entrada de Dados
        nomefunc=JOptionPane.showInputDialog("Digite o seu nome");
        salbase=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu Salário Base"));
        valhoraext=Double.parseDouble(JOptionPane.showInputDialog("Digite quanto você ganha por uma hora extra"));
        horasext=Double.parseDouble(JOptionPane.showInputDialog("Digite quantas Horas Extra você fez esse mês"));
        desconto=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que foi descontado do seu salário"));
        // Cálculo do Salário Final a partir da entrada de dados
        horaextra=horasext*valhoraext;
        sal=salbase+horaextra-desconto;
        // Exibição do Salário Final
        JOptionPane.showMessageDialog(null,nomefunc+", o seu salário liquido é de: "+sal);
    }
    
}

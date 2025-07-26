
import javax.swing.JOptionPane;



public class Principal {

    
    public static void main(String[] args) {
        String nome_func;
        double sal_func;
        int tempo_func;
        nome_func=JOptionPane.showInputDialog("Nome do funcionario: ");
        sal_func=Double.parseDouble(JOptionPane.showInputDialog("Salario: "));
        tempo_func=Integer.parseInt(JOptionPane.showInputDialog("Tempo na Empresa"));
        System.out.println("Nome: "+nome_func+" Salario: "+sal_func+" Tempo: "+tempo_func);
        
    }
    
}

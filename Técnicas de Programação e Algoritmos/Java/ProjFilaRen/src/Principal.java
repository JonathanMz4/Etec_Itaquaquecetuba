
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        double idade,renda,ano;
        String nome;
        JOptionPane.showMessageDialog(null, "Ola, seja bem vindo ao atendimento de filas");
        nome=(JOptionPane.showInputDialog("Digite o seu nome: "));
        ano=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu ano de nascimento: "));
        renda=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua renda mensal: "));
        idade = 2023-ano;
        if (idade<60 && renda<=1300){
            JOptionPane.showMessageDialog(null, "Senhor(a) "+nome+" com idade de "+idade+", a sua fila e normal e você ganhou uma cesta basica");
        }
        else {
            if (idade<60 && renda>1300){
                JOptionPane.showMessageDialog(null, "Senhor(a) "+nome+" com idade de "+idade+", a sua fila e normal e você ganhou um vale leite");
            }
            else {
                if (idade<80 && renda<=1300){
                    JOptionPane.showMessageDialog(null, "Senhor(a) "+nome+" com idade de "+idade+", a sua fila e prioritaria e você ganhou uma cesta basica");
                }
                else {
                    if (idade<80 && renda>1300){
                        JOptionPane.showMessageDialog(null, "Senhor(a) "+nome+" com idade de "+idade+", a sua fila e prioritaria e você ganhou um vale leite");
                    }
                    else {
                        if (idade>80 && renda<=1300) {
                            JOptionPane.showMessageDialog(null, "Senhor(a) "+nome+" com idade de "+idade+", a sua fila e especial e você ganhou uma cesta basica");
                        }
                        else {
                            if (idade>80 && renda>1300){
                                JOptionPane.showMessageDialog(null, "Senhor(a) "+nome+" com idade de "+idade+", a sua fila e especial e você ganhou um vale leite");
                            }
                        }
                    }
                }
            }
        }
    }
    
}

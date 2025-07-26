
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int acertos = 0;
        int erros = 0;
        int resp;
        JOptionPane.showMessageDialog(null, "Olá, seja bem-vindo ao quiz, responda com sim ou não");
        resp=Integer.parseInt(JOptionPane.showInputDialog("A Lenovo é dona da Motorola? Digite 1 para Sim e 2 para Não"));
        if (resp==1){
            acertos++;
        }
        else{
            erros++;
        }
        resp=Integer.parseInt(JOptionPane.showInputDialog("O VS code é a IDE mais usada? Digite 1 para Sim e 2 para Não"));
        if (resp==1){
            acertos++;
        }
        else{
            erros++;
        }
        resp=Integer.parseInt(JOptionPane.showInputDialog("O Elon Musk é a pessoa mais rica do mundo? Digite 1 para Sim e 2 para Não"));
        if (resp==2){
            acertos++;
        }
        else{
            erros++;
        }
        resp=Integer.parseInt(JOptionPane.showInputDialog("Foi Guido van Rossum que criou a linguagem Python? Digite 1 para Sim e 2 para Não"));
        if (resp==1){
            acertos++;
        }
        else{
            erros++;
        }
        resp=Integer.parseInt(JOptionPane.showInputDialog("Foi Markus Persson que fundou a Mojang? Digite 1 para Sim e 2 para Não"));
        if (resp==1){
            acertos++;
        }
        else{
            erros++;
        }
        if (acertos==5){
            JOptionPane.showMessageDialog(null, "Você teve " +acertos+ " acertos e tirou MB");
        }
        else{
            if (acertos>=3){
                JOptionPane.showMessageDialog(null, "Você teve " +acertos+ " acertos e tirou B");
            }
            else{
                if (acertos>=1){
                    JOptionPane.showMessageDialog(null, "Você teve " +acertos+ " acertos e tirou R");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Você teve " +acertos+ " acertos e tirou I");
                }
            }
        }
    }
    
}

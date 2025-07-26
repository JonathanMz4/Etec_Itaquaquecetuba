
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int dia;
        String mensagem = "";
        dia=Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana de (0 a 6), sabendo que "
                + "0=Domingo, 1=Segunda:"));
        switch (dia){
            case 0:
                mensagem = "Domingo";
                break;
            case 1:
                mensagem = "Segunda";
                break;
            case 2:
                mensagem = "Terça";
                break;
            case 3:
                mensagem = "Quarta";
                break;
            case 4:
                mensagem = "Quinta";
                break;
            case 5:
                mensagem = "Sexta";
                break;
            case 6:
                mensagem = "Sábado";
                break;
            default:
                JOptionPane.showMessageDialog(null,"Número Inválido");
                break;
        }
        if (!mensagem.equals("")){
            JOptionPane.showMessageDialog(null, "Hoje é: "+mensagem);
        }
    }
    
}

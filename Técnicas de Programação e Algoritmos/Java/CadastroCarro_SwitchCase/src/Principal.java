
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        String marca,meslicen="";
        int ano, placa, finalplac;
        double tempouso;
        ano=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu veículo: "));
        placa=Integer.parseInt(JOptionPane.showInputDialog("Digite a placa do seu veículo: "));
        finalplac=Integer.parseInt(JOptionPane.showInputDialog("Digite o número final da placa do seu veículo: "));
        marca=(JOptionPane.showInputDialog("Digite a marca do seu veículo: "));
        switch (finalplac){
            case 0:
                meslicen = "Dezembro";
                break;
            case 1:
                meslicen = "Abril";
                break;
            case 2:
                meslicen = "Maio";
                break;
            case 3:
                meslicen = "Junho";
                break;
            case 4:
                meslicen = "Julho";
                break;
            case 5,6:
                meslicen = "Agosto";
                break;
            case 7:
                meslicen = "Setembro";
                break;
            case 8:
                meslicen = "Outubro";
                break;
            case 9:
                meslicen = "Novembro";
                break;
            default:
                JOptionPane.showMessageDialog(null,"Número Inválido");
                break;
                
        }
        tempouso=2023-ano;
        if (!meslicen.equals("")){
        JOptionPane.showMessageDialog(null,"O seu carro da "+marca+", do ano de "+ano+", com placa de número "+placa+", tem o tempo de uso de "+tempouso+" anos e precisa licenciar no mês de "+meslicen);
        }
    }
    
}


import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        double idade, contador = 0, notafilm, op, perc, media, somaid = 0, otimo = 0, regular = 0, ruim = 0, outros = 0, pestotal;
        
        do{
            contador++;
            notafilm=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota para o filme, 1-Ótimo 2-Bom 3-Regular 4-Ruim 5-Péssimo"));
            idade=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua idade"));
            if (notafilm==1) {
                otimo++;
            }
            else {
                if (notafilm==3) {
                    regular++;
                }
                else {
                    if (notafilm==4) {
                        ruim++;
                        somaid+=idade;
                    }
                    else {
                        outros++;
                    }
                }
            }
            op=Double.parseDouble(JOptionPane.showInputDialog("Outro Entrevistado? 1-Sim, 2-Não"));
        }while(op==1);
        media=somaid/ruim;
        pestotal=outros+ruim+otimo+regular;
        perc=Math.round((regular/pestotal)*100);
        JOptionPane.showMessageDialog(null, "O número de pessoas que acharam o filme ótimo foi de: "+otimo);
        JOptionPane.showMessageDialog(null,"O percentual de pessoas que acharam o filme regular foi de: "+perc+"%");
        JOptionPane.showMessageDialog(null,"A média de idade das pessoas que acharam o filme ruim foi de: "+media);
    }
    
}
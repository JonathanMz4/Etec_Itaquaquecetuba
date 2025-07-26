
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        double numres, mascu, femin, rendafam=0, media, totalmascu=0, totalfemin=0, op, contadorfam=0, totalres=0, totalrenda=0, percm, percf;
        
        do{
           contadorfam++;
           numres=Double.parseDouble(JOptionPane.showInputDialog("Quantas pessoas tem na sua casa? "));
           mascu=Double.parseDouble(JOptionPane.showInputDialog("Quantas pessoas do Sexo Masculino tem na sua casa? "));
           femin=Double.parseDouble(JOptionPane.showInputDialog("Quantas pessoas do Sexo Feminino tem na sua casa? "));
           rendafam=Double.parseDouble(JOptionPane.showInputDialog("Qual é sua renda familiar total? "));
           op=Double.parseDouble(JOptionPane.showInputDialog("Outra Família Entrevistada? 1-Sim, 2-Não"));
           totalmascu+=mascu;
           totalfemin+=femin;
           totalres+=numres;
           totalrenda+=rendafam;
        }while(op==1);
        percm=(totalmascu/totalres)*100;
        percf=(totalfemin/totalres)*100;
        media=totalrenda/contadorfam;
        JOptionPane.showMessageDialog(null,"O total de residentes no bairro é: "+totalres);
        JOptionPane.showMessageDialog(null, "O total de pessoas do Sexo Masculino é: "+totalmascu+" e o percentual é: "+percm);
        JOptionPane.showMessageDialog(null, "O total de pessoas do Sexo Feminino é: "+totalfemin+" e o percentual é: "+percf);
        JOptionPane.showMessageDialog(null,"A renda familiar média do bairro é: "+media);
    }
    
}
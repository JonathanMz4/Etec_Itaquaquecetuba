
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int verifica=0,i,pergreg,resp;
        String pernome;
        int[]reg = {1,2,3,4,5,6,7,8,9,10};
        String[]nome = {"A","B","C","D","E","F","G","H","I","J"};
        double[]sal = {1000,2000,3000,4000,5000,6000,7000,8000,9000,10000};
        JOptionPane.showMessageDialog(null, "Bem-vindo ao banco de dados dos funcionarios!");
        resp=Integer.parseInt(JOptionPane.showInputDialog("Você deseja: \n"
                    + "1- Buscar por Registro \n"
                    + "2- Buscar por Nome \n"
                    + "0- Sair \n"));
        switch (resp){
            case 0:
                break;
            case 1:
                pergreg=Integer.parseInt(JOptionPane.showInputDialog("Digite o registro: "));
                for(i=0;i<10;i++){
                    if (pergreg==reg[i]){
                        JOptionPane.showMessageDialog(null,"O nome e: "+nome[i]+", o salario e: "+sal[i]+" e o registro e: "+reg[i]);
                    }
                    if (verifica==0){
                        JOptionPane.showMessageDialog(null,"O registro não existe");
                    }
                }
                break;
            case 2:
                pernome=JOptionPane.showInputDialog("Digite o nome: ");
                for(i=0;i<10;i++){
                    if (pernome.equals(nome[i])){
                        JOptionPane.showMessageDialog(null,"O nome e: "+nome[i]+", o salario e: "+sal[i]+" e o registro e: "+reg[i]);
                    }
                    if (verifica==0){
                        JOptionPane.showMessageDialog(null,"O nome não existe");
                    }
                }
                break;
        }
    }
    
}

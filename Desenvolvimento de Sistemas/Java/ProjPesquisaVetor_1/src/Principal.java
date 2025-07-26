
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int op,i,pergreg=0,op1;
        String pernome="";
        int[]reg = {1,2,3,4,5,6,7,8,9,10};
        String[]nome = {"A","B","C","D","E","F","G","H","I","J"};
        double[]sal = {1000,2000,3000,4000,5000,6000,7000,8000,9000,10000};
        JOptionPane.showMessageDialog(null, "Bem-vindo ao banco de dados dos funcionarios!");
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Você deseja: \n"
                    + "1- Buscar por Registro \n"
                    + "2- Buscar por Nome \n"
                    + "0- Sair \n"));
            if (op==1){
                pergreg=Integer.parseInt(JOptionPane.showInputDialog("Digite o registro: "));
            }
            else {
                if (op==2){
                    pernome=JOptionPane.showInputDialog("Digite o nome: ");
                }
            }
            for(i=0;i<10;i++){
                if (pergreg==reg[i]){
                    System.out.println("O nome e: "+nome[i]+", o salario e: "+sal[i]+" e o registro e: "+reg[i]);
                }
                else {
                    if (pernome.equals(nome[i])){
                        System.out.println("O nome e: "+nome[i]+", o salario e: "+sal[i]+" e o registro e: "+reg[i]);
                    }
                }
            }
            op1=Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? 1-Sim 2-Não"));
        }while(op1==1);
    }
    
}
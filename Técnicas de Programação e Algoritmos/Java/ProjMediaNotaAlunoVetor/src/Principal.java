
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int i;
        int[] nota1 = new int[6];
        int[] nota2 = new int[6];
        for(i=0;i<6;i++){
            nota1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota do "+(i+1)+" aluno"));
            nota2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota do "+(i+1)+" aluno"));
        }
        for(i=0;i<6;i++){
            System.out.println("Aluno de nota 1: "+nota1[1]+", nota 2: "+nota2[1]+" e com media de "+(nota1[i]+nota2[i])/2);
        }
    }
    
}

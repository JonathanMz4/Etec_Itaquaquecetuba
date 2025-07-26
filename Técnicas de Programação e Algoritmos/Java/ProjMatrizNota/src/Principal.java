
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        double[][]notas = new double[2][4];
        int i,j;
        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                notas[i][j]=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "+(j+i)+" do "+(i+1)+" aluno"));
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                System.out.print(notas[i][j]+"");
            }
            System.out.print("");
        }
    }
    
}

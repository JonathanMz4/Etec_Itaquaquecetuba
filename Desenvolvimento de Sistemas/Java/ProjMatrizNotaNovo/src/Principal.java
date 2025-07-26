import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        double[][]notas = new double[2][4];
        double[][]media = new double[2][1];
        String[]nome = new String[2];
        double soma=0,soma1=0;
        int i,j;
        for(i=0;i<1;i++){
            nome[0]=JOptionPane.showInputDialog("Digite o nome do aluno");
        }
        for(i=0;i<1;i++){
            nome[1]=JOptionPane.showInputDialog("Digite o nome do aluno");
        }
        for(i=0;i<1;i++){
            for(j=0;j<4;j++){
                notas[0][j]=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "+(j+i)+" do "+(i+j)+" aluno"));
                soma+=notas[0][j];
            }
        }
        for(i=0;i<1;i++){
            for(j=0;j<4;j++){
                notas[1][j]=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "+(j+i)+" do "+(i+j)+" aluno"));
                soma1+=notas[1][j];
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                JOptionPane.showMessageDialog(null,"Aluno "+nome[0]+", as suas notas são: "+notas[0][0]+", "+notas[0][1]+", "+notas[0][2]+", "+notas[0][3]+", a media das notas é "+(media[i][j]=(soma/4)));
                JOptionPane.showMessageDialog(null,"Aluno "+nome[1]+", as suas notas são: "+notas[1][0]+", "+notas[1][1]+", "+notas[1][2]+", "+notas[1][3]+", a media das notas é "+(media[i][j]=(soma1/4)));
            }
        }
    }
}

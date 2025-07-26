
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        double num1,num2,num3,acertos = 0;
        JOptionPane.showMessageDialog(null, "Olá, seja bem-vindo ao jogo de Loteria, digite 3 numeros de 1 a 10!");
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o 1 numero: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 numero: "));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite o 3 numero: "));
        num1=Math.round(Math.random()*10);
        num2=Math.round(Math.random()*10);
        num3=Math.round(Math.random()*10);
        if(num1==n1 || num1==n2 || num1==n3){
            acertos++;
        }
        if(num2==n1 || num2==n2 || num2==n3){
            acertos++;
        }
        if(num3==n1 || num3==n2 || num3==n3){
            acertos++;
        }
        JOptionPane.showMessageDialog(null, "Numeros Escolhidos "+n1+" "+n2+" "+n3+
                "\nNumeros Sortedos: "+num1+" "+num2+" "+num3+
                "\nAcertos: "+acertos);
    }
    
}

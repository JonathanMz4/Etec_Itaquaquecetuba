
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        double a,b,c,x1,x2;
        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo a Calculadora de Equacao de 2 Grau");
        a=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        b=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        c=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
        x1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        x2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        JOptionPane.showMessageDialog(null, x1);
        JOptionPane.showMessageDialog(null, x2);
    }
    
}

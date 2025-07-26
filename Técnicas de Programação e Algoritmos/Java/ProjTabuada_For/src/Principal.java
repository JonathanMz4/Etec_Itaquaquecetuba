
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int i;
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número de 1 a 10: "));
        // Escrever a tabuada do número 5
        for (i=1;i<=10;i++) {
            System.out.println("5x"+i+"="+(5*i));
        }
        // Escrever a tabuada do número que o usuário digitou
        for (i=1;i<=10;i++) {
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
    
}


import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int idade;
        String nome;
        idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
        nome=JOptionPane.showInputDialog("Digite o seu nome: ");
        if (idade<=60) {
            JOptionPane.showMessageDialog(null,"Senhor "+nome+", a sua fila é normal");
        }
        else{
            if (idade<=80){
                JOptionPane.showMessageDialog(null, "Senhor "+nome+", a sua fila é prioritária");
            }
            else{
                JOptionPane.showMessageDialog(null, "Senhor "+nome+", a sua fila é especial");
            }
        }
    }
    
}

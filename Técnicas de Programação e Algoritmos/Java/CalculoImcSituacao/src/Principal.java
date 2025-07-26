
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        String nome;
        double peso, altura, imc;
        nome=JOptionPane.showInputDialog("Digite o seu nome ");
        peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso "));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura (com ponto) "));
        imc=peso/(altura*altura);
        if (imc<18.5){
            JOptionPane.showMessageDialog(null, nome+", o seu IMC de "+imc+" e abaixo do peso");
        }
        else{
            if (imc<24.9){
                JOptionPane.showMessageDialog(null,nome+", o seu IMC de "+imc+" e normal");
            }
            else{
                if (imc<29.9){
                    JOptionPane.showMessageDialog(null, nome+", o seu IMC de "+imc+" e sobrepeso");
                }
                else{
                    if (imc<39.9){
                        JOptionPane.showMessageDialog(null,nome+", o seu IMC de "+imc+" e obesidade");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,nome+", o seu IMC de "+imc+" e obesidade morbida");
                    }
                }
            }
        }
    }
    
    
}

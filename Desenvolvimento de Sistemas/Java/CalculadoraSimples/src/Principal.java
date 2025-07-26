
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        double n1,n2,op,soma,sub,mul,div;
        String operacao;
        
        JOptionPane.showMessageDialog(null,"Seja bem-vindo a Calculadora do Jon!"); 
        do{
            n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            n2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));    
            operacao=JOptionPane.showInputDialog("Qual operação deseja realizar?"
                    + "+ - * /");
            if (operacao.equals("+")){
                soma=n1+n2;
                JOptionPane.showMessageDialog(null,"O Resultado é: "+soma);
            }
            else{
                if (operacao.equals("-")){
                    sub=n1-n2;
                    JOptionPane.showMessageDialog(null,"O Resultado é: "+sub);
                }
                else{
                    if (operacao.equals("*")){
                        mul=n1*n2;
                        JOptionPane.showMessageDialog(null,"O Resultado é: "+mul);
                    }
                    else{
                        if (operacao.equals("/")){
                            div=n1/n2;
                            JOptionPane.showMessageDialog(null,"O Resultado é: "+div);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Não foi possível realizar, verifique se tem algo errado!");
                        }
                    }
                }
            }
            op=Double.parseDouble(JOptionPane.showInputDialog("Deseja Continuar? 1-Sim 2-Não:"));
        }while(op==1);
    }
    
}

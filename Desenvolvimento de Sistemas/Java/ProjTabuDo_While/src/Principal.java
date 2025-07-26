
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int num=5,num1,i=0,i1=0;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 10: "));
        do{
            System.out.println("5x"+i+"="+(num*i));
            i++;
        }while(i<=10);
        do{
            System.out.println(num1+"x"+i1+"="+(num1*i1));
            i1++;
        }while(i1<=10);
    }
    
}


import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        double sal;
        double i;
        double media;
        double soma=0;
        
        for (i=1;i<=10;i++) {
            sal=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário dos funcionários"));
            soma+=sal;
        }
        media=soma/10;
        System.out.println("A media dos salarios e: "+media);
    }
    
}


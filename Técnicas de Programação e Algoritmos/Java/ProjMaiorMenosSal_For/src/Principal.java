
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        double i;
        double sal;
        double menor=10000;
        double maior=0;
        
        for (i=1;i<=10;i++) {
            sal=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite os salarios dos funcionarios: "));
            if (sal>maior) {
                maior=sal;
            }
            if (sal<menor) {
                menor=sal;
            }
        }
        System.out.println("O salario mais alto e "+maior+" e o menor e "+menor);
    }
    
}

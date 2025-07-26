
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        Numeros num = new Numeros();
        
        System.out.println(num.Calcular(5, 10, 15));
        System.out.println(num.Calcular(2, 2));
        System.out.println(num.Calcular(5, 5, 5, 10));
    }
    
}

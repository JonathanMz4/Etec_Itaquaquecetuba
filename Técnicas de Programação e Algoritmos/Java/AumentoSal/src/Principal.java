
public class Principal {

    
    public static void main(String[] args) {
        // Definição das Variáveis
        String nome1= "Joao";
        String nome2= "Maria";
        String nome3= "Pedro";
        String nome4= "Gabriel";
        String nome5= "Daniel";
        double sal1 = 3460.76;
        double sal2 = 2532.53;
        double sal3 = 1567.89;
        double sal4 = 5679.74;
        double sal5 = 7592.53;
        double nsal1;
        double nsal2;
        double nsal3;
        double nsal4;
        double nsal5;
        // Cálculo dos Reajustes dos Salários
        nsal1= (sal1*0.10)+sal1;
        nsal2= (sal2*0.10)+sal2;
        nsal3= (sal3*0.10)+sal3;
        nsal4= (sal4*0.10)+sal4;
        nsal5= (sal5*0.10)+sal5;
        // Exibição de Dados
        System.out.println("Senhor "+nome1+" seu salario de "+sal1+" foi reajustado para "+nsal1);
        System.out.println("Senhora "+nome2+" seu salario de "+sal2+" foi reajustado para "+nsal2);
        System.out.println("Senhor "+nome3+" seu salario de "+sal3+" foi reajustado para "+nsal3);
        System.out.println("Senhor "+nome4+" seu salario de "+sal4+" foi reajustado para "+nsal4);
        System.out.println("Senhor "+nome5+" seu salario de "+sal5+" foi reajustado para "+nsal5);
    }
    
}

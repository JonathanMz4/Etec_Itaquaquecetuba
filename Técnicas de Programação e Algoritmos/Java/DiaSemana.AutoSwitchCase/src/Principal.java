
import java.util.Date;
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        Date data = new Date();
        int dia_mes=data.getDate();
        int dia_semana=data.getDay();
        int mes=data.getMonth();
        int ano=data.getYear();
        String month="";
        String dia_week="";
        System.out.println(dia_mes);
        System.out.println(dia_semana);
        System.out.println(mes);
        System.out.println(ano+1900);
        switch (dia_semana){
            case 0:
                dia_week = "Domingo";
                break;
            case 1:
                dia_week = "Segunda";
                break;
            case 2:
                dia_week = "Terça";
                break;
            case 3:
                dia_week = "Quarta";
                break;
            case 4:
                dia_week = "Quinta";
                break;
            case 5:
                dia_week = "Sexta";
                break;
            case 6:
                dia_week = "Sábado";
                break;
        }
        switch (mes) {
            case 1:
                month = "Janeiro";
                break;
            case 2:
                month = "Fevereiro";
                break;
            case 3:
                month = "Março";
                break;
            case 4:
                month = "Abril";
                break;
            case 5:
                month = "Maio";
                break;
            case 6:
                month = "Junho";
                break;
            case 7:
                month = "Julho";
                break;
            case 8:
                month = "Agosto";
                break;
            case 9:
                month = "Setembro";
                break;
            case 10:
                month = "Outubro";
                break;
            case 11:
                month = "Novembro";
                break;
            case 12:
                month = "Dezembro";
                break;
        }
        JOptionPane.showMessageDialog(null,"Hoje, "+dia_week+", "+dia_mes+" de "+month+" de "+(ano+1900));
    }
    
}

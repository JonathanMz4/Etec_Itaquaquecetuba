
public class Horista extends Funcionario {
    
    public double valorhora;
    public double numhoras;
    
    public double CalSalario(){
        return this.valorhora*numhoras; 
    }
}

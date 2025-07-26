
public class Mensalista extends Funcionario {
    
    public double salliq;
    public double descontos;
    
    public double CalSalario(){
        return this.salliq-descontos; 

    }
}

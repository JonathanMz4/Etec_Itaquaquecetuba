
public class Funcionario {
    
    
    public String nome;
    public int registro;
    private double salbruto;
    private double descontos;
    
    public double getSalbruto(){
        return this.salbruto;
    }
    public void setSalbruto(double salbruto){
        this.salbruto=salbruto;
    }
    public double getDesconto(){
        return this.descontos;
    }
    public void setDesconto(double descontos){
        this.descontos=descontos;
    }
    
}


public class Funcionario {
    
    private int registro;
    private String nome;
    private double salario;
    
    public Funcionario(int reg,String nm, double sal){
        this.nome=nm;
        this.salario=sal;
        this.registro=reg;
    }
    
    public int getRegistro(){
        return this.registro;
    }
    public void setRegistro(int registro){
        this.registro=registro;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public String toString() {
        return "funcionario "+"registro = "+registro+", nome = "+nome+", salario = "+salario;
    }
}

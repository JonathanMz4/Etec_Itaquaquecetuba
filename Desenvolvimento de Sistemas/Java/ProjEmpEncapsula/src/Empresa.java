
public class Empresa {
    
    public String nome;
    private String cnpj;
    private int num_emp;
    private double valor_patr;
    
    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }
    public int getNumemp(){
        return this.num_emp;
    }
    public void setNumemp(int num_emp){
        this.num_emp=num_emp;
    }
    public double getValorpatr(){
        return this.valor_patr;
    }
    public void setValorpatr(double valor_patr){
        this.valor_patr=valor_patr;
    }
}

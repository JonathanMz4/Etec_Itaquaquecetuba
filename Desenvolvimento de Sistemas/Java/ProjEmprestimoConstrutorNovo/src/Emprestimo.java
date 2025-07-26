
public class Emprestimo {
    
    public double valor;
    public int numparcelas;
    public int nparcelas;
    private double valmaximo;
    private double prazomaximo;
    
    public double getValmaximo(){
        return this.valmaximo;
    }
    public void setValmaximo(double valmaximo){
        this.valmaximo=valmaximo;
    }

    public double getPrazomaximo(){
        return this.prazomaximo;
    }
    public void setPrazomaximo(double prazomaximo){
        this.prazomaximo=prazomaximo;
    }
    
    public Emprestimo(double vm,double pm){
        this.valmaximo=vm;
        this.prazomaximo=pm;
    }
}


public class Empresa {
    private String nome;
    private double preco;
    private double quantidade;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;
    }
    
    public void Cadastrar(String nm, double pc, double qntd){
        this.nome=nm;
        this.preco=pc;
        this.quantidade=qntd;
    }
    public void limpar() {
        this.nome = "";
        this.preco = 0;
        this.quantidade = 0;
    }
    public double Calcularavista(){
        double total = this.preco*this.quantidade;
        double result = total-(total)*0.10;
        
        return result;
    }
    public double Calcularaprazo(){
        double total = this.preco*this.quantidade;
        double result = (total)*0.10+total;
        
        return result;
    }
}

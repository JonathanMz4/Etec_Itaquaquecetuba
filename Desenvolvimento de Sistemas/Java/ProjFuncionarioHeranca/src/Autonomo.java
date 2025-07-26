
public class Autonomo extends Funcionario {
    
    public double totvendas;
    public double percvendas;
    
    public double CalSalario(){
        return this.totvendas*percvendas/100; 
    }
}

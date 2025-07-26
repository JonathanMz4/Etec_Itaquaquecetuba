
public class CasaPropria extends Moradia {
    
    public double iptu;
    public double seguro;
    
    public double CalImposto(){
        return this.iptu/12;
    }
    
}

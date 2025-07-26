
public class Moradia extends Pessoa {
    
    public double agua;
    public double internet;
    public double luz;
    public double gas;
    
    public double Total(){
        return this.agua+internet+luz+gas;
    }
}

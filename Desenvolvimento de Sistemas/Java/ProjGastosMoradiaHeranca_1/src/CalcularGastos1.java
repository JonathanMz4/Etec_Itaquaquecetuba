
public class CalcularGastos1 extends CasaPropria {
    
    public double CalTotalGastos(){
        return this.agua+gas+internet+luz+CalImposto()+seguro;
    }
    public double CalSalfinal(){
        return this.salliq-(agua+gas+internet+luz+CalImposto()+seguro);
    }
    
}

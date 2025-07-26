
public class CasaAlugada extends Moradia {
    
    public double aluguel;
    public double manuntencao;
    
    public double CalTotalGastos(){
        return this.Total()+aluguel+manuntencao;
    }
    public double CalSalfinal(){
        return this.salliq-(Total()+aluguel+manuntencao);
    }
}

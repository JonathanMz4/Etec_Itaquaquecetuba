
public class CalcularGastos2 extends CasaAlugada {
    
    public double CalTotalGastos(){
        return this.agua+gas+internet+luz+aluguel+manuntencao;
    }
    public double CalSalfinal(){
        return this.salliq-(agua+gas+internet+luz+aluguel+manuntencao);
    }
}

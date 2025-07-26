
public class Votacao {
    
    private String cand1 = "Saque";
    private String cand2 = "Tiririca";
    private String cand3 = "Marco";
    private String cand4 = "Bolsonaro";
    private String cand5 = "Chaves";
    private int nv1 = 0;
    private int nv2 = 0 ;
    private int nv3 = 0 ;
    private int nv4 = 0 ;
    private int nv5 = 0 ;
    private int ttlvotos = 0;
    private double perc1 = 0;
    private double perc2 = 0;
    private double perc3 = 0;
    private double perc4 = 0;
    private double perc5 = 0;
    
    public String getCand1(){
        return this.cand1;
    }
    public void setCand1(String cand1){
        this.cand1=cand1;
    }
    public String getCand2(){
        return this.cand2;
    }
    public void setCand2(String cand2){
        this.cand2=cand2;
    }
    public String getCand3(){
        return this.cand3;
    }
    public void setCand3(String cand3){
        this.cand3=cand3;
    }
    public String getCand4(){
        return this.cand4;
    }
    public void setCand4(String cand4){
        this.cand4=cand4;
    }
    public String getCand5(){
        return this.cand5;
    }
    public void setCand5(String cand5){
        this.cand5=cand5;
    }
    
    public int getNv1(){
        return this.nv1;
    }
    public void setNv1(int nv1){
        this.nv1=nv1;
    }
    public int getNv2(){
        return this.nv2;
    }
    public void setNv2(int nv2){
        this.nv2=nv2;
    }
    public int getNv3(){
        return this.nv3;
    }
    public void setNv3(int nv3){
        this.nv3=nv3;
    }
    public int getNv4(){
        return this.nv4;
    }
    public void setNv4(int nv4){
        this.nv4=nv4;
    }
    public int getNv5(){
        return this.nv5;
    }
    public void setNv5(int nv5){
        this.nv5=nv5;
    }
    
    public int getTtlvotos(){
        return this.ttlvotos;
    }
    public void setTtlvotos(int ttlvotos){
        this.ttlvotos=ttlvotos;
    }
    
    public void voto1(){
        nv1++;
        ttlvotos++;
    }
    public void voto2(){
        nv2++;
        ttlvotos++;
    }
    public void voto3(){
        nv3++;
        ttlvotos++;
    }
    public void voto4(){
        nv4++;
        ttlvotos++;
    }
    public void voto5(){
        nv5++;
        ttlvotos++;
    }
    
    public double getPerc1(){
        if(ttlvotos>0){
            perc1=nv1*100 / ttlvotos;
        }
        return this.perc1;
    }
    public void setPerc1(double perc1){
        this.perc1=perc1;
    }
    public double getPerc2(){
        if(ttlvotos>0){
            perc2=nv2*100 / ttlvotos;
        }
        return this.perc2;
    }
    public void setPerc2(double perc2){
        this.perc2=perc2;
    }
    public double getPerc3(){
        if(ttlvotos>0){
            perc3=nv3*100 / ttlvotos;
        }
        return this.perc3;
    }
    public void setPerc3(double perc3){
        this.perc3=perc3;
    }
    public double getPerc4(){
        if(ttlvotos>0){
            perc4=nv4*100 / ttlvotos;
        }
        return this.perc4;
    }
    public void setPerc4(double perc4){
        this.perc4=perc4;
    }
    public double getPerc5(){
        if(ttlvotos>0){
            perc5=nv5*100 / ttlvotos;
        }
        return this.perc5;
    }
    public void setPerc5(double perc5){
        this.perc5=perc5;
    }
}


public class Numeros {
    
    public int Calcular(int n1,int n2,int n3){
        return Math.max(Math.max(n1, n2), n3);
    }
    public double Calcular(double n1,double n2){
        return Math.pow(n1, n2);
    }
    public double Calcular(int n1,int n2,int n3,int n4){
        int soma;
        soma=n1+n2+n3+n4;
        return Math.sqrt(soma);
    }
}

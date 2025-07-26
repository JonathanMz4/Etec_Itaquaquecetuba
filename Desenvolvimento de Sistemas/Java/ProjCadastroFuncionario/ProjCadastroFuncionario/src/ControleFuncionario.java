
import java.util.List;
import java.util.ArrayList;


public class ControleFuncionario {
    
    List<Funcionario> func = new ArrayList<Funcionario>();
    
    public void cadastrarFunc(int reg,String nm,double sal) {
        Funcionario funcionario = new Funcionario(reg,nm,sal);
        func.add(funcionario);
    }
    
    public List<Funcionario> listarFunc() {
        return func;
    }
    
    public void limparFunc() {
        func.clear();
    }
}


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class ControleAluno {
    
    Connection conexao;
    PreparedStatement sql;
    Statement comando;
    ResultSet lista;
    Aluno aluno = new Aluno();
    
    public void Conexao(){
        try{
            int idade=Integer.parseInt(JOptionPane.showInputDialog(" Idade: "));
            JOptionPane.showMessageDialog(null, idade);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas Numeros!!!");
        }
    }
    public void Cadastrar(int rgm, String nome, double nota1, double nota2){
        aluno.setNome(nome);
        aluno.setRgm(rgm);
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);
    }
    public void Listar(){
        
    }
}

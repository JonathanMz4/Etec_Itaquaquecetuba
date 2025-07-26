
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Controle {
    
    Connection conexao;
    Statement comando;
    PreparedStatement sql;
    ResultSet lista;
    
    Usuario usuario = new Usuario();
    Adm adm = new Adm();
    public void VerificaAdm(){
        String log_aut=JOptionPane.showInputDialog("Login do ADM: ");
        int sen_aut=Integer.parseInt(JOptionPane.showInputDialog("Senha do ADM: "));
        if (log_aut.equals(adm.log_adm)&&(sen_aut==adm.senha_adm)){
            Cadastrar();
        }
        else{
            JOptionPane.showMessageDialog(null,"Dados do ADM Incorretos!!");
        }
    }
    public void Cadastrar(){
        String login=JOptionPane.showInputDialog("Login do Usuario: ");
        int senha=Integer.parseInt(JOptionPane.showInputDialog("Senha do Usuario: "));
        try{
            usuario.setLogin(login);
            usuario.setSenha(senha);
            sql=conexao.prepareStatement("Inset into usuarios (login,senha) values (?,?)");
            sql.setString(1, usuario.getLogin());
            sql.setInt(2, usuario.getSenha());
            int verifica=sql.executeUpdate();
            if (verifica>0){
                JOptionPane.showInputDialog("Usuário Cadastrado !!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro de acesso ao BD!!");
        }
    }
    public void Autenticar(String log, int sen){
        try{
            sql=conexao.prepareStatement("select login,senha from usuarios where login=? & senha=?");
            sql.setString(1, log);
            sql.setInt(2, sen);
            lista=sql.executeQuery();
            if (lista.next()){
                JOptionPane.showMessageDialog(null,"Usuário Autenticado");
            }
            else{
                JOptionPane.showMessageDialog(null,"Login/Senha Incorretos");
            }
        }
        catch(Exception e){
            
        }
    }
}

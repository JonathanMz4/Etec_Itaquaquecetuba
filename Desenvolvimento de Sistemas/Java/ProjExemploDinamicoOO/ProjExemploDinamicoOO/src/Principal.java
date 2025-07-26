
import java.util.ArrayList;
import java.util.List;


public class Principal {

    
    public static void main(String[] args) {
        // Criando a lista direcionada a classe Aluno
        List<Aluno> aluno = new ArrayList<Aluno>();
        // Adicionando elementos na lista: o Construtor é chamado
        // Recebendo os dados e repassando aos atributos
        aluno.add(new Aluno("Ana",18));
        aluno.add(new Aluno("Rita",25));
        aluno.add(new Aluno("Carlos",37));
        // Listando os registros
        for (Aluno al:aluno){
            System.out.println(al.getNome()+" "+al.getIdade());
        }
    }
    
}

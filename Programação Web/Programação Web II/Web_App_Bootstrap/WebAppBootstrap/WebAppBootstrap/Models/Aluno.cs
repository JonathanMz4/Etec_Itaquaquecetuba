using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebAppBootstrap.Models
{
    public class Aluno
    {
        public int Id { get; set; }
        public DateTime DataDeNascimento { get; set; }
        public int NomeDoAluno { get; set; }
        public int NumeroDoTelefone { get; set; }
        public int NomeDaEscola { get; set; }
        public int NomeDoProfessor { get; set; }

    }
}
